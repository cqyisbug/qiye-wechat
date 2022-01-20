package chat.qiye.wechat.sdk.api.school.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@NoArgsConstructor
@Data
public class TagsDto {
  /**
   * groupName
   */
  @JsonProperty("group_name")
  private String groupName;

  /**
   * tagName
   */
  @JsonProperty("tag_name")
  private String tagName;

  /**
   * type
   */
  @JsonProperty("type")
  private Integer type;
}
