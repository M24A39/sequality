package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KadaiTest {
  @Test
  public void appHasAGreeting() {
    App classUnderTest = new App();
    // assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    assertEquals("Hello World!", classUnderTest.getGreeting());
    assertEquals("Sum of 2 and 3 is 5. Average is 2.5.", classUnderTest.kadai1());
    assertEquals("Sum of 1 to 10 is 55. Average is 5.5.", classUnderTest.kadai2());
    assertEquals("Sum of odd of 1 to 10 is 25. Sum of even is 30.", classUnderTest.kadai3());
  }
}
