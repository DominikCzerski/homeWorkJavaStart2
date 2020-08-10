package homeWork_19.filtrowanieIPrzetwarzanie.test;

import homeWork_19.filtrowanieIPrzetwarzanie.java.FilteringMachineTwo;
import homeWork_19.filtrowanieIPrzetwarzanie.java.Person;
import homeWork_19.filtrowanieIPrzetwarzanie.java.User;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;



public class FilteringMachineTwoTest {

	private FilteringMachineTwo machine = new FilteringMachineTwo();
	private List<Person> people;

	@Before
	public void init() {
		people = new ArrayList<>();
		people.add(new Person("Tomek", 2));
		people.add(new Person("Ania", 18));
		people.add(new Person("Konrad", 44));
		people.add(new Person("Janusz", 52));
		people.add(new Person("Sebastian", 16));
	}

	@Test
	public void shouldReturnKidNames() {
		// when
		List<String> kids = machine.findKidNames(people);

		// then
		Assertions.assertThat(kids.size()).isEqualTo(2);
		Assertions.assertThat(kids.contains("Tomek"));
		Assertions.assertThat(kids.contains("Sebastian"));
	}

	@Test
	public void shouldConvertPeopleToUser() {
		// when
		List<User> users = machine.convertPeopleToUsers(people);

		// then
		Assertions.assertThat(users.size()).isEqualTo(5);
		Assertions.assertThat(users.contains(new User("Tomek", 2, "Tomek_2")));
		Assertions.assertThat(users.contains(new User("Ania", 18, "Ania_18")));
		Assertions.assertThat(users.contains(new User("Konrad", 44, "Konrad_44")));
		Assertions.assertThat(users.contains(new User("Janusz", 52, "Janusz_52")));
		Assertions.assertThat(users.contains(new User("Sebastian", 16, "Sebastian_16")));
	}


}


