package chat.qiye.wechat.sdk.api.school.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@NoArgsConstructor
@Data
public class ResultListDto {
  /**
   * studentUserid
   */
  @JsonProperty("student_userid")
  private String studentUserid;

  /**
   * errcode
   */
  @JsonProperty("errcode")
  private Integer errcode;

  /**
   * errmsg
   */
  @JsonProperty("errmsg")
  private String errmsg;
}
