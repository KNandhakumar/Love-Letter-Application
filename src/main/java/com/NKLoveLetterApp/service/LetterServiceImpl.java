package com.NKLoveLetterApp.service;

import com.NKLoveLetterApp.model.Letter;
import com.NKLoveLetterApp.repository.LetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LetterServiceImpl implements LetterService{
    @Autowired
    private LetterRepository letterRepository;

    // save letter
    public Letter addLetter(Letter letter){
        return letterRepository.save(letter);
    }
    // get letters
    public List<Letter> getAllLetters(){
        return letterRepository.findAll();
    }
    // update letter
    public Letter updateLetter(Long id,Letter updated){
        Optional<Letter> existing = letterRepository.findById(id);
        if (existing.isPresent()){
            Letter letter = existing.get();
            letter.setToWhom(updated.getToWhom());
            letter.setFromWhom(updated.getFromWhom());
            letter.setMessage(updated.getMessage());
            letter.setDate(updated.getDate());
            return letterRepository.save(letter);
        }
        return null;
    }
    // delete letter
    public void deleteLetter(Long id){
        letterRepository.deleteById(id);
    }
}
