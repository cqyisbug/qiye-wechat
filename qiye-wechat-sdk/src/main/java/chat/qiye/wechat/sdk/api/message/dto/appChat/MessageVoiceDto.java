package chat.qiye.wechat.sdk.api.message.dto.appChat;

import chat.qiye.wechat.sdk.api.message.dto.MessageDto;
import chat.qiye.wechat.sdk.common.dto.VoiceDto;
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
public class MessageVoiceDto extends MessageDto {
  /**
   * text
   */
  @JsonProperty("voice")
  private VoiceDto voice;

}
