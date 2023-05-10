package com.Sant.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sant.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	
}
