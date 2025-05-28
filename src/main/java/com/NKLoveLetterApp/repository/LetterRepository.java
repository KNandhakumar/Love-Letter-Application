package com.NKLoveLetterApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.NKLoveLetterApp.model.Letter;

public interface LetterRepository extends JpaRepository<Letter,Long> {

}
