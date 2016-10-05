package es.upm.miw.cv;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C51Test {
	
	 private C51 c51;
	 
	 @Before
	 public void before() {
		 c51 = new C51();
	 }

	 @Test
	 public void m1Test() {
		 assertEquals("m1", this.c51.m1());
	 }

	 @Test
	 public void m2Test() {
		 assertEquals("m2", this.c51.m2());
	 }

}
