package com.sobey.cordova_plugins.nativeAppInfo;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;

/**
 * Created by dengjun on 2019/4/9.
 */

public class NativeAppInfo extends CordovaPlugin {

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {
        if("get".equals(action)){
            if("userInfo".equals(args.getString(0))){
                callbackContext.success("{\"name\":\"dja\",\"token\":\"21312312313\"}");
            }
            return true;
        }
        return super.execute(action, args, callbackContext);
    }
}