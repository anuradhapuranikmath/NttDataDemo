package com.nttdata.java8features;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncoderDecoder {
	
	public static void main(String[] args) {
		
		//Base encoder and decoder 
		Encoder basicsEncoder=Base64.getEncoder();
		
		String data=basicsEncoder.encodeToString("This is a Basics encoder".getBytes());
		System.out.println("basics encoder value is :"+data );
		
		Decoder basicDecoder=Base64.getDecoder();
		System.out.println(" decoded String is:"+new String(basicDecoder.decode(data)));
		
		// url encoder and decoder 
		
		Encoder urlEncoder=Base64.getUrlEncoder();
		Decoder ulrDecoder=Base64.getUrlDecoder();
		
		String dataurl=" Anuradha";
		String urlEncodedValue=urlEncoder.encodeToString(dataurl.getBytes());
		
		System.out.println(" Url encoded string :"+urlEncodedValue);
		
		String decodedUrl=new String(ulrDecoder.decode(urlEncodedValue));
		System.out.println(" url decoded string:"+decodedUrl);
		
		//MIME encoder and decoder 
		
		Encoder mimeEncoder=Base64.getMimeEncoder();
		Decoder mimeDecoder=Base64.getMimeDecoder();
		String mimeencoded=mimeEncoder.encodeToString("Hello Good Evning".getBytes());
		System.out.println(" Mime encoded value is :"+mimeencoded);
		
		String mimedecodedvalue=new String(mimeDecoder.decode(mimeencoded));
		System.out.println(" Mime decoded value is :"+mimedecodedvalue);
	}

}
