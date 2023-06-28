package co.com.bancolombia.jpa.mapper;

import co.com.bancolombia.jpa.entities.PersonEntity;
import co.com.bancolombia.model.person.Person;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PersonMapper {

    public static Person toModel(PersonEntity person) {
        return Person.builder()
                .id(person.getId())
                .name(person.getName())
                .phone(person.getPhone())
                .build();
    }

}
