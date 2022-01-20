package chat.qiye.wechat.sdk.api.customer.param;

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
public class CustomerTransferParam {

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
   * externalUserid
   */
  @JsonProperty("external_userid")
  private List<String> externalUserid;

  /**
   * transferSuccessMsg
   */
  @JsonProperty("transfer_success_msg")
  private String transferSuccessMsg;
}
