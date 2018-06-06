package br.com.spring.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.spring.project.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findByTitle(String title);
	//Optional<Book> findOne(Long id);
}
