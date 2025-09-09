package com.example.board.service;
import com.example.board.dto.NoteRequest;
import com.example.board.entity.Note;
import com.example.board.repository.NoteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class NoteService {
    private final NoteRepository repository;
    public NoteService(NoteRepository repository) {
        this.repository = repository;
    }
    public List<Note> findAll() {
        return repository.findAll();
    }
    public Note create(NoteRequest request) {
        var note = new Note();
        note.setTitle(request.title());
        note.setContent(request.content());
        return repository.save(note);
    }
    public void delete(Long id) {
        repository.findById(id).ifPresentOrElse(
                repository::delete,
                () -> { throw new RuntimeException("Nota não encontrada"); }
        );
    }
}