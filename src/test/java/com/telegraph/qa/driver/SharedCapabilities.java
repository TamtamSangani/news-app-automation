package com.telegraph.qa.driver;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SharedCapabilities {

    private DesiredCapabilities desiredCapabilities;
    private SharedProperties sharedProperties = new SharedProperties();//get properties file response

    public DesiredCapabilities getDesiredCapabilities() {

        switch (sharedProperties.getPlatformName().toLowerCase()){
            case "android":
                desiredCapabilities= getAndroidCapabilities();
                break;
            case "ios":
                desiredCapabilities= getIOSCapabilties();
                break;
            default:
                throw new IllegalArgumentException(sharedProperties.getPlatformName()+ "is unsupported");
        }
        return desiredCapabilities;
    }

    private DesiredCapabilities getIOSCapabilties() {
        setDesiredCapabilities(); //get global capabilities
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, isRealDevice() ? sharedProperties.getIosUuid() : "");
        desiredCapabilities.setCapability(IOSMobileCapabilityType.XCODE_CONFIG_FILE, sharedProperties.getIosConfigFile());
        //desiredCapabilities.setCapability(IOSMobileCapabilityType.PROCESS_ARGUMENTS, sharedProperties.getProcessArguments().toString());
        //desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
        //desiredCapabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, true);
        //desiredCapabilities.setCapability(IOSMobileCapabilityType.SHOW_XCODE_LOG, true);
        return desiredCapabilities;
    }

    private DesiredCapabilities getAndroidCapabilities() {
        setDesiredCapabilities(); //get global capabilities
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AVD, isRealDevice() ? "" : sharedProperties.getAvd());
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "uk.co.telegraph.android.splash.controller.SplashActivity"); //Needed to run on new app
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        return desiredCapabilities;
    }

    //sets capabilities that cover both android and iOS devices
    private void setDesiredCapabilities() {
        desiredCapabilities = new DesiredCapabilities(); //is this needed?
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, sharedProperties.getAutomationName());
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, sharedProperties.getPlatformName());
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, sharedProperties.getPlatformVersion());
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, sharedProperties.getDeviceName());
        desiredCapabilities.setCapability(MobileCapabilityType.APP, sharedProperties.getAppPath());
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
    }

    private boolean isRealDevice() {
        return Boolean.parseBoolean(sharedProperties.getRealDevice());
    }
}
