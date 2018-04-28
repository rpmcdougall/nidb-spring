package com.phatlabs.ninja.nidbspring.repository;

import com.phatlabs.ninja.nidbspring.entities.NetInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetInterfaceRepository extends JpaRepository<NetInterface, Integer> {
}
