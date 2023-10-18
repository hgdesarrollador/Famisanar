package com.ms.prueba.negocio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "LIB_BOOKS")
public class LibBooks {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_book")
    @SequenceGenerator(name = "seq_book", sequenceName = "seq_book", initialValue = 1, allocationSize = 1)	
	@Column(name = "BOOK_ID")
	private long BookId;
	@Column(name="BOOK_ISBN")
	private String BookIsnb;
	@Column(name="BOOK_PUBLISHED_DATE")
	private Date BookPublishedDate;
	@Column(name="BOOK_TITLE")
	private String BookTitle;
	@Column(name="BOOK_PRICE")
	private float BookPrice;
	@Column(name="BOOK_DESCRIPCIÓN")
	private String BookDescription;
	@Column(name="BOOK_IMAGE")
	private String BookImage;
	@Column(name="BOOK_MIMETYPE")
	private String BookMimetype;
	@Column(name="BOOK_FILENAME")
	private String BookFilename;
	@Column(name="BOOK_IMAGE_LAST_UPDATE")
	private Date BookImageLastUpdate;
	@JoinColumn(name = "BOOK_AUT_ID", referencedColumnName = "AUT_ID", nullable = false)
    @ManyToOne(optional = false)
	private LibAuthors bookAutId;
	@JoinColumn(name = "BOOK_CAT_ID", referencedColumnName = "CAT_ID", nullable = false)
    @ManyToOne(optional = false)
	private LibBookCategories bookCatId;
	
	public LibBooks() {
		
	}

}
