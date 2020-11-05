package cours.p13es;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ESTexteBufferise {

	public static void main(String[] args) {
		try {
			// Création d'un flux sortie texte et création du fichier texte
			FileWriter sortie = new FileWriter("fichier.txt");
			// Ici aussi on peut créer un flux plus évolué en encapsulant le précédent
			PrintWriter sortiePrint = new PrintWriter(sortie);
			
			// PrintWriter à les mêmes méthodes que System.out
			sortiePrint.println("Ecrivons une chaine et passons à la ligne");
			sortiePrint.println("Ecrivons une autre ligne");
			// Il faut fermer le flux
			sortiePrint.close(); // appelle sortie.close();
			
			// Lisons de façon bufferisée
			FileReader entree = new FileReader("fichier.txt");
			// On crée un BufferedReader qui gérera automatiquement le tampon de lecture
			BufferedReader entreeBufferisee = new BufferedReader(entree);
			
			// Ici on pourra directement lire les lignes sous forme de chaînes
			String ligne;
			do {
				// lit une ligne de texte
				ligne = entreeBufferisee.readLine();
				// renvoie null si le fichier est terminé
				if(ligne != null) {
					// affiche la ligne lue
					System.out.println(ligne);
				}
			} while(ligne != null); // on boucle tant qu'il reste des lignes
			
			// il vaut mieux fermer le flux
			entreeBufferisee.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
