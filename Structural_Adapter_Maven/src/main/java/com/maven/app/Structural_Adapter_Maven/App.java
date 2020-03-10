package com.maven.app.Structural_Adapter_Maven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
	public static void main(String[] args) {
		BufferedReader bufferreader = new BufferedReader(new InputStreamReader(System.in));
		String str1="";
		try {
			str1 = bufferreader.readLine();
		}catch(IOException e)
		{

		}
		logger.error(str1);
	}

}
