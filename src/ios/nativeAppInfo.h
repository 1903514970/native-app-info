//
//  nativeAppInfo.h
//  HelloWorld
//
//  Created by I-Love-YL on 2019/4/18.
//

#import <Cordova/CDVPlugin.h>

NS_ASSUME_NONNULL_BEGIN

@interface nativeAppInfo : CDVPlugin
-(void)get:(CDVInvokedUrlCommand*)command;
@end

NS_ASSUME_NONNULL_END
