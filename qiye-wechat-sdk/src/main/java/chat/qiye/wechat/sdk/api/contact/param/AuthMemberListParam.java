package chat.qiye.wechat.sdk.api.contact.param;

import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/5
 */
@Data
public class AuthMemberListParam implements Serializable {
  /**
   * 上一次调用时返回的next_cursor，第一次拉取可以不填
   */
  private String cursor;

  /**
   * 每次拉取的数据量，默认值和最大值都为1000
   */
  private Integer limit;

}
