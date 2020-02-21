package com.qa.projectbackend.repository;

import com.qa.projectbackend.entity.Matches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Matches, Integer> {
}
