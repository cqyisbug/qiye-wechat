package chat.qiye.wechat.sdk.api.school.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@NoArgsConstructor
@Data
public class SubscriberInfoDto {
  /**
   * tagId
   */
  @JsonProperty("tag_id")
  private List<String> tagId;

  /**
   * remarkMobiles
   */
  @JsonProperty("remark_mobiles")
  private List<String> remarkMobiles;

  /**
   * remark
   */
  @JsonProperty("remark")
  private String remark;
}
