package chat.qiye.wechat.sdk.api.message.dto.school;

import chat.qiye.wechat.sdk.common.dto.TextCardDto;
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
public class SchoolMessageCardDto extends SchoolMessageDto {
  /**
   * text
   */
  @JsonProperty("textcard")
  private TextCardDto textcard;

}
