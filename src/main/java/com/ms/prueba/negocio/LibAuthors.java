package com.ms.prueba.negocio;

import java.sql.Date;
import java.time.LocalDate;

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
@Table(name = "LIB_AUTHORS")
public class LibAuthors {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_authors")
    @SequenceGenerator(name = "seq_authors", sequenceName = "seq_authors", initialValue = 1, allocationSize = 1)	
	@Column(name = "AUT_ID")
	private long AutId;
	@Column(name="AUT_FIRST_NAME")
	private String AutFirstName;
	@Column(name="AUT_LAST_NAME")
	private String AutLastName;
	@Column(name="AUT_DATE_DOB")
	private Date AutDateDob;
	@Column(name="AUT_GENDER")
	private String AutGender;
	@Column(name="AUT_CONTACT")
	private String AutContact;
	@Column(name="AUT_OTHER_DETAILS")
	private String AutOtherDetails;
	
	public LibAuthors() {
		
	}

}
