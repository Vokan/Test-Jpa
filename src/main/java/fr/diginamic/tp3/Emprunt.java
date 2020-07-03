/**
 * 
 */
package fr.diginamic.tp3;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.diginamic.jpa.Livre;


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
	private Client idClient;
	
	@Id
	@Column (name ="ID")
	private Integer id;
	
	@ManyToMany
	@JoinTable(name = "COMPO", joinColumns = @JoinColumn(name="ID_EMP", referencedColumnName = "ID"),
							inverseJoinColumns = @JoinColumn(name="ID_LIV", referencedColumnName = "ID"))
	private Set<Livre>livre;
	
	/**
	 * Constructeur
	 *
	 */
	public Emprunt() {
		super();
	}

	/** Getter
	 * @return the livre
	 */
	public Set<Livre> getLivre() {
		return livre;
	}

	/** Setter
	 * @param livre the livre to set
	 */
	public void setLivre(Set<Livre> livre) {
		this.livre = livre;
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
	public Client getIdClient() {
		return idClient;
	}

	/** Setter
	 * @param idClient the idClient to set
	 */
	public void setIdClient(Client idClient) {
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

	@Override
	public String toString() {
		return dateDebut + " doit être retourné le " + dateFin + ",( delai: " + delai+" jours)" + ", Nom, prénom et identifiant de l'emprunteur: "
				+ idClient + id + livre + "]";
	}
	
	

	}


