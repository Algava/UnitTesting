package co.com.bancolombia.model.person.gateways;

import co.com.bancolombia.model.person.Person;

import java.util.List;

public interface PersonRepository {

    List<Person> listAll();

}
