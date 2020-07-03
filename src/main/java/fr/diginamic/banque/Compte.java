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
import javax.persistence.OneToMany;
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
	 @Column(name="ID")
	 private Integer id;
	 
	 @Column
	 private String numero;
	 
	 @Column
	 private double solde;
	 
	 @ManyToMany(mappedBy="compte")
	 private List<Client> client;
	 
	 @OneToMany(mappedBy="COMPTE")
	 private List<Operation> operation;

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
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/** Setter
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/** Getter
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/** Getter
	 * @return the client
	 */
	public List<Client> getClient() {
		return client;
	}

	/** Setter
	 * @param client the client to set
	 */
	public void setClient(List<Client> client) {
		this.client = client;
	}

	/** Getter
	 * @return the operation
	 */
	public List<Operation> getOperation() {
		return operation;
	}

	/** Setter
	 * @param operation the operation to set
	 */
	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}
	 
}
