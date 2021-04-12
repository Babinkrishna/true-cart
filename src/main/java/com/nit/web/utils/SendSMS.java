package com.nit.web.utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SendSMS {
    public static void main(String[] args) {
        sendSms();
    }


    public static String sendSms() {
        try {
            // Construct data
            String apiKey = "apikey=" + "rMfCsqJSxhA-3vNLxVEqy6m7FIxIvuZjDk9hgblmzZ";
            String message = "&message=" + "Dear Customer, OTP - One Time Password for the transaction initiated by you is 223344. The OTP is valid for 100 seconds DO NOT SHARE OTP WITH ANYONE";
            String sender = "&sender=" + "NIYUKT";
            String numbers = "&numbers=" + "919446942341";

            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data = apiKey + numbers + message + sender;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            final StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line);
            }
            rd.close();

            return stringBuffer.toString();
        } catch (Exception e) {
            System.out.println("Error SMS " + e);
            return "Error " + e;
        }
    }
}
