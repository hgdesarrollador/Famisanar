package com.ms.prueba.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.prueba.negocio.LibBookCategories;
import com.ms.prueba.negocio.LibBooks;

@Repository
public interface LibBooksRepository extends JpaRepository<LibBooks, Long> {
	List<LibBooks> findByBookCatId(LibBookCategories bookCatId);

}
