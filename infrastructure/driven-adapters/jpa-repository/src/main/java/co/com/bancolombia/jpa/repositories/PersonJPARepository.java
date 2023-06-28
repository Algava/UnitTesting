package co.com.bancolombia.jpa.repositories;

import co.com.bancolombia.jpa.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJPARepository extends JpaRepository<PersonEntity, Integer> {
}
