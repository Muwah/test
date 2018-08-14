package guru.springframework.spring5webapp.Repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.Model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
