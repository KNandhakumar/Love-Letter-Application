package com.NKLoveLetterApp.controller;

import com.NKLoveLetterApp.model.Letter;
import com.NKLoveLetterApp.service.LetterServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/letters")
public class LetterController {

    @Autowired
    private LetterServiceImpl letterService;
    // add letters
    @PostMapping
    public Letter addLetter(@Valid @RequestBody Letter letter){ // @Valid this for checking validation
        return letterService.addLetter(letter);
    }
    // get all letters
    @GetMapping
    public List<Letter> getAllLetters(){
        return letterService.getAllLetters();
    }
    // get single letter by id
    @GetMapping("/{id}")
    public Letter getSingleLetter(@PathVariable Long id) {
        return letterService.getSingleLetterById(id);
    }
    // update letter
    @PutMapping("/{id}")
    public Letter updateLetter(@PathVariable Long id,@RequestBody Letter letter){
        return letterService.updateLetter(id,letter);
    }
    @DeleteMapping("/{id}")
    public void deleteLetter(@PathVariable Long id){
        letterService.deleteLetter(id);
    }
}
