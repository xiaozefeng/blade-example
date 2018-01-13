package com.gz.example.webhook;

import com.blade.ioc.annotation.Bean;
import com.blade.mvc.hook.Signature;
import com.blade.mvc.hook.WebHook;
import com.blade.mvc.http.Request;

/**
 * @author xiaozefeng
 */
@Bean
public class MyHook implements WebHook {
    @Override
    public boolean before(Signature signature) {
        Request request = signature.request();
        String uri = request.uri();
        System.out.println("请求钩子 >>>"+request.method() + "\t uri= "+uri);
        return true;
    }
}
