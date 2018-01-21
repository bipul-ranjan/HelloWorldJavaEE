package com.qaagility.javaee.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.javaee.*;
 
public class CalculatorTest {
  Calculator calc = new Calculator();

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }

	@Test	
      public void testCalculator() {
        assertEquals("Result", 9, calc.add());
      }
	@Test	
      public void testCalculator-1() {
        assertEquals("Result", 8, calc.add());
      }
	@Test	
      public void testCalculator-2() {
        assertEquals("Result", 9, calc.add());
      }
	
}
