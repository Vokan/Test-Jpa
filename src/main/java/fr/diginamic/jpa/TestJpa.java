package fr.diginamic.jpa;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


/**
 * 
 */

/**
 * @author vokankocak
 *
 */
public class TestJpa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Création d'une instance d’entityManagerFactory.
		
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		 
		 //Créaton d'une instance d'entityManager.
		 EntityManager entityManager = entityManagerFactory.createEntityManager();
		 
		 // Extaire un livre.
	        Livre livre = entityManager.find(Livre.class, 1);
	        System.out.println(livre.getTitre()+" --> dont l'auteur est: " +livre.getAuteur());
	     
	     // Inserer un nouveau livre.
	     //   Livre nouveauLivre= new Livre();
	     //   nouveauLivre.setId(6);
	     //   nouveauLivre.setAuteur("Robin Hobb");
	     //   nouveauLivre.setTitre("L'assassin royal");
	        
	     // Constrainte JPA => la modification doit se faire dans le cadre d'une transaction.
	     //   EntityTransaction transaction = entityManager.getTransaction(); 
	        
	     //   transaction.begin();
	     //   entityManager.persist(nouveauLivre);
	     //   transaction.commit();
	        
	     // modifier la ligne d'Id 5.
	        Livre livreModif = entityManager.find(Livre.class, 5);
	       
	        EntityTransaction transaction2 = entityManager.getTransaction();
	        
	        transaction2.begin();
	        livreModif.setTitre("Du plaisir dans la cuisine");
	        transaction2.commit();
	        
	     // Requête JPQL Titre.
	       
	        TypedQuery<Livre> query = entityManager.createQuery("select l from Livre l where l.titre = 'L''assassin royal' ", Livre.class);
	        Livre livre2 = query.getResultList().get(0);
	        System.out.println(livre2.getTitre()+ " --> dont l'auteur est: " +livre2.getAuteur());
	        
	        TypedQuery<Livre> query2 = entityManager.createQuery("select l from Livre l where l.auteur = 'Jules Verne' ", Livre.class);
	        Livre livre3 = query2.getResultList().get(0);
	        System.out.println(livre3.getAuteur()+ " est l'auteur de:  " +livre3.getTitre());
	        
	     // Suppression de livre.
	        Livre livreSupprimer = entityManager.find(Livre.class, 4);
	        EntityTransaction transaction3 = entityManager.getTransaction();
	        
	        transaction3.begin();
	        entityManager.remove(livreSupprimer);
	        transaction3.commit();
	        
	        TypedQuery<Livre> query3 = entityManager.createQuery("select l from Livre l", Livre.class);
	        List<Livre> listeDeLivre = query3.getResultList();
	        
	        	for(Livre livreListe:listeDeLivre) {
	        		System.out.println(livreListe.getAuteur()+" "+livreListe.getTitre());
	        	}
	        entityManager.close();
	        entityManagerFactory.close();
	}

}
