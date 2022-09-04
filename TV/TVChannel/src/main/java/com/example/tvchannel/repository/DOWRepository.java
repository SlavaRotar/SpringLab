package com.example.tvchannel.repository;

import com.example.tvchannel.Model.DOW;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DOWRepository extends JpaRepository<DOW, Long> {
}