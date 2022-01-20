package chat.qiye.wechat.sdk.api.customer.resp;

import chat.qiye.wechat.sdk.api.customer.dto.BehaviorDataDTO;
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
 * @date  : 2021/6/29
 */
@Getter
@Setter
@ToString
public class UserBehaviorDataGetResp extends RespStatus implements Serializable {

  /**
   * behaviorData
   */
  @JsonProperty("behavior_data")
  private List<BehaviorDataDTO> behaviorData;
}
