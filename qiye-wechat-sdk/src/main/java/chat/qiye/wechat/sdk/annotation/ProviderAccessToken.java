package chat.qiye.wechat.sdk.annotation;

import java.lang.annotation.*;

/**
 * 需要 suite_access_token
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface ProviderAccessToken {
}
