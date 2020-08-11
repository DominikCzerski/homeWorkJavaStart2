package homeWork_20_Tests;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import static homeWork_20.Calculator.fibonacciSequence;
import static org.assertj.core.api.Assertions.*;

public class SumOfEvenFibonacciNumbersTest {

	@Test
	public void shouldReturn10WhenAddingSumOfEvenFibonacciAndNumbers() {
		//given
		int numberOfLimit = 7;

		//when
		int sumOfEvenNumbers = fibonacciSequence(numberOfLimit);

		//then
		int expectedNumber = 10;
		assertThat(sumOfEvenNumbers).isEqualTo(expectedNumber);
	}

	@Test
	public void shouldReturn44WhenAddingSumOfEvenFibonacciAndNumbers() {
		//given
		int numberOfLimit = 10;

		//when
		int sumOfEvenNumbers = fibonacciSequence(numberOfLimit);

		//then
		int expectedNumber = 44;
		assertThat(sumOfEvenNumbers).isEqualTo(expectedNumber);

	}

	@Test
	public void shouldReturn188WhenAddingSumOfEvenFibonacciAndNumbers() {
		//given
		int numberOfLimit = 12;

		//when
		int sumOfEvenNumbers = fibonacciSequence(numberOfLimit);

		//then
		int expectedNumber = 188;
		assertThat(sumOfEvenNumbers).isEqualTo(expectedNumber);
	}
}
