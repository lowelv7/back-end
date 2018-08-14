package library;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, String>, BookRepositoryCustom {


    public Optional<Book> findByName(String name);

    

}   