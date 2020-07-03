/**
 * 
 */
package fr.diginamic.tp3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * @author vokankocak
 *
 */
public class TestBibliotheque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		 	
		 EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		 	//Extraction de l'emprunt.
		 
		 Emprunt emprunt1= entityManager.find(Emprunt.class, 3);
		 System.out.println("l'emprunt du: "+ emprunt1);
	
		 	// Extraction de tous les emprunts pour un client donnée.
		 
		 List<Emprunt> emprunt = entityManager.find(Client.class, 2).getEmprunt();
		 	
		 for (Emprunt emprunt2 : emprunt) {
			 System.out.println("l'emprunt du: "+emprunt2);
			
		}
		 entityManager.close();
	        entityManagerFactory.close();
	}
}
