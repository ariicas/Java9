package com.class24;

public class WebsiteTester {
    public static void main(String[] args) {
        WebDriver webDriver=new goodleChrome();
        webDriver.openWebsite();
        webDriver.signupWebsite();
        webDriver.downloadAfileFromWebsite();
        webDriver.closeWebsite();
        System.out.println("===========================================");

        WebDriver[] webDriverArray={new fireFox(), new goodleChrome()};
        for(WebDriver webDriver1:webDriverArray){
            webDriver1.openWebsite();
            webDriver1.signupWebsite();
            webDriver1.downloadAfileFromWebsite();
            webDriver1.closeWebsite();
        }
    }

}
