package co.com.bancolombia.jpa.adapter;

import co.com.bancolombia.jpa.entities.PersonEntity;
import co.com.bancolombia.jpa.repositories.PersonJPARepository;
import co.com.bancolombia.model.person.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
class PersonAdapterTest {

    @Autowired
    PersonJPARepository personJPARepository;
    @Autowired
    TestEntityManager entityManager;
    PersonAdapter personAdapter;

    @BeforeEach
    void setUp() {
        personAdapter = new PersonAdapter(personJPARepository);
    }

    @Test
    void listAllEven() {
        var person1 = new PersonEntity();
        person1.setName("Alejandro Gaviria");
        person1.setPhone("300123123");
        var person2 = new PersonEntity();
        person2.setName("Vanessa");
        person2.setPhone("301630301");
        entityManager.persist(person1);
        entityManager.persist(person2);

        var actual = personAdapter.listAll();
        assertTrue(actual.isEmpty());
    }

    @Test
    void listAllNotEven() {
        var person1 = new PersonEntity();
        person1.setName("Alejandro Gaviria");
        person1.setPhone("300123123");
        entityManager.persist(person1);

        var actual = personAdapter.listAll();
        assertEquals(1, actual.size());
    }

}
