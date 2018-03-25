package cn.soa.examsystem.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;

public class IDMaker {
	public static String generateUUID(){
		String id=UUID.randomUUID().toString();
		return id;
	}
	
	public static String generateMD5(String temp){ 
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] tempArr=md.digest(temp.getBytes());
			String result=Base64.encodeBase64String(tempArr);
			return result;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
	}
}
