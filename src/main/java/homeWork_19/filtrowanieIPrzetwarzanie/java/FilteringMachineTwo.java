package homeWork_19.filtrowanieIPrzetwarzanie.java;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachineTwo {

	// metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
	public List<String> findKidNames(List<Person> ppl) {
		return ppl.stream()
				.filter(person -> person.getAge() < 18)
				.map(Person::getName)
				.collect(Collectors.toList());
	}

	public List<User> convertPeopleToUsers(List<Person> people) {
		return people.stream()
				.map(user -> new User(user.getName(), user.getAge(), user.getName() + "_" + user.getAge()))
				.collect(Collectors.toList());
	}
}
