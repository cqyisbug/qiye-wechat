package chat.qiye.wechat.sdk.api.message.dto.appChat;

import chat.qiye.wechat.sdk.api.message.dto.MessageDto;
import chat.qiye.wechat.sdk.api.message.dto.MpnewsDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
public class MessageMpnewsDto  extends MessageDto {


  /**
   * mpnews
   */
  @JsonProperty("mpnews")
  private MpnewsDto mpnews;

}
