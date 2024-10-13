package com.fatma.BugTracking.repository;

import com.fatma.BugTracking.model.entity.Bug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugRepo extends JpaRepository<Bug,Long> {
}
