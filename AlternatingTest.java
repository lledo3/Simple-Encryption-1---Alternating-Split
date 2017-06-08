package com.training05.Alternating;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlternatingTest {

	@Test
	  public void testEncrypt() {
	    // assertEquals("expected", "actual");
	    assertEquals("This is a test!", Alternating.encrypt("This is a test!", 0));
	    assertEquals("hsi  etTi sats!", Alternating.encrypt("This is a test!", 1));
	    assertEquals("s eT ashi tist!", Alternating.encrypt("This is a test!", 2));
	    assertEquals(" Tah itse sits!", Alternating.encrypt("This is a test!", 3));
	    assertEquals("This is a test!", Alternating.encrypt("This is a test!", 4));
	    assertEquals("This is a test!", Alternating.encrypt("This is a test!", -1));
	    assertEquals("hskt svr neetn!Ti aai eyitrsig", Alternating.encrypt("This Alternating is very interesting!", 1));
	  }
	    
	  @Test
	  public void testDecrypt() {
	    // assertEquals("expected", "actual");
	    assertEquals("This is a test!", Alternating.decrypt("This is a test!", 0));
	    assertEquals("This is a test!", Alternating.decrypt("hsi  etTi sats!", 1));
	    assertEquals("This is a test!", Alternating.decrypt("s eT ashi tist!", 2));
	    assertEquals("This is a test!", Alternating.decrypt(" Tah itse sits!", 3));
	    assertEquals("This is a test!", Alternating.decrypt("This is a test!", 4));
	    assertEquals("This is a test!", Alternating.decrypt("This is a test!", -1));
	    assertEquals("This Alternating is very interesting!", Alternating.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
	  }
	    
	  @Test
	  public void testNullOrEmpty() {
	    // assertEquals("expected", "actual");
	    assertEquals("", Alternating.encrypt("", 0));
	    assertEquals("", Alternating.decrypt("", 0));
	    assertEquals(null, Alternating.encrypt(null, 0));
	    assertEquals(null, Alternating.decrypt(null, 0));
	  }

}
