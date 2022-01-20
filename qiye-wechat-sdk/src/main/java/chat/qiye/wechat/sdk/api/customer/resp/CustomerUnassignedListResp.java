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
 * @date  : 2021/7/1
 */
@Getter
@Setter
@ToString
public class CustomerUnassignedListResp  extends RespStatus implements Serializable {

  /**
   * info
   */
  @JsonProperty("info")
  private List<InfoDto> info;

  /**
   * isLast
   */
  @JsonProperty("is_last")
  private Boolean isLast;

  /**
   * nextCursor
   */
  @JsonProperty("next_cursor")
  private String nextCursor;

  @NoArgsConstructor
  @Data
  public static class InfoDto {
    /**
     * handoverUserid
     */
    @JsonProperty("handover_userid")
    private String handoverUserid;

    /**
     * externalUserid
     */
    @JsonProperty("external_userid")
    private String externalUserid;

    /**
     * dimissionTime
     */
    @JsonProperty("dimission_time")
    private Integer dimissionTime;
  }
}
