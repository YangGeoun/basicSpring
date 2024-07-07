package com.mycompany.myspring.board.db.repository;

import com.mycompany.myspring.board.db.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<Board, Long> {
}
