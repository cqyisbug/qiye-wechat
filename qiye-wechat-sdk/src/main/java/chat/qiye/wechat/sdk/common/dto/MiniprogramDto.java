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
public class MiniprogramDto implements Serializable {
  /**
   * title
   */
  @JsonProperty("title")
  private String title;

  /**
   * picMediaId
   */
  @JsonProperty("pic_media_id")
  private String picMediaId;

  /**
   * appid
   */
  @JsonProperty("appid")
  private String appid;

  /**
   * page
   */
  @JsonProperty("page")
  private String page;

  /**
   * pagepath
   */
  @JsonProperty("pagepath")
  private String pagepath;
}
