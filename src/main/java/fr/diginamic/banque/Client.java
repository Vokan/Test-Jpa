/**
 * 
 */
package fr.diginamic.banque;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author vokankocak
 *
 */

@Entity
@Table(name="CLIENT")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name ="PRENOM")
	private String prenom;
	
	@Column(name ="DATE_NAISSANCE")
	private LocalDate dateNaissance;
	
	@ManyToOne
	@JoinColumn(name="ID")
	private Banque banque;
	
	@ManyToMany
	@JoinTable(name="CLIENT_COMPTE",
				joinColumns =@JoinColumn(name ="ID_CLIENT", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name= "ID_COMPTE", referencedColumnName ="ID"))
	private Set<Compte> compte;
	
}
