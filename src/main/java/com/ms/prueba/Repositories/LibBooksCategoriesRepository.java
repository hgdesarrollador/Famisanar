package com.ms.prueba.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.prueba.negocio.LibBookCategories;



@Repository
public interface LibBooksCategoriesRepository extends JpaRepository<LibBookCategories, Long> {

}
