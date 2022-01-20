package chat.qiye.wechat.sdk.annotation;

import java.lang.annotation.*;

/**
 * 方法不需要 access token
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface NoAccessToken {
}
