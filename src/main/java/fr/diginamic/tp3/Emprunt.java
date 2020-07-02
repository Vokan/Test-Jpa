/**
 * 
 */
package fr.diginamic.tp3;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


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
	
	@ManyToOne
	@JoinColumn(name= "ID_CLIENT")
	private Integer idClient;
	
	@Column (name ="ID")
	private Integer id;
	
	/**
	 * Constructeur
	 *
	 */
	public Emprunt() {
		super();
	}

	/** Getter
	 * @return the dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter
	 * @return the delai
	 */
	public Integer getDelai() {
		return delai;
	}

	/** Setter
	 * @param delai the delai to set
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	/** Getter
	 * @return the idClient
	 */
	public Integer getIdClient() {
		return idClient;
	}

	/** Setter
	 * @param idClient the idClient to set
	 */
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	

	}


