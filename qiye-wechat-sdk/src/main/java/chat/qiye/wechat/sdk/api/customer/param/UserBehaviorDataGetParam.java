package chat.qiye.wechat.sdk.api.customer.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/29
 */
@NoArgsConstructor
@Data
public class UserBehaviorDataGetParam {

  /**
   * userid
   */
  @JsonProperty("userid")
  private List<String> userid;

  /**
   * partyid
   */
  @JsonProperty("partyid")
  private List<Integer> partyid;

  /**
   * startTime
   */
  @JsonProperty("start_time")
  private Integer startTime;

  /**
   * endTime
   */
  @JsonProperty("end_time")
  private Integer endTime;
}
