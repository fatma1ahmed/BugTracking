package com.fatma.BugTracking.repository;

import com.fatma.BugTracking.model.entity.Tester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesterRepo extends JpaRepository<Tester,Long> {
}