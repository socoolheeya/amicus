package com.amicus.board.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amicus.board.model.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
	
	public Board findByBoardId(long boardId);
	
	public Page<Board> findByDivisionId(long divisionId, Pageable pageable);
	
	public long countByDivisionId(long divisionId);
	
	public long deleteByBoardId(long boardId);
	
}
