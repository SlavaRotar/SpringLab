package com.arch.tvchannel.repository;

import com.arch.tvchannel.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {

    Optional<Type> findTypeByName(String name);
    //Optional<Type> findTypeByProgram_Id(Long id);

    //List<Type> findAllByProgramsIn(Collection<Show> programs);

    //@Query(value = "SELECT c.id, c.name, c.programs FROM types as c where c.id = :id") //, nativeQuery = true)
   // Optional<Type> findMyType(Long id);
}
