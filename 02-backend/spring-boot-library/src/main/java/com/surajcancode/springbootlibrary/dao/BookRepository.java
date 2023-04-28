package com.surajcancode.springbootlibrary.dao;

import com.surajcancode.springbootlibrary.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface BookRepository extends JpaRepository<Book, Long> {

    // implement search by title
    Page<Book> findByTitleContaining(@RequestParam("title") String title, Pageable pageable);
}
