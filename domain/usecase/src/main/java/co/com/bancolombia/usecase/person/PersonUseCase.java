package co.com.bancolombia.usecase.person;

import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.model.person.gateways.PersonRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PersonUseCase {

    private final PersonRepository personRepository;

    public List<Person> listAllPersons() {
        return personRepository.listAll();
    }

}
