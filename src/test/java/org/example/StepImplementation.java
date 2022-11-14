package org.example;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import java.time.Duration;



public class StepImplementation extends BaseTest {

    @Step("<second> saniye kadar bekle")
    public void waitForSecond(int second) throws InterruptedException {
        Thread.sleep(1000*second);
    }

    @Step("Decline ediyorum butonuna bas")
    public void clickDeclinebutton() throws InterruptedException {
        if (appiumDriver.findElement(By.id("com.m.qr:id/push_consent_decline")).isDisplayed()){
            appiumDriver.findElement(By.id("com.m.qr:id/push_consent_decline")).click();
            logger.info("Decline butonuna tıklandı.");
            waitForSecond(3);
        }else {
            System.out.println("Pop-up gelmedi");
        }
    }

    @Step("<xpath> xpath'li elemente tıkla")
    public void clickElementByXpath(String xpath){
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.click();
        logger.info(element+"element'e tıklandı");
    }

    @Step("<id> id'li elemente tıkla")
    public void clickElementByid(String id){
        MobileElement element = appiumDriver.findElement(By.id(id));
        element.click();
        logger.info(element+"elemente tıklandı");
    }

    @Step("<xpath> li elementi bul ve <key> değerini yaz")
    public void sendkeyElementByXpath(String xpath,String key){
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.sendKeys(key);
        logger.info(element+"element'e tıklandı");
    }


    @Step("<xpath> li element <text> değerini içeriyor mu kontrol et")
    public void assertElement(String xpath ,String text){
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        logger.info("Alınan text değeri = "+element.getText());
        Assert.assertTrue("Element bulunamadı",element.getText().equals(text));
    }

    @Step("Swipe Et")
    public void swipeScreen(){
        final int ANIMATION_TIME = 200; // ms
        final int PRESS_TIME = 200; // ms
        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Dimension dims = appiumDriver.manage().window().getSize();
        System.out.println("Telefonun boyutu = " + dims);
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);

        new TouchAction(appiumDriver)
                .press(pointOptionStart)
                // a bit more reliable when we add small wait
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                .moveTo(pointOptionEnd)
                .release().perform();
    }



}
