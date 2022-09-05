package com.example.tvchannel.repository;

import com.example.tvchannel.Model.Broadcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BroadcastRepository extends JpaRepository <Broadcast, Long>{
}
