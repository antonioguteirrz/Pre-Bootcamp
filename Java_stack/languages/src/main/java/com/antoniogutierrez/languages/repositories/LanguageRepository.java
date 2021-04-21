package com.antoniogutierrez.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.antoniogutierrez.languages.models.Language;


@Repository
public interface LanguageRepository extends CrudRepository<Language,Long> {
    // this method retrieves all the books from the database
    List<Language> findAll();
    // this method finds books with name containing the search string
    List<Language> findByNameContaining(String search);
    // this method counts how many creators contain a certain string
    Long countByCreatorContaining(String search);
    // this method deletes a book that starts with a specific Name
    Long deleteByNameStartingWith(String search);
}
