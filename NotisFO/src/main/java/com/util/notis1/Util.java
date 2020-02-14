package com.util.notis1;

import com.service.notis1.TokenService;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.apache.commons.codec.binary.Base64;

public class Util {

    private static Util util = new Util();

    public static Util getinstance() {
        if (util == null) {
            util = new Util();
        }
        return util;
    }

    private String nonce1;

    public String getNonce1() {
        System.out.println("nonce ->" + nonce1);
        return nonce1;
    }

    public void setNonce1(String nonce1) {
        this.nonce1 = nonce1;
    }

    public String getNonce() throws Exception {

        // Generate Date
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
        String strDate = formatter.format(date);
        System.out.println("Date Format ddMMyyyyHHmmssSSS : " + strDate);
//        int sixLengthRandomNumber = RandomUtils.nextInt(100000, 1000000);
//        System.out.println("random 6 digit number:" + sixLengthRandomNumber);
//        String sixRandomNumber = RandomStringUtils.randomNumeric(6);
//        System.out.println("random 6 digit number:" + sixRandomNumber);
        // Generate Number
        Random generator = new Random();
        generator.setSeed(System.currentTimeMillis());

        int num = generator.nextInt(99999) + 99999;
        if (num < 100000 || num > 999999) {
            num = generator.nextInt(99999) + 99999;
            if (num < 100000 || num > 999999) {
                throw new Exception("Unable to generate PIN at this time..");
            }
        }
        System.out.println("Six digit random number  : " + num);
        String nonce = strDate + ":" + num;
        String noncebase64 = new String(Base64.encodeBase64(nonce.getBytes()));
        System.out.println("Base64 encoded Nonce : " + noncebase64);
//        Util u = new Util();
//        u.setNonce1(noncebase64);
        Noncegen n = new Noncegen(noncebase64);

        System.out.println("getNonce1 : " + n.getNonce1());
        nonce1 = noncebase64;
        return noncebase64;
    }

    public static String getTokenAuthorization() throws Exception {
        String consumerKey = "a424155190b9456681f20c41ab74ba15";
        String consumerSecret = "5f053fbafabc44e09045ebb9c81fda82";
        String auth = consumerKey + ":" + consumerSecret;
        String authB64 = new String(Base64.encodeBase64(auth.getBytes()));
        System.out.println("Base64 encoded  Authorization :" + authB64);
        String authorization = "Basic " + authB64;
        System.out.println("Authorization : " + authorization);
        return authorization;
    }

    public static String getInqAuthorization() throws Exception {
        TokenService ts = new TokenService();
        String accessToken = ts.login();
        System.out.println("Access Token  :  " + accessToken);
        String authorization = "Bearer " + accessToken;
        System.out.println("Authorization : " + authorization);
        return authorization;
    }

    public static String getMsgId() throws Exception {
        SeqNo n = new SeqNo();
        int i = n.sno();
        DecimalFormat decimalFormat = new DecimalFormat("0000000");
        String reqNo = decimalFormat.format(i);
        System.out.println(reqNo + "-> Seq No");
        String memCode = "13372";
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");//YYYYMMDD
        String dateFormat = formatter.format(date);
        System.out.println(" date : " + dateFormat);

//        String reqNo = "0000001";
        String msgId = memCode + dateFormat + reqNo;
        System.out.println("msgId  : " + msgId);
        i = i + 1;
        return msgId;
    }

    public static void main(String[] args) throws Exception {
        Util sd = new Util();
        sd.getNonce();
        sd.getTokenAuthorization();
        sd.getMsgId();

    }

}
