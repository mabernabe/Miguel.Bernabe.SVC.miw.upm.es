package es.upm.miw.cv;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C52Test {
	
	 private C52 c52;
	 
	 @Before
	 public void before() {
		 c52 = new C52();
	 }

	 @Test
	 public void m1Test() {
		 assertEquals("mA", this.c52.mA());
	 }


}
