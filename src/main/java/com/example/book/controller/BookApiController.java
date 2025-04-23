package com.example.book.controller;

import com.example.book.entity.Book;
import com.example.book.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookApiController {
    private final BookRepository repo;

    public BookApiController(BookRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Book> getAll() { return repo.findAll(); }

    @PostMapping
    public Book create(@RequestBody Book user) { return repo.save(user); }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book u) {
        Book user = repo.findById(id).orElseThrow();
        user.setName(u.getName());
        user.setAuthor(u.getAuthor());
        return repo.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { repo.deleteById(id); }
}

