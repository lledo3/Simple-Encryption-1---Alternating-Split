package com.training05.Alternating;

/*For building the encrypted string:
Take every 2nd char from the string, then the other chars, 
that are not every 2nd char, and concat them as new String.
Do this n times!

Examples:

"This is a test!", 1 -> "hsi  etTi sats!"
"This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
Write two methods:

String encrypt(final String text, final int n)
String decrypt(final String encryptedText, final int n)
For both methods:
If the input-string is null or empty return exactly this value!
If n is <= 0 then return the input text.
*/



public class Alternating {
	
	public static void main(String[] args){
		System.out.println(encrypt("This is a test!", 1));
	    System.out.println(encrypt("This is a test!", 2));
	    System.out.println(encrypt("This is a test!", 3));
	    System.out.println(encrypt("This is a test!", 4));
	    System.out.println(decrypt("hsi  etTi sats!!", 1));
	    System.out.println(decrypt("s eT ashi tist!", 2));
	    System.out.println(decrypt(" Tah itse sits!", 3));
	    System.out.println(decrypt("This is a test!", 4));
	}
	
	public static String encrypt(final String text, final int n) { 
		if (text == null || "".equals(text.trim()) || n <= 0 || text.length() == 1) { 
			return text; 
		} 
		String result = text; 
		for (int i = 0; i < n; i++) { 
			result = alternatingSplit(result); 
		} 
		return result; 
	}
	
	private static String alternatingSplit(final String text) { 
		StringBuilder sb = new StringBuilder(); 
		final int len = text.length(); 
		final int step = len / 2; 
		int pos = 1; 
		for (int i = 0; i < step; i++) { 
			sb.append(text.charAt(pos)); 
			pos += 2; 
		} 
		pos = 0; 
		for (int i = 0; i < step; i++) { 
			sb.append(text.charAt(pos)); 
			pos += 2; 
		} 
		if (len % 2 == 1) { 
			sb.append(text.charAt(len - 1)); 
		} 
		return sb.toString(); 
	}
	
	public static String decrypt(final String encryptedText, final int n) { 
		if (encryptedText == null || "".equals(encryptedText.trim()) || n <= 0 || encryptedText.length() == 1) { 
			return encryptedText; 
		} 
		String result = encryptedText; 
		for (int i = 0; i < n; i++) { 
			result = rebuild(result); 
		} 
		return result; 
	}
	
	private static String rebuild(final String encryptedText) { 
		StringBuilder sb = new StringBuilder(); 
		final int len = encryptedText.length(); 
		final int step = len / 2; 
		for (int i = 0; i < step; i++) { 
			sb.append(encryptedText.charAt(step + i)); 
			sb.append(encryptedText.charAt(i)); 
		} 
		if (len % 2 == 1) { 
			sb.append(encryptedText.charAt(len - 1)); 
		} 
		return sb.toString(); 
	} 
}
