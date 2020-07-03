/**
 * 
 */
package fr.diginamic.banque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author vokankocak
 *
 */
 @Entity
 @Table(name="COMPTE")
public class Compte {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
	 @Column
	 private String numero;
	 
	 @Column
	 private double solde;
	 
	 @ManyToMany(mappedBy="compte")
	 private List<Client> client;
	 
}
