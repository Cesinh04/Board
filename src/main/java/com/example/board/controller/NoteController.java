package com.example.board.controller;
import com.example.board.dto.NoteRequest;
import com.example.board.service.NoteService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/notes")
public class NoteController {
    private final NoteService service;
    public NoteController(NoteService service) {
        this.service = service;
    }
    @GetMapping
    public String listNotes(Model model) {
        model.addAttribute("notes", service.findAll());
        return "notes";
    }
    @PostMapping
    public String addNote(@Valid NoteRequest request) {
        service.create(request);
        return "redirect:/notes";
    }
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/notes";
    }
}