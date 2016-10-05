package es.upm.miw.cv;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;


public class C11Test {
	
	 private C11 c11;
	 
	 @Before
	 public void before() {
		 c11 = new C11();
	 }

	 @Test
	 public void m1Test() {
		 assertEquals("m1", this.c11.m1());
	 }

	 @Test
	 public void m2Test() {
		 assertEquals("m2", this.c11.m2());
	 }
	
}
