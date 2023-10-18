package com.ms.prueba.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.prueba.negocio.LibBookCategories;
import com.ms.prueba.negocio.LibBooks;
import com.ms.prueba.Repositories.LibBooksRepository;

@Service
public class LibBooksImp implements LibBooksInterface{
	
	@Autowired
	LibBooksRepository libBookRepository;
	
	@Override
    @Transactional(readOnly = true)
    public List<LibBooks> findByBookCatId(LibBookCategories idCategoria) {
		List<LibBooks> libros = libBookRepository.findByBookCatId(idCategoria);
		return libros;
    }

}
