package chat.qiye.wechat.sdk.api.live;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.live.param.*;
import chat.qiye.wechat.sdk.api.live.resp.*;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppTypeEnum;
import feign.Param;
import feign.RequestLine;

/**
 * 直播
 * <p>
 * https://open.work.weixin.qq.com/api/doc/90000/90135/93633
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */

@QiYeWeChatApi(appType = AppTypeEnum.APP_LIVING)
public interface LivingApi {
    // 创建预约直播
    String API_LIVING_CREATE = "POST /living/create";
    //
    String API_LIVING_UPDATE = "POST /living/modify";
    //修改预约直播
    String API_LIVING_CANCEL = "POST /living/cancel";
    //
    String API_LIVING_DELETE_REPLAY_DATA = "POST /living/delete_replay_data";
    //
    String API_LIVING_GET_LIVING_CODE = "POST /living/get_living_code";
    //
    String API_LIVING_GET_USER_ALL_LIVINGID = "POST /living/get_user_all_livingid";
    //
    String API_LIVING_GET_LIVING_INFO = "POST /living/get_living_info?livingid={livingid}";
    //
    String API_LIVING_GET_WATCH_STAT = "POST /living/get_watch_stat";
    //
    String API_LIVING_GET_LIVING_SHARE_INFO = "POST /living/get_living_share_info";


    @RequestLine(API_LIVING_CREATE)
    LivingCreateResp create(LivingCreateParam param);

    @RequestLine(API_LIVING_UPDATE)
    RespStatus update(LivingUpdateParam param);

    @RequestLine(API_LIVING_CANCEL)
    RespStatus cancel(LivingIdParam param);

    @RequestLine(API_LIVING_DELETE_REPLAY_DATA)
    RespStatus delReplayData(LivingIdParam param);

    @RequestLine(API_LIVING_GET_LIVING_CODE)
    GetLivingCodeResp getLivingCode(GetLivingCodeParam param);

    @RequestLine(API_LIVING_GET_USER_ALL_LIVINGID)
    GetUserAllLivingIdResp getUserAllLivingId(GetUserAllLivingIdParam param);

    @RequestLine(API_LIVING_GET_LIVING_INFO)
    LivingDetailResp getDetail(@Param("livingid") String livingid);

    @RequestLine(API_LIVING_GET_WATCH_STAT)
    GetLivingWatchStatResp getWatchStat(GetLivingWatchStatParam param);

    /**
     * 获取跳转小程序商城的直播观众信息
     *
     * <p>
     * 通过此接口，开发者可获取跳转小程序商城的直播间(“推广产品”直播)观众id、邀请人id及对应直播间id，以打通卖货直播的“人货场”信息闭环。
     * <p>
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/living/get_living_share_info?access_token=ACCESS_TOKEN
     * <p>
     * 请求包体：
     * <p>
     * {
     * "ww_share_code": "CODE"
     * }
     * 参数说明：
     *
     * @param param 参数	必须	说明
     *              access_token	是	调用接口凭证
     *              ww_share_code	是	“推广产品”直播观众跳转小程序商城时会在小程序path中带上ww_share_code=xxxxx参数
     * @return
     */
    @RequestLine(API_LIVING_GET_LIVING_SHARE_INFO)
    GetLivingShareInfoResp getShareInfo(GetLivingShareInfoParam param);


}
