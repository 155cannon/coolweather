package com.jingyou.coolweather.util;

/**
 * Created by Jing You on 2015/8/17.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
