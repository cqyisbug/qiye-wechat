package chat.qiye.wechat.sdk.api.customer.dto;

import chat.qiye.wechat.sdk.common.dto.ImageDto;
import chat.qiye.wechat.sdk.common.dto.LinkDto;
import chat.qiye.wechat.sdk.common.dto.MiniprogramDto;
import chat.qiye.wechat.sdk.common.dto.TextDto;
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
public class ConclusionsDto implements Serializable {
  /**
   * text
   */
  @JsonProperty("text")
  private TextDto text;

  /**
   * image
   */
  @JsonProperty("image")
  private ImageDto image;

  /**
   * link
   */
  @JsonProperty("link")
  private LinkDto link;

  /**
   * miniprogram
   */
  @JsonProperty("miniprogram")
  private MiniprogramDto miniprogram;
}
