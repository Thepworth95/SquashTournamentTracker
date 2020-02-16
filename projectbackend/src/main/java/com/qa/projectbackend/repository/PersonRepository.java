package com.qa.projectbackend.repository;


import com.qa.projectbackend.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Player, Integer> {

    Player getByfirstName(String name);
}
