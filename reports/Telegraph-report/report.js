$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GetStarted.feature");
formatter.feature({
  "line": 1,
  "name": "On-Boarding screen",
  "description": "",
  "id": "on-boarding-screen",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify Registration page is accessibleby selecting \u0027Get Started\u0027 from the on-boarding landing page.",
  "description": "",
  "id": "on-boarding-screen;verify-registration-page-is-accessibleby-selecting-\u0027get-started\u0027-from-the-on-boarding-landing-page.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on landing page of the on-boarding",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Get Started button",
  "keyword": "When "
});
formatter.match({
  "location": "GetStartedSteps.user_is_on_landing_page_of_the_on_boarding()"
});
formatter.result({
  "duration": 2176376763,
  "error_message": "cucumber.runtime.CucumberException: Failed to instantiate class com.telegraph.qa.steps.GetStartedSteps\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:47)\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.getInstance(DefaultJavaObjectFactory.java:33)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\nCaused by: java.lang.reflect.InvocationTargetException\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:41)\n\t... 31 more\nCaused by: org.openqa.selenium.SessionNotCreatedException: Unable to create new remote session. desired capabilities \u003d Capabilities [{app\u003d/Users/sanganit/IdeaProjects/liveTelegraph/ipa/Telegraph.app, newCommandTimeout\u003d120, platformVersion\u003d10.3.3, automationName\u003dXCUITest, xcodeConfigFile\u003d/Users/sanganit/IdeaProjects/liveTelegraph/iosConfig.xcconfig, platformName\u003diOS, udid\u003d074bf798088d97afcb1cde1acf00938a61697d74, deviceName\u003dTamtam\u0027s iPhone}], required capabilities \u003d Capabilities [{}]\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027Tamtam.local\u0027, ip: \u0027172.28.4.30\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: driver.version: SharedDriver\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:91)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:141)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:69)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.execute(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:241)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:128)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:141)\n\tat io.appium.java_client.DefaultGenericMobileDriver.\u003cinit\u003e(DefaultGenericMobileDriver.java:38)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:83)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:93)\n\tat io.appium.java_client.ios.IOSDriver.\u003cinit\u003e(IOSDriver.java:75)\n\tat com.telegraph.qa.driver.SharedDriver.getAppiumDriver(SharedDriver.java:49)\n\tat com.telegraph.qa.screens.GetStartedScreen.\u003cinit\u003e(GetStartedScreen.java:24)\n\tat com.telegraph.qa.steps.GetStartedSteps.\u003cinit\u003e(GetStartedSteps.java:8)\n\t... 36 more\n",
  "status": "failed"
});
formatter.match({
  "location": "GetStartedSteps.user_clicks_on_Get_Started_button()"
});
formatter.result({
  "status": "skipped"
});
});