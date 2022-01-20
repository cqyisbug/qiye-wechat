package chat.qiye.wechat.sdk.api.contact.resp;


import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class ContactDeptListResp extends RespStatus implements Serializable {
    /**
     * 部门列表
     */
    private List<ContactDeptVo> department;
}
