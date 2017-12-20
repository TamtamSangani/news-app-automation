package com.telegraph.qa.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SharedProperties {

    private String platformName;
    private String automationName;
    private String platformVersion;
    private String deviceName;
    private String appPath;
    private String avd;
    private String realDevice;
    private String iOSUuid;
    private String iosConfigPath;
    private String iosBundleID;
    private String processArguments;
    private String androidPropertiesFile = "android.properties";
    private String iosPropertiesFile = "ios.properties";
    private String jenkinsPropertiesFile = "jenkins.properties";
    private Boolean runJenkins = false;

    public SharedProperties() {getLocalOrJenkinsProperties();}

    private void getLocalPropertiesFile () {
        try {
            FileInputStream fileInput = new FileInputStream(new File(iosPropertiesFile));
            Properties prop = new Properties();
            prop.load(fileInput);

            //Get properties from local properties file
            platformName = prop.getProperty("appium.platformName");
            automationName = prop.getProperty("appium.automationName");
            platformVersion = prop.getProperty("appium.platformVersion");
            deviceName = prop.getProperty("appium.deviceName");
            appPath = prop.getProperty("appium.appPath");
            avd = prop.getProperty("appium.avd");
            realDevice = prop.getProperty("appium.realDevice");
            iOSUuid = prop.getProperty("appium.iosUuid");
            iosConfigPath = prop.getProperty("appium.xcodeConfigFile");
            iosBundleID = prop.getProperty("iosBundleID");
            processArguments = prop.getProperty("appium.processArguments");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getJenkinsPropertiesFile () {
        try {
            FileInputStream fileInput = new FileInputStream(new File(jenkinsPropertiesFile));
            Properties prop = new Properties();
            prop.load(fileInput);

            //These properties change - get properties from terminal
            platformName = System.getProperties().getProperty("appium.platformName");
            automationName = System.getProperties().getProperty("appium.automationName");
            platformVersion = System.getProperties().getProperty("appium.platformVersion");
            deviceName = System.getProperties().getProperty("appium.deviceName");
            appPath = System.getProperties().getProperty("appium.appPath");
            avd = System.getProperties().getProperty("appium.avd");
            realDevice = System.getProperties().getProperty("appium.realDevice");

            //These properties never change - get properties from local file
            iOSUuid = prop.getProperty("appium.iosUuid");
            iosConfigPath = prop.getProperty("appium.xcodeConfigFile");
            iosBundleID = prop.getProperty("iosBundleID");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getLocalOrJenkinsProperties () {
        if (isJenkinsTests()) {
            getJenkinsPropertiesFile();
        } else {
            getLocalPropertiesFile();
        }
    }

    private Boolean isJenkinsTests() {
        if (System.getProperties().getProperty("appium.platformName") !=null)
            runJenkins = true;

        return runJenkins;
    }

    public String getPlatformName() {return platformName;}
    public String getAutomationName() {return automationName;}
    public String getPlatformVersion() {return platformVersion;}
    public String getDeviceName() {return deviceName;}
    public String getAppPath() {return appPath;}
    public String getAvd() {return avd;}
    public String getRealDevice() {return realDevice;}
    public String getIosUuid() {return iOSUuid;}
    public String getIosConfigFile() {return iosConfigPath;}
    public String getIosBundleID() {return iosBundleID;}

    public String getProcessArguments() {
        return processArguments;
    }
}
