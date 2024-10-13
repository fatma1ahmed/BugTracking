package com.fatma.BugTracking.repository;

import com.fatma.BugTracking.model.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepo extends JpaRepository<Developer,Long> {
}
