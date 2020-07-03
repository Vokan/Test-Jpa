package fr.diginamic.jpa;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import fr.diginamic.tp3.Emprunt;

@Entity // indique que cette classe correspond à une table => Plat est une entité JPA
@Table(name = "LIVRE")
public class Livre {

	@Id
	
	@Column (name ="ID")
	private Integer id;
	
	@Column(name ="AUTEUR")
	private String auteur;
	
	@Column(name ="TITRE")
	private String titre;
	
	@ManyToMany(mappedBy="livre")
	private Set<Emprunt>emprunt;
	

	/** Constructeur
	 * 
	 */
	public Livre() {
		super();
	}

	
	/** Getter
	 * @return the emprunt
	 */
	public Set<Emprunt> getEmprunt() {
		return emprunt;
	}
	
	/** Setter
	 * @param emprunt the emprunt to set
	 */
	public void setEmprunt(Set<Emprunt> emprunt) {
		this.emprunt = emprunt;
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

	
	/** Getter
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}


	/** Setter
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	/** Getter
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}


	/** Setter
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}


	@Override
	public String toString() {
		return "le livre dont la ref: " + id + ", corresponde au titre: " + titre + ", l'auteur est: "+ auteur;
	}


	
	
	
}
