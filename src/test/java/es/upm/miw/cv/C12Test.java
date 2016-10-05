package es.upm.miw.cv;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C12Test {
	
	 private C12 c12;
	 
	 @Before
	 public void before() {
		 c12 = new C12();
	 }

	 @Test
	 public void m1Test() {
		 assertEquals("mA", this.c12.mA());
	 }

}
