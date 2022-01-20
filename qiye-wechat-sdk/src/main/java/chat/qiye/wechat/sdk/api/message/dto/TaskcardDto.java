package chat.qiye.wechat.sdk.api.message.dto;

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
public class TaskcardDto {

  /**
   * title
   */
  @JsonProperty("title")
  private String title;

  /**
   * description
   */
  @JsonProperty("description")
  private String description;

  /**
   * url
   */
  @JsonProperty("url")
  private String url;

  /**
   * taskId
   */
  @JsonProperty("task_id")
  private String taskId;

  /**
   * btn
   */
  @JsonProperty("btn")
  private List<BtnDto> btn;
}
