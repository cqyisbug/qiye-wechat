package chat.qiye.wechat.sdk.api.contact.param;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/5
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GetActiveStatParam extends RespStatus implements Serializable {
  private String date;
}
