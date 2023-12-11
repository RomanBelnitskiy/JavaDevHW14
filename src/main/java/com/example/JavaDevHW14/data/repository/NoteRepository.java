package com.example.JavaDevHW14.data.repository;

import com.example.JavaDevHW14.data.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<NoteEntity, Long> {
}
