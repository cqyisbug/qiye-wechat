package chat.qiye.wechat.sdk.api.school.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@NoArgsConstructor
@Data
public class ParentDto {

  /**
   * parentUserid
   */
  @JsonProperty("parent_userid")
  private String parentUserid;

  /**
   * mobile
   */
  @JsonProperty("mobile")
  private String mobile;

  /**
   * toInvite
   */
  @JsonProperty("to_invite")
  private Boolean toInvite;

  /**
   * children
   */
  @JsonProperty("children")
  private List<ChildrenDto> children;
}
