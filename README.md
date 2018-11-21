# react-native-maps
--------------------------
This is latest react-native-maps installation procedure both Platforms(iOS &amp; android)

# Installation Procedure
--------------------------
First we need to check the react-native version 
After we will check whether cocoapoads are having or not.
If the cocoapods are having then we will start the steps.

## Step 01:   install this below command
-------------
`npm install react-native-maps@0.19.0 --save`

iOS Installation:
--------------------------
## Step 02: 
Once install this maps module after you will go to `node_modules -> react-native-maps module -> goto lib folder -> go to ios folder ->` then you can drag `AirGoogleMaps` and `AirMaps` folders to our mainProject. 
Note: when you are drag this project just click check mark  click --`if copy items you need` you must click check mark. after you can click finish button

## Step 03: 
goto ios folder then you can create pod file .... 
`pod init` -- this command shows to create podfile
in pod file please add -->  `pod 'GoogleMaps', '2.5.0'`
                            `pod 'Google-Maps-iOS-Utils'`
--> once if we give  or add this lines in pod  file then you can give ---> `pod install` command.
-->
then you can go to ios folder inside appDelegate.m file inside add this line top 
`@import GoogleMaps;`   // add this line using the api key obtained from Google Console

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
{
+  `[GMSServices provideAPIKey:@"_YOUR_API_KEY_"];` // add this line using the api key obtained from Google Console
... 

Here if we dont Api key then we will go to google console Developer API key : 
Adding both Platforms likr iOS and android both are we needed to this things.
then we have get like // `AIzaSyBJOIpbWE1wC0M-dfx1v3iGMT2n5If0kzQ`
---> Finally everything is fine then you can check  and run iOS device....


# android Installation:
------------------------ 

## Step 01: Please follow and add these commands
-----------
###### Define the react-native-maps project in android/settings.gradle:
...
```
include ':react-native-maps:lib'
project(':react-native-maps').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-maps/android/lib'
```

## Step 02: 
-----------
###### Add the react-native-maps as an dependency of your app in android/app/build.gradle:
...
dependencies {
  ...
  
  `
  
    implementation 'com.google.android.gms:play-services-auth:15.0.0'
    
    implementation(project(':react-native-maps')){
         exclude group: 'com.google.android.gms', module: 'play-services-base'
         exclude group: 'com.google.android.gms', module: 'play-services-maps'
     } 
     implementation 'com.google.android.gms:play-services-base:15.0.0'
     
     implementation 'com.google.android.gms:play-services-maps:15.0.0'
     
     
   `
}

## Step 03: 
-----------
###### Specify your Google Maps API Key:

Add your API key to your manifest file (android/app/src/main/AndroidManifest.xml):

<application>
   <!-- You will only need to add this meta-data tag, but make sure it's a child of application -->

   `<meta-data`
        `android:name="com.google.android.geo.API_KEY"`
       `android:value="Your Google maps API Key Here"/>`
     
</application>


## Step 04: 
------------
Add import com.airbnb.android.react.maps.MapsPackage; and new MapsPackage() in your MainApplication.java :

`import com.airbnb.android.react.maps.MapsPackage;`  

    @Override
    protected List<ReactPackage> getPackages() {
        return Arrays.<ReactPackage>asList(
                new MainReactPackage(),
               new MapsPackage()       
        );
    }
  
  
  
  ## Step 05 : Ensure that you have Google Play Services installed:
  --------------
  
  Then you can run emulator if the play services is enable in emulator it will show the map otherwise it will not show. 
  that time you can follow and refer this link: 
  For the Genymotion emulator, you can follow these instructions.
  [instructions](https://www.genymotion.com/help/desktop/faq/#google-play-services)
  
  For a physical device you need to search on Google for 'Google Play Services'. There will be a link that takes you to the   Play Store and from there you will see a button to update it (do not search within the Play Store).



# end





