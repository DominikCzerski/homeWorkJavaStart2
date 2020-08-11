package homeWork_20;

import org.assertj.core.api.Assertions;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Calculator {

	public static int sumOfNaturalNumbers(int limit) {
		return IntStream.range(1,limit)
				.filter(number -> number % 3 == 0 || number % 5 == 0)
				.sum();
	}

	public static int fibonacciSequence(int limit) {
		return Stream.iterate(new int[]{1, 1}, n -> new int[]{n[1], n[0] + n[1]})
				.limit(limit)
				.map(n -> n[0])
				.filter(n -> n % 2 == 0)
				.mapToInt(n -> n)
				.sum();
	}

}
