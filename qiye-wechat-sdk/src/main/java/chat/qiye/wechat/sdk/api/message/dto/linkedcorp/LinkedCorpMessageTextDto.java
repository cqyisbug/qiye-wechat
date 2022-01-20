package chat.qiye.wechat.sdk.api.message.dto.linkedcorp;

import chat.qiye.wechat.sdk.common.dto.TextDto;
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
public class LinkedCorpMessageTextDto extends LinkedCorpMessageDto {
  /**
   * text
   */
  @JsonProperty("text")
  private TextDto text;

}
