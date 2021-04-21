package com.antoniogutierrez.languages.services;

import java.util.List;
import org.springframework.stereotype.Service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.antoniogutierrez.languages.models.Language;
import com.antoniogutierrez.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	@Autowired
    private final LanguageRepository languageRepository;
    
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    // returns all the books
    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
    // creates a book
    public Language createLanguage(Language b) {
        return languageRepository.save(b);
    }
    // retrieves a book
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
       
    }
    public Language updateLanguage(Long id, String name, String creator, Integer version) {
    	
    	Optional<Language> updateLanguage = languageRepository.findById(id);
    	
    	Language newLanguage = updateLanguage.get();
    	newLanguage.setName(name);
    	newLanguage.setCreator(creator);
    	newLanguage.setVersion(version);    	
    	
    	return languageRepository.save(newLanguage);
    }
    public void deleteLanguage(Long id) {
    	languageRepository.deleteById(id);
    	
    }
}
