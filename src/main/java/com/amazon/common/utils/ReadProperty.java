package com.amazon.common.utils;

import java.io.*;
import java.util.*;

public class ReadProperty {
	
	public void readUrl() throws Exception{
		Properties prop = new Properties();
		InputStream input = null;
		input = new FileInputStream("/Users/satishtamilselvan/Downloads/AmazonProject/src/main/resources/prod/config/testData.properties");
		prop.load(input);
		prop.get("URL");
	}

}