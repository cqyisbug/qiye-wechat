package chat.qiye.wechat.sdk.api.customer.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/30
 */
@Getter
@Setter
@ToString
public class CustomerTransferResultResp   extends RespStatus implements Serializable {

  /**
   * customer
   */
  @JsonProperty("customer")
  private List<CustomerDto> customer;

  /**
   * nextCursor
   */
  @JsonProperty("next_cursor")
  private String nextCursor;


  @NoArgsConstructor
  @Data
  public static class CustomerDto {
    /**
     * externalUserid
     */
    @JsonProperty("external_userid")
    private String externalUserid;

    /**
     * status
     */
    @JsonProperty("status")
    private Integer status;

    /**
     * takeoverTime
     */
    @JsonProperty("takeover_time")
    private Integer takeoverTime;
  }

}
