/**
 * 
 */
package fr.diginamic.tp3;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author vokankocak
 *
 */

@Entity
@Table (name= "EMPRUNT")
public class Emprunt {
	
	@Column(name = "DATE_DEBUT")
	private LocalDate dateDebut;
	
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	
	@Column(name="DELAI")
	private Integer delai;
	
	

	}


