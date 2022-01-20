package chat.qiye.wechat.sdk.api.material.resp;

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
 * @date  : 2021/7/1
 */
@Getter
@Setter
@ToString
public class UploadResp  extends RespStatus implements Serializable {

  /**
   * type
   */
  @JsonProperty("type")
  private String type;

  /**
   * mediaId
   */
  @JsonProperty("media_id")
  private String mediaId;

  /**
   * createdAt
   */
  @JsonProperty("created_at")
  private String createdAt;
}
