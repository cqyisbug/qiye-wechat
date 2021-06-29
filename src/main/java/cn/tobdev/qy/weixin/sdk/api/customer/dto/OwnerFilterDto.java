package cn.tobdev.qy.weixin.sdk.api.customer.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/29
 */
@NoArgsConstructor
@Data
public class OwnerFilterDto {
  /**
   * useridList
   */
  @JsonProperty("userid_list")
  private List<String> useridList;
}
