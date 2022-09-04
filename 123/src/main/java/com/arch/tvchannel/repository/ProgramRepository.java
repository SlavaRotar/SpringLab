package com.arch.tvchannel.repository;

import com.arch.tvchannel.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<Show, Long> {
}
