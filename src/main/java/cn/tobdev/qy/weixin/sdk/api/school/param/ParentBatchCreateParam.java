package cn.tobdev.qy.weixin.sdk.api.school.param;

import java.util.Set;

import cn.tobdev.qy.weixin.sdk.api.school.dto.ParentDto;
import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@Data
public class ParentBatchCreateParam {
  private Set<ParentDto> parents;
}
