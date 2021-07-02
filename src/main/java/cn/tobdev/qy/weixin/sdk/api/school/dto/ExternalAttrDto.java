package cn.tobdev.qy.weixin.sdk.api.school.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.common.dto.MiniprogramDto;
import cn.tobdev.qy.weixin.sdk.common.dto.TextDto;
import cn.tobdev.qy.weixin.sdk.common.dto.WebDto;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@NoArgsConstructor
@Data
public class ExternalAttrDto {
  /**
   * type
   */
  @JsonProperty("type")
  private Integer type;

  /**
   * name
   */
  @JsonProperty("name")
  private String name;

  /**
   * text
   */
  @JsonProperty("text")
  private TextDto text;

  /**
   * web
   */
  @JsonProperty("web")
  private WebDto web;

  /**
   * miniprogram
   */
  @JsonProperty("miniprogram")
  private MiniprogramDto miniprogram;
}
