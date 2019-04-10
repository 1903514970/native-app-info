package com.example.hello.cordova_plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;

/**
 * Created by dengjun on 2019/4/9.
 */

public class NativeAppInfo extends CordovaPlugin {

    @Override
    public boolean execute(String action, String rawArgs, CallbackContext callbackContext) throws JSONException {
        if("get".equals(action)){
            if("userInfo".equals(rawArgs)){
                callbackContext.success("{\"name\":\"dja\",\"token\":\"21312312313\"}");
            }
            return true;
        }
        return super.execute(action, rawArgs, callbackContext);
    }
}
