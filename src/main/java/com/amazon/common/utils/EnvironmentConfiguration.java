package com.amazon.common.utils;


public final class EnvironmentConfiguration {

       private static PropertiesUtil propertiesUtil = new PropertiesUtil("E:\\SeleniumAutomation\\feb_batch\\AmazonProject\\src\\main\\resources\\config\\testData.properties");

       private EnvironmentConfiguration() {

       }

       public static String getValue(final String key) {
           return propertiesUtil.getValue(key);
       }
}