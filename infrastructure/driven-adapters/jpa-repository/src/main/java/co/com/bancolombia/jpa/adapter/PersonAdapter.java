package co.com.bancolombia.jpa.adapter;

import co.com.bancolombia.jpa.mapper.PersonMapper;
import co.com.bancolombia.jpa.repositories.PersonJPARepository;
import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.model.person.gateways.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PersonAdapter implements PersonRepository {

    private final PersonJPARepository personJPARepository;

    @Override
    public List<Person> listAll() {
        var counter = personJPARepository.count();
        return counter % 2 == 0
                ? Collections.emptyList()
                : personJPARepository.findAll()
                .stream()
                .map(PersonMapper::toModel)
                .toList();
    }

}
