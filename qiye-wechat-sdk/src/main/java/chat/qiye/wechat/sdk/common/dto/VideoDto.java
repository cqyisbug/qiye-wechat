package chat.qiye.wechat.sdk.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/29
 */
@NoArgsConstructor
@Data
public class VideoDto implements Serializable {
  /**
   * mediaId
   */
  @JsonProperty("media_id")
  private String mediaId;

  /**
   * thumbMediaId
   */
  @JsonProperty("thumb_media_id")
  private String thumbMediaId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;
}
