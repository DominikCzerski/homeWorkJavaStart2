package homeWork_19.filtrowanieIPrzetwarzanie.test;

import homeWork_19.filtrowanieIPrzetwarzanie.java.Book;
import homeWork_19.filtrowanieIPrzetwarzanie.java.FilteringMachine;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class FilteringMachineTest {

	private FilteringMachine machine = new FilteringMachine();

	@Test
	public void shouldFilterOutNotEvenNumbers() {

		// given
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(123);
		numberList.add(11);
		numberList.add(124);
		numberList.add(12);
		numberList.add(13);
		numberList.add(21);
		numberList.add(71);

		// when
		List<Integer> filteredList = machine.filterOutNotEvenNumbers(numberList);

		// then
		assertThat(filteredList.size()).isEqualTo(2);
		assertThat(filteredList).contains(12);
		assertThat(filteredList.contains(124));
	}

	@Test
	public void shouldFilterOutNumberLowerThan20() {

		// given
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(123);
		numberList.add(11);
		numberList.add(124);
		numberList.add(12);
		numberList.add(13);
		numberList.add(21);
		numberList.add(71);

		// when
		List<Integer> filteredList = machine.filterOutLowerNumbersThan20(numberList);

		// then
		assertThat(filteredList.size()).isEqualTo(24);
		assertThat(filteredList.contains(123));
		assertThat(filteredList.contains(124));
		assertThat(filteredList.contains(21));
		assertThat(filteredList).contains(27);
	}

	@Test
	public void shouldConvertTitlesToBooks() {
		// given
		List<String> titles = new ArrayList<>();
		titles.add("Gra o tron");
		titles.add("Dzieci z Bullerbyn");
		titles.add("Robinson Cruzoe");
		titles.add("Cyfrowa twierdza");
		titles.add("Gra o życie");

		// when
		List<Book> books = machine.convertToBooks(titles);

		// then
		assertThat(books.size()).isEqualTo(4);
		assertThat(books.contains(new Book("Gra o tron")));
		assertThat(books.contains(new Book("Dzieci z Bullerbyn")));
		assertThat(books.contains(new Book("Robinson Cruzoe")));
		assertThat(books.contains(new Book("Cyfrowa twierdza")));
		assertThat(books.contains(new Book("Gra o życie")));
	}

	@Test
	public void shouldConvertTitlesToBooksAndFilterOutStartingWithGra() {
		// given
		List<String> titles = new ArrayList<>();
		titles.add("Gra o tron");
		titles.add("Dzieci z Bullerbyn");
		titles.add("Robinson Cruzoe");
		titles.add("Cyfrowa twierdza");
		titles.add("Gra o życie");

		// when
		List<Book> books = machine.convertToBooksAndReturnOnlyStartingWithGra(titles);

		// then
		assertThat(books.size()).isEqualTo(2);
		assertThat(books.contains(new Book("Gra o tron")));
		assertThat(books.contains(new Book("Gra o życie")));
	}

}
