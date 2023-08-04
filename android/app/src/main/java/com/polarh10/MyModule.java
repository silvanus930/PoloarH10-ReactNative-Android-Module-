package com.polarh10;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import android.content.Intent;

public class MyModule extends ReactContextBaseJavaModule {
  private final ReactApplicationContext reactContext;

  MyModule(ReactApplicationContext context) {
    super(context);
    reactContext = context;
  }

  @Override
  public String getName() {
    return "MyModule";
  }

  @ReactMethod
  public void startMyActivity() {
    Intent intent = new Intent(reactContext, SecondActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    reactContext.startActivity(intent);
  }
}
