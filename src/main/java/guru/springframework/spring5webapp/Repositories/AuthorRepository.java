package guru.springframework.spring5webapp.Repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.Model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
