package learn.books.books.services;

import learn.books.books.entities.Book;
import learn.books.books.model.BookRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Getting all book method
    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) this.bookRepository.findAll();
        return list;
    }

    // Getting Book by ID

    public Book getBookById(int id) {
        Book book = null;
        try {
            book = this.bookRepository.findById(id);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return book;
    }

    // Creating Book
    public Book postBook(Book book) {
        Book result = this.bookRepository.save(book);
        return result;
    }

    // Deleteing the book by ID

    public void delBook(int id) {
        this.bookRepository.deleteById(id);
    }

    // Update the Book Details by Id

    public void updateBook(Book book, int id) {

        if (book.getBookId() == id) {
            bookRepository.save(book);
        } else {
            System.out.println("no book found");
        }

    }

}
