package com.nit.web.utils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UtilityMethods {

	public static String generateOtp() {
		StringBuilder generatedToken = new StringBuilder();
		try {
			SecureRandom number = SecureRandom.getInstance("SHA1PRNG");
			int size = 6;
			// Generate 20 integers 0..20
			for (int i = 0; i < size; i++) {
				generatedToken.append(number.nextInt(9));
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return generatedToken.toString();
	}

	public static String generatePassword() {
		long code = Code();// function calling
		String unique_password = "";
		for (long i = code; i != 0; i /= 100)// a loop extracting 2 digits from the code
		{
			long digit = i % 100;// extracting two digits
			if (digit <= 90)
				digit = digit + 32;
			// converting those two digits(ascii value) to its character value
			char ch = (char) digit;
			// adding 32 so that our least value be a valid character
			unique_password = ch + unique_password;// adding the character to the string
		}
		System.out.println("unique password =" + unique_password);
		return unique_password;
	}

	public static long Code() // this code returns the unique 16 digit code
	{ // creating a 16 digit code using Math.random function
		long code = (long) ((Math.random() * 9 * Math.pow(10, 15)) + Math.pow(10, 15));
		return code; // returning the code
	}


	public static String generateReferenceKey(int id,String type) {
		String sequence = "";
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		String paddedNo = String.format("%05d", id);
		sequence = type + "_" + strDate + "_" + paddedNo;
		return sequence;
	}

}
