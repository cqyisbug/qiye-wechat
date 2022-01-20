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
public class CustomerTransferResultGetParam {

  /**
   * handoverUserid
   */
  @JsonProperty("handover_userid")
  private String handoverUserid;

  /**
   * takeoverUserid
   */
  @JsonProperty("takeover_userid")
  private String takeoverUserid;

  /**
   * cursor
   */
  @JsonProperty("cursor")
  private String cursor;
}
