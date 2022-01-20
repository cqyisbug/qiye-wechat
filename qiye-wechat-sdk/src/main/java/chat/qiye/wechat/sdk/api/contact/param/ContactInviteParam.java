package chat.qiye.wechat.sdk.api.contact.param;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/5
 */
@Data
public class ContactInviteParam implements Serializable {
  private List<String> user;
  private List<String> party;
  private List<String> tag;
}
