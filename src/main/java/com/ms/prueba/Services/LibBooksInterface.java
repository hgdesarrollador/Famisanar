package com.ms.prueba.Services;

import java.util.List;

import com.ms.prueba.negocio.LibBookCategories;
import com.ms.prueba.negocio.LibBooks;

public interface LibBooksInterface {
	
	List<LibBooks> findByBookCatId(LibBookCategories idCategoria);

}
