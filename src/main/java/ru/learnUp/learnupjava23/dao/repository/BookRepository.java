package ru.learnUp.learnupjava23.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnUp.learnupjava23.dao.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
