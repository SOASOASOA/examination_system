package cn.soa.examsystem.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ExaminUtil {
	/**
	 * 灏嗙敤鎴风殑瀵嗙爜閫氳繃MD5鍜孊ase64杩涜鍔犲瘑澶勭悊
	 * @param password 鐢ㄦ埛瀵嗙爜
	 * @return
	 */
	public static String toMD5(String password) {
		//鑾峰彇MD5瀵硅薄
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			//鍔犲瘑澶勭悊
			byte[] output=md.digest(password.getBytes());
			//鍒╃敤Base64杞崲鎴愬瓧绗︿覆缁撴灉
			String result=Base64.encodeBase64String(output);
			return result;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 鑾峰彇UUID
	 * @return
	 */
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}
	/**
	 * 杩斿洖鐢ㄦ埛鎻愮ず淇℃伅
	 * @param req
	 * @param res
	 * @param jsonResult 杩斿洖鐢ㄦ埛灏佽鐨勬彁绀轰俊鎭�
	 */
	public static void returnPromptMessage(HttpServletResponse res,JsonResult jsonResult) {
		PrintWriter out;
		try {
			out = res.getWriter();
			ObjectMapper mapper = new ObjectMapper();
			String msg = mapper.writeValueAsString(jsonResult);
			out.write(msg);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
