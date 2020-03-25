package guru.SpringFramework.spring5webapp.repositories;

import guru.SpringFramework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
