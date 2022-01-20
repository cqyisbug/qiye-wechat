package chat.qiye.wechat.sdk.api.message.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

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
public class AppChatGetResp  extends RespStatus implements Serializable {

  /**
   * chatInfo
   */
  @JsonProperty("chat_info")
  private ChatInfoDto chatInfo;
}
