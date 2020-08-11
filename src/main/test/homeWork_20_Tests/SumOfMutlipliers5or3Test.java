package homeWork_20_Tests;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static homeWork_20.Calculator.*;
import static org.assertj.core.api.Assertions.*;

public class SumOfMutlipliers5or3Test {

	@Test
	public void shouldReturn23WhenAddingSumOfMutliplies5or3ofNumber10() {
		//given
		int initialNumber = 10;

		//when
		int sumOfMultipliers = sumOfNaturalNumbers(initialNumber);

		//then
		int expectedNumber = 23;
		assertThat(sumOfMultipliers).isEqualTo(expectedNumber);
	}

	@Test
	public void shouldReturn33WhenAddingSumOfMutliplies5or3ofNumber11() {
		//given
		int initialNumber = 11;

		//when
		int sumOfMultipliers = sumOfNaturalNumbers(initialNumber);

		//then
		int expectedNumber = 33;
		assertThat(sumOfMultipliers).isEqualTo(expectedNumber);
	}

	@Test
	public void shouldReturn33WhenAddingSumOfMutliplies5or3ofNumber12() {
		//given
		int initialNumber = 12;

		//when
		int sumOfMultipliers = sumOfNaturalNumbers(initialNumber);

		//then
		int expectedNumber = 33;
		assertThat(sumOfMultipliers).isEqualTo(expectedNumber);
	}

	@Test
	public void shouldReturn45WhenAddingSumOfMutliplies5or3ofNumber13() {
		//given
		int initialNumber = 13;

		//when
		int sumOfMultipliers = sumOfNaturalNumbers(initialNumber);

		//then
		int expectedNumber = 45;
		assertThat(sumOfMultipliers).isEqualTo(expectedNumber);
	}

	@Test
	public void shouldReturn60WhenAddingSumOfMutliplies5or3ofNumber16() {
		//given
		int initialNumber = 16;

		//when
		int sumOfMultipliers = sumOfNaturalNumbers(initialNumber);

		//then
		int expectedNumber = 60;
		assertThat(sumOfMultipliers).isEqualTo(expectedNumber);
	}
}
