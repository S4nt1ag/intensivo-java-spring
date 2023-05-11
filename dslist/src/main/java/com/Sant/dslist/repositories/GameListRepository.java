package com.Sant.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sant.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	
}
