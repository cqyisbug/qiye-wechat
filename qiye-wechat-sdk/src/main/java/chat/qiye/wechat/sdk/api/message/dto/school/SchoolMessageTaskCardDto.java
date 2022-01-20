package chat.qiye.wechat.sdk.api.message.dto.school;

import chat.qiye.wechat.sdk.api.message.dto.TaskcardDto;
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
public class SchoolMessageTaskCardDto extends SchoolMessageDto {
  /**
   * interactive_taskcard
   */
  @JsonProperty("interactive_taskcard")
  private TaskcardDto interactiveTaskcard;

}
