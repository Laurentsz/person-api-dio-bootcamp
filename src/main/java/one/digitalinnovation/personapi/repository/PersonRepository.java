package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.PersonDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonDTO,Long> {
}
