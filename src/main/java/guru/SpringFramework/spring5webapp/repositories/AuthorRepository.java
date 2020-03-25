package guru.SpringFramework.spring5webapp.repositories;

import guru.SpringFramework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
