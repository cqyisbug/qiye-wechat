package chat.qiye.wechat.sdk.api.message.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
public class AppChatUpdateParam extends  AppChatCreateParam{

  /**
   * add_user_list
   */
  @JsonProperty("add_user_list")
  private List<String> addUserList;

  @JsonProperty("del_user_list")
  private List<String> delUserList;


}
