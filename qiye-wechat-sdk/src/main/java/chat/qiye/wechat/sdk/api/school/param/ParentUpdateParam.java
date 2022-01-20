package chat.qiye.wechat.sdk.api.school.param;

import chat.qiye.wechat.sdk.api.school.dto.ParentDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ParentUpdateParam extends ParentDto {

  @JsonProperty("new_parent_userid")
  private String newParentUserid;
}
