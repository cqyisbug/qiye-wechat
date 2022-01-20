package chat.qiye.wechat.sdk.api.customer.param;

import chat.qiye.wechat.sdk.api.customer.dto.TagSimpleDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/30
 */
@NoArgsConstructor
@Data
public class CustomerTagAddParam {

  /**
   * groupId
   */
  @JsonProperty("group_id")
  private String groupId;

  /**
   * groupName
   */
  @JsonProperty("group_name")
  private String groupName;

  /**
   * order
   */
  @JsonProperty("order")
  private Integer order;

  /**
   * tag
   */
  @JsonProperty("tag")
  private List<TagSimpleDto> tag;

  /**
   * agentid
   */
  @JsonProperty("agentid")
  private Integer agentid;
}
