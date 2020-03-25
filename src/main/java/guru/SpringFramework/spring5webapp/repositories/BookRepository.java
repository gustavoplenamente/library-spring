package guru.SpringFramework.spring5webapp.repositories;

import guru.SpringFramework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
