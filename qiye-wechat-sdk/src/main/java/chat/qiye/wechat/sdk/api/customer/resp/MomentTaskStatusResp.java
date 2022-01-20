package chat.qiye.wechat.sdk.api.customer.resp;

import chat.qiye.wechat.sdk.api.customer.dto.MomentTaskStatusDto;
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
 * @date  : 2021/6/30
 */
@Getter
@Setter
@ToString
public class MomentTaskStatusResp   extends RespStatus implements Serializable {

  /**
   * nextCursor
   */
  @JsonProperty("next_cursor")
  private String nextCursor;

  /**
   * taskList
   */
  @JsonProperty("task_list")
  private List<MomentTaskStatusDto> taskList;
}
