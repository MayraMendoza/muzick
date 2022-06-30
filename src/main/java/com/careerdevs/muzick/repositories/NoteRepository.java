package com.careerdevs.muzick.repositories;

import com.careerdevs.muzick.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note,Long> {
    List<Note> findAllBylistener_id(Long listener_id);
}
