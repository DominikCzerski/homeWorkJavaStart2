package homeWork_20_Tests;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import static homeWork_20.Calculator.fibonacciSequence;

public class SumOfEvenFibonacciNumbersTest {


	@Test
	void shouldReturn10WhenAddingSumOfEvenFibonacciAndNumbers() {
		//given
		int numberOfLimit = 7;

		//when
		int sumOfEvenNumbers = fibonacciSequence(numberOfLimit);

		//then
		int expectedNumber = 10;
		Assertions.assertThat(sumOfEvenNumbers).isEqualTo(expectedNumber);
	}

	@Test
	void shouldReturn44WhenAddingSumOfEvenFibonacciAndNumbers() {
		int numberOfLimit = 10;

		//when
		int sumOfEvenNumbers = fibonacciSequence(numberOfLimit);

		//then
		int expectedNumber = 44;
		Assertions.assertThat(sumOfEvenNumbers).isEqualTo(expectedNumber);

	}

	@Test
	void shouldReturn188WhenAddingSumOfEvenFibonacciAndNumbers() {
		int numberOfLimit = 12;

		//when
		int sumOfEvenNumbers = fibonacciSequence(numberOfLimit);

		//then
		int expectedNumber = 188;
		Assertions.assertThat(sumOfEvenNumbers).isEqualTo(expectedNumber);
	}
}
