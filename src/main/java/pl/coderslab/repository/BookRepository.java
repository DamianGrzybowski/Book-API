package pl.coderslab.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Book;
public interface BookRepository extends JpaRepository<Book, Long> {


}
