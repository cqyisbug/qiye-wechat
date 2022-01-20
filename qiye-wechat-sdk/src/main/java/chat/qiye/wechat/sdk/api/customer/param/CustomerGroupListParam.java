package chat.qiye.wechat.sdk.api.customer.param;

import chat.qiye.wechat.sdk.api.customer.dto.OwnerFilterDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerGroupListParam {

    @JsonProperty("status_filter")
    private Integer statusFilter=0;

    @JsonProperty("owner_filter")
    private OwnerFilterDto ownerFilter;

    private String cursor;

    private Integer limit = 1000;
}
