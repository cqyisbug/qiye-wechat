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
 * @date  : 2021/7/1
 */
@NoArgsConstructor
@Data
public class GroupChatTransferParam {

  /**
   * chatIdList
   */
  @JsonProperty("chat_id_list")
  private List<String> chatIdList;

  /**
   * newOwner
   */
  @JsonProperty("new_owner")
  private String newOwner;
}
