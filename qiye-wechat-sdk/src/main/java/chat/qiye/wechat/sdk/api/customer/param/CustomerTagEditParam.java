package chat.qiye.wechat.sdk.api.customer.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/30
 */
@NoArgsConstructor
@Data
public class CustomerTagEditParam {

  /**
   * id
   */
  @JsonProperty("id")
  private String id;

  /**
   * name
   */
  @JsonProperty("name")
  private String name;

  /**
   * order
   */
  @JsonProperty("order")
  private Integer order;

  /**
   * agentid
   */
  @JsonProperty("agentid")
  private Integer agentid;
}
