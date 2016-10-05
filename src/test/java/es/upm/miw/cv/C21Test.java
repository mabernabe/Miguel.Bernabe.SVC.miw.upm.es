package es.upm.miw.cv;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C21Test {
	
	 private C21 c21;
	 
	 @Before
	 public void before() {
		 c21 = new C21();
	 }

	 @Test
	 public void m1Test() {
		 assertEquals("m1", this.c21.m1());
	 }

	 @Test
	 public void m2Test() {
		 assertEquals("m2", this.c21.m2());
	 }

}
