package com.antoniogutierrez.updateDelete.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoniogutierrez.updateDelete.models.Book;
import com.antoniogutierrez.updateDelete.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
       
    }
    public Book updateBook(Long id, String title, String description, String lang, Integer numOfPages) {
    	
    	Optional<Book> updateBook = bookRepository.findById(id);
    	
    	Book newBook = updateBook.get();
    	newBook.setTitle(title);
    	newBook.setDescription(description);
    	newBook.setLanguage(lang);
    	newBook.setNumberOfPages(numOfPages);
    	
    	
    	return bookRepository.save(newBook);
    }
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    	
    }
}