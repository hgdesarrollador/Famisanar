package com.ms.prueba.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@AllArgsConstructor
@Table(name = "LIB_BOOK_CATEGORIES")
public class LibBookCategories {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cat")
    @SequenceGenerator(name = "seq_cat", sequenceName = "seq_cat", initialValue = 1, allocationSize = 1)	
	@Column(name = "CAT_ID")
	private long CatId;
	@Column(name="CAT_DESCRIPCION")
	private String CatDescription;
	
	public LibBookCategories() {
		
    }
	
	
}
