package com.phatlabs.ninja.nidbspring.repository;

import com.phatlabs.ninja.nidbspring.entities.Switch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchRepository extends JpaRepository<Switch, Integer> {
}
