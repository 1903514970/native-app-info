//
//  nativeAppInfo.m
//  HelloWorld
//
//  Created by I-Love-YL on 2019/4/18.
//

#import "nativeAppInfo.h"

@implementation nativeAppInfo
-(void)get:(CDVInvokedUrlCommand*)command{
    NSString *userInfo = @"mlf123123";

    //定义返回值对象pluginResult
    CDVPluginResult* pluginResult =nil;
    if (userInfo && userInfo.length) {
        //有指定值，传递给网页，Status执行状态，messageAsString传递的内容
        pluginResult=[CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:userInfo];
        
    }else{//错误情况
        pluginResult=[CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR messageAsString:@"UnLogin"];
    }
    //将创建的pluginResult返回数据给网页，需要指定command.callbackId
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}
@end
