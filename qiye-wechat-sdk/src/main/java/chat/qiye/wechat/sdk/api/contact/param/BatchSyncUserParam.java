package chat.qiye.wechat.sdk.api.contact.param;

import chat.qiye.wechat.sdk.api.contact.vo.CallbackVo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BatchSyncUserParam {

	@JsonProperty("media_id")
	private String mediaId;

	@JsonProperty("callback")
	private CallbackVo callback;

	@JsonProperty("to_invite")
	private boolean toInvite;
}