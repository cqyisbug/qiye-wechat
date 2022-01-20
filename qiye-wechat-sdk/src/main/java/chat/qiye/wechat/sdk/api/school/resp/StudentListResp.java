package chat.qiye.wechat.sdk.api.school.resp;

import chat.qiye.wechat.sdk.api.school.dto.StudentDetailDto;
import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@Getter
@Setter
@ToString
public class StudentListResp  extends RespStatus implements Serializable {
  List<StudentDetailDto> students;
}
