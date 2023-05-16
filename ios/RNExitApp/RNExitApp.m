#import <UIKit/UIKit.h>
#import <React/RCTBridgeModule.h>


@interface RNExitApp : NSObject <RCTBridgeModule>
@end

@implementation RNExitApp

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(exitApp)
{
    dispatch_async(dispatch_get_main_queue(), ^{
        [[UIApplication sharedApplication] performSelector:@selector(suspend)];
    });
};

@end
