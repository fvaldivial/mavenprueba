///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package edu.pe.clases;
//
//import com.twilio.sdk.TwilioRestClient;
//import com.twilio.sdk.TwilioRestException;
//import com.twilio.sdk.resource.factory.MessageFactory;
//import com.twilio.sdk.resource.instance.Message;
//import java.util.ArrayList;
//import java.util.List;
//import org.apache.http.message.BasicNameValuePair;
//
//
//public class SMSDAO {
//
//  // Find your Account Sid and Token at twilio.com/user/account
//  public static final String ACCOUNT_SID = "";
//  public static final String AUTH_TOKEN = "bc323ea86a2c509481aceca19fe11ae1";
// 
//  public static void main(String[] args) throws TwilioRestException {
//    TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
// 
//    // Build a filter for the MessageList
//    List<NameValuePair> params = new ArrayList<NameValuePair>();
//    params.add(new BasicNameValuePair("Body", "Jenny please?! I love you <3"));
//    params.add(new BasicNameValuePair("To", "+14159352345"));
//    params.add(new BasicNameValuePair("From", "+14158141829"));
// 
//    MessageFactory messageFactory = client.getAccount().getMessageFactory();
//    Message message = messageFactory.create(params);
//    System.out.println(message.getSid());
//  }
//}
//    
//
