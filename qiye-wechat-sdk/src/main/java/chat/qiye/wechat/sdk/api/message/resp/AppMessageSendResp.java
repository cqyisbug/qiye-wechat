package chat.qiye.wechat.sdk.api.message.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
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
 * @date  : 2021/7/1
 */
@Getter
@Setter
@ToString
public class AppMessageSendResp  extends RespStatus implements Serializable {

  /**
   * invaliduser
   */
  @JsonProperty("invaliduser")
  private String invaliduser;

  /**
   * invalidparty
   */
  @JsonProperty("invalidparty")
  private String invalidparty;

  /**
   * invalidtag
   */
  @JsonProperty("invalidtag")
  private String invalidtag;
}
