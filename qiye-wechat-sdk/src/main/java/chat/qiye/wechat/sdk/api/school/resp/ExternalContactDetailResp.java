package chat.qiye.wechat.sdk.api.school.resp;

import chat.qiye.wechat.sdk.api.school.dto.ExternalContactDto;
import chat.qiye.wechat.sdk.api.school.dto.FollowUserDto;
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
 * @date  : 2021/7/3
 */
@Getter
@Setter
@ToString
public class ExternalContactDetailResp  extends RespStatus implements Serializable {

  /**
   * externalContact
   */
  @JsonProperty("external_contact")
  private ExternalContactDto externalContact;

  /**
   * followUser
   */
  @JsonProperty("follow_user")
  private List<FollowUserDto> followUser;
}
