package com.ms.prueba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ms.prueba.negocio.LibBookCategories;
import com.ms.prueba.negocio.LibBooks;
import com.ms.prueba.Repositories.LibBooksRepository;

@RestController
@RequestMapping("/api/libros")

public class LibBookController {
    @Autowired
    private LibBooksRepository libBookRepository;

    @GetMapping("/LibrosPorCategoria")
    public List<LibBooks> getLibrosPorCategoria(@RequestParam long idcategoria) {
    	LibBookCategories cat = new LibBookCategories();
    	cat.setCatId(idcategoria);
        List<LibBooks> libros =  libBookRepository.findByBookCatId(cat);
        return libros;
    }

}
