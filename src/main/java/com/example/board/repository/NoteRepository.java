package com.example.board.repository;
import com.example.board.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
public interface NoteRepository extends JpaRepository<Note, Long> {}