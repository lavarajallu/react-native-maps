package com.depoto;

import android.app.Application;
import android.content.Intent; 
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.react.ReactApplication;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.inprogress.reactnativeyoutube.ReactNativeYouTube;
import com.brentvatne.react.ReactVideoPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.reactnative.photoview.PhotoViewPackage;
import com.airbnb.android.react.maps.MapsPackage;


import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
  private static CallbackManager mCallbackManager = CallbackManager.Factory.create();

  protected static CallbackManager getCallbackManager() {
    return mCallbackManager;
  }

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new FBSDKPackage(mCallbackManager),
            new ReactNativeYouTube(),
            new MapsPackage(),
            new PhotoViewPackage() ,
            new ReactVideoPackage(),
            new VectorIconsPackage(),
            new LinearGradientPackage(),
            new SplashScreenReactPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
    //AppEventsLogger.activateApp(this);
  }
}
