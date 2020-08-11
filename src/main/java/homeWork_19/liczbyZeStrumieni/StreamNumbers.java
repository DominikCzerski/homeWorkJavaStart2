package homeWork_19.liczbyZeStrumieni;


import org.junit.Test;

import java.util.stream.Stream;

public class StreamNumbers {

	@Test
	void streamOfNumbers() {
		Stream.iterate(8, number -> number + 1)
				.filter(number -> (number > 100 && number % 5 == 0))
				.map(number -> number * 3)
				.limit(10)
				.forEach(System.out::println);


	}
}
