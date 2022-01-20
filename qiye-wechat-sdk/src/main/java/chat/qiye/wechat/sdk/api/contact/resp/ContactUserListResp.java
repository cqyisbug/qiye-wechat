package chat.qiye.wechat.sdk.api.contact.resp;


import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class ContactUserListResp extends RespStatus implements Serializable {
    /**
     * 用户列表
     */
    private List<ContactUserGetResp> userlist;
}
