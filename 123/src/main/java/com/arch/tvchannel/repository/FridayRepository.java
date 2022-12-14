package com.arch.tvchannel.repository;

import com.arch.tvchannel.model.Dow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FridayRepository extends JpaRepository<Dow, Long> {
}
