package com.qasim.springapp_003.controllers;

import com.qasim.springapp_003.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorsController {

    private AuthorRepository authorRepository;

    public AuthorsController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }

}
