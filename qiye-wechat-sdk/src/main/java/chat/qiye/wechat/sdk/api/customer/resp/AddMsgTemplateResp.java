package chat.qiye.wechat.sdk.api.customer.resp;

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
public class AddMsgTemplateResp  extends RespStatus implements Serializable {

  /**
   * failList
   */
  @JsonProperty("fail_list")
  private List<String> failList;

  /**
   * msgid
   */
  @JsonProperty("msgid")
  private String msgid;
}
