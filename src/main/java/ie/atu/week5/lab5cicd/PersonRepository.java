package ie.atu.week5.lab5cicd;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long>
{
    Optional <Person> findByEmployeeId(String employeeId);

    List<Person> id(Long id);
}

