package cn.tobdev.qy.weixin.sdk.api.customer.resp;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.customer.dto.MomentCommentListDto;
import cn.tobdev.qy.weixin.sdk.api.customer.dto.MomentLikeListDto;
import lombok.Data;
import lombok.NoArgsConstructor;

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
