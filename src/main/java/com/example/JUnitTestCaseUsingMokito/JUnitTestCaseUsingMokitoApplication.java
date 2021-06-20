package com.example.JUnitTestCaseUsingMokito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.twiml.voice.Dial;
import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.voice.Say;
import com.twilio.twiml.TwiMLException;

@SpringBootApplication
public class JUnitTestCaseUsingMokitoApplication {
	// Find your Account Sid and Token at twilio.com/console
	public static final String ACCOUNT_SID = "AC8b8309cfb48d136dff808e4fdbbb838f";
	public static final String AUTH_TOKEN = "e371af4aa9574a559585b253d9e14851";

	public static void main(String[] args) throws URISyntaxException {
//		Dial dial = new Dial.Builder("+917620650771").build();
//		Say say = new Say.Builder("Goodbye").build();
//		VoiceResponse response = new VoiceResponse.Builder().dial(dial)
//				.say(say).build();
//
//		try {
//			System.out.println(response.toXml());
//		} catch (TwiMLException e) {
//			e.printStackTrace();
//		}
		SpringApplication.run(JUnitTestCaseUsingMokitoApplication.class, args);
	}

}
