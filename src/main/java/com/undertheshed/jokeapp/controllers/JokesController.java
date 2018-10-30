package com.undertheshed.jokeapp.controllers;

import com.undertheshed.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    @Autowired
    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value={"/",""})
    public String getAuthors(Model model) {
        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";
    }
}
