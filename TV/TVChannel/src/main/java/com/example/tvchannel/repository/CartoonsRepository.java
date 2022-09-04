package com.example.tvchannel.repository;

import com.example.tvchannel.Model.Cartoons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartoonsRepository extends JpaRepository<Cartoons, Long> {
}