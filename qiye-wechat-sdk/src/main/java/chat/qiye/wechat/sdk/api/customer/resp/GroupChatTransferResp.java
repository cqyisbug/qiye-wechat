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
public class GroupChatTransferResp  extends RespStatus implements Serializable {

  /**
   * failedChatList
   */
  @JsonProperty("failed_chat_list")
  private List<FailedChatListDto> failedChatList;

  @NoArgsConstructor
  @Data
  public static class FailedChatListDto {
    /**
     * chatId
     */
    @JsonProperty("chat_id")
    private String chatId;

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

}
