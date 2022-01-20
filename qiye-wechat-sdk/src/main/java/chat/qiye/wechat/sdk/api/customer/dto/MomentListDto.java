package chat.qiye.wechat.sdk.api.customer.dto;

import chat.qiye.wechat.sdk.common.dto.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/30
 */
@NoArgsConstructor
@Data
public class MomentListDto {
  /**
   * momentId
   */
  @JsonProperty("moment_id")
  private String momentId;

  /**
   * creator
   */
  @JsonProperty("creator")
  private String creator;

  /**
   * createTime
   */
  @JsonProperty("create_time")
  private String createTime;

  /**
   * createType
   */
  @JsonProperty("create_type")
  private Integer createType;

  /**
   * visibleType
   */
  @JsonProperty("visible_type")
  private Integer visibleType;

  /**
   * text
   */
  @JsonProperty("text")
  private TextDto text;

  /**
   * image
   */
  @JsonProperty("image")
  private List<ImageDto> image;

  /**
   * video
   */
  @JsonProperty("video")
  private VideoDto video;

  /**
   * link
   */
  @JsonProperty("link")
  private LinkDto link;

  /**
   * location
   */
  @JsonProperty("location")
  private LocationDto location;
}
