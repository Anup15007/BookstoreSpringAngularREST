package com.cg.bookstore.daoservices;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cg.bookstore.beans.Book;

public interface BookDAO extends JpaRepository<Book, Integer>{
	@Query(value = "from Book b where b.bookName  = :bookName")
	List<Book> getAllBooksByName(String bookName);
}
