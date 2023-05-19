package com.github.wumke.RNExitApp;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import android.app.Activity;


public class RNExitAppModule extends ReactContextBaseJavaModule {

    ReactApplicationContext reactContext;

    public RNExitAppModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNExitApp";
    }

    @ReactMethod
    public void exitApp() {
        final Activity activity = getCurrentActivity();
        activity.finishAndRemoveTask();
    }
}
