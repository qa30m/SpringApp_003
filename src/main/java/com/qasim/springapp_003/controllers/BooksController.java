package com.qasim.springapp_003.controllers;

import com.qasim.springapp_003.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {

    private BookRepository bookRepository;

    public BooksController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
