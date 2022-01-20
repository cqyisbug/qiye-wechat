package chat.qiye.wechat.sdk.api.school.param;

import chat.qiye.wechat.sdk.api.school.dto.ParentDto;
import lombok.Data;

import java.util.Set;

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
