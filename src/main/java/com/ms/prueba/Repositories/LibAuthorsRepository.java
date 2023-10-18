package com.ms.prueba.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.prueba.negocio.LibAuthors;


@Repository
public interface LibAuthorsRepository extends JpaRepository<LibAuthors, Long>  {

}
