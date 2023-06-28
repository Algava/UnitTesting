package co.com.bancolombia.jpa.adapter;

import co.com.bancolombia.jpa.repositories.PersonJPARepository;
import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.model.person.gateways.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PersonAdapter implements PersonRepository {

    private final PersonJPARepository personJPARepository;

    @Override
    public List<Person> listAll() {
        return null;
    }

}
