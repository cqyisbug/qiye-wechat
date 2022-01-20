package chat.qiye.wechat.sdk.api.customer.resp;

import chat.qiye.wechat.sdk.api.customer.dto.MomentCommentListDto;
import chat.qiye.wechat.sdk.api.customer.dto.MomentLikeListDto;
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
public class MomentCommentsResp {
  /**
   * commentList
   */
  @JsonProperty("comment_list")
  private List<MomentCommentListDto> commentList;

  /**
   * likeList
   */
  @JsonProperty("like_list")
  private List<MomentLikeListDto> likeList;
}
