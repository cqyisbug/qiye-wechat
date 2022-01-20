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
public class CustomerTransferResp   extends RespStatus implements Serializable {

  /**
   * customer
   */
  @JsonProperty("customer")
  private List<CustomerTransferResultDto> customer;


  @NoArgsConstructor
  @Data
  public static class CustomerTransferResultDto {
    /**
     * externalUserid
     */
    @JsonProperty("external_userid")
    private String externalUserid;

    /**
     * errcode
     */
    @JsonProperty("errcode")
    private Integer errcode;
  }
}
