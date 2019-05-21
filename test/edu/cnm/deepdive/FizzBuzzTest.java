package edu.cnm.deepdive;

import static edu.cnm.deepdive.FizzBuzz.BUZZ;
import static edu.cnm.deepdive.FizzBuzz.FIZZ;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  public static final String FIZZ_BUZZ = FIZZ + BUZZ;

  @Test
  void fizzbuzzValue() {
    String actual;
    actual = FizzBuzz.fizzbuzzValue(3);
    assertEquals(FIZZ, actual);
    actual = FizzBuzz.fizzbuzzValue(99);
    assertEquals(FIZZ, actual);

    actual = FizzBuzz.fizzbuzzValue(5);
    assertEquals(BUZZ, actual);
    actual = FizzBuzz.fizzbuzzValue(100);
    assertEquals(BUZZ, actual);

    actual = FizzBuzz.fizzbuzzValue(15);
    assertEquals(FIZZ_BUZZ, actual);
    actual = FizzBuzz.fizzbuzzValue(120);
    assertEquals(FIZZ_BUZZ, actual);

    actual = FizzBuzz.fizzbuzzValue(2);
    assertEquals("2", actual);
    actual = FizzBuzz.fizzbuzzValue(11);
    assertEquals("11", actual);
    actual = FizzBuzz.fizzbuzzValue(101);
    assertEquals("101", actual);

    assertThrows(IllegalArgumentException.class,
        () -> FizzBuzz.fizzbuzzValue(0));
    assertThrows(IllegalArgumentException.class,
        () -> FizzBuzz.fizzbuzzValue(-15));
  }
}