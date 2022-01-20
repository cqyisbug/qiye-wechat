package chat.qiye.wechat.sdk.api.contact.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ContactDeptVo implements Serializable {

    private Integer id;

    /**
     * 部门名称。同一个层级的部门名称不能重复。长度限制为1~32个字符，字符不能包括\:?”<>｜
     */
    private String name;

    /**
     * 英文名称。同一个层级的部门名称不能重复。需要在管理后台开启多语言支持才能生效。长度限制为1~32个字符，字符不能包括\:?”<>｜
     */
    @JsonProperty("name_en")
    private String nameEn;

    private Integer parentid;

    private Integer order;
}
