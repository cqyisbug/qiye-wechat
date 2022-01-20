package chat.qiye.wechat.sdk.api.school.resp;

import chat.qiye.wechat.sdk.api.school.dto.ParentDetailDto;
import chat.qiye.wechat.sdk.api.school.dto.StudentDetailDto;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@Getter
@Setter
@ToString
public class StudentOrParentGetResp extends RespStatus implements Serializable {

  public static final int USER_TYPE_STUDENT = 1;

  public static final int USER_TYPE_PARENT = 2;

  /**
   * userType
   */
  @JsonProperty("user_type")
  private Integer userType;

  private StudentDetailDto student;

  private ParentDetailDto parent;

  public  boolean isStudent() {
    return USER_TYPE_STUDENT == userType;
  }
}
