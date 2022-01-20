package chat.qiye.wechat.sdk.api.customer.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.common.dto.ImageDto;
import chat.qiye.wechat.sdk.common.dto.LinkDto;
import chat.qiye.wechat.sdk.common.dto.MiniprogramDto;
import chat.qiye.wechat.sdk.common.dto.TextDto;
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
 * @date  : 2021/6/30
 */
@Getter
@Setter
@ToString
public class GroupWelcomeTemplateGetResp   extends RespStatus implements Serializable {


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
