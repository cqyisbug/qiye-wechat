package chat.qiye.wechat.sdk.api.contact.resp;

import chat.qiye.wechat.sdk.api.contact.vo.TagVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TagListResp extends RespStatus implements Serializable {

  private List<TagVo> taglist;
}
