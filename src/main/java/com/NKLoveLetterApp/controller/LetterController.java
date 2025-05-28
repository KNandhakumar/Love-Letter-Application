package com.NKLoveLetterApp.controller;

import com.NKLoveLetterApp.model.Letter;
import com.NKLoveLetterApp.service.LetterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/letters")
public class LetterController {

    @Autowired
    private LetterServiceImpl letterService;
    // add letters
    @PostMapping
    public Letter addLetter(@RequestBody Letter letter){
        return letterService.addLetter(letter);
    }
}
