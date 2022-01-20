package chat.qiye.wechat.sdk.api.school.resp;

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
 * @date  : 2021/7/3
 */
@Getter
@Setter
@ToString
public class SubscribeModelGetResp extends RespStatus implements Serializable {

  /**
   * subscribe_mode
   */
  @JsonProperty("subscribe_mode")
  private Integer subscribeMode;


}
