package chat.qiye.wechat.sdk.api.message.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

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
public class LinkedCorpMessageSendResp  extends RespStatus implements Serializable {

  /**
   * invaliduser
   */
  @JsonProperty("invaliduser")
  private List<String> invaliduser;

  /**
   * invalidparty
   */
  @JsonProperty("invalidparty")
  private List<String> invalidparty;

  /**
   * invalidtag
   */
  @JsonProperty("invalidtag")
  private List<String> invalidtag;
}
