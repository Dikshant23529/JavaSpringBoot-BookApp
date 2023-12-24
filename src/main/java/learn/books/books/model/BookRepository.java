package learn.books.books.model;

import org.springframework.data.repository.CrudRepository;
import learn.books.books.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

    public Book findById(int id);

}
