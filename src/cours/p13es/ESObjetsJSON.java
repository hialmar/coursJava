package cours.p13es;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Date;

import com.google.gson.Gson;

// ici nous n'avons pas besoin de Serializable
// par contre attention aux structures circulaires !
// Une classe A a un attribut de type B qui a un attribut de type A
// JSON ne peut pas gérer cela alors que Serializable le peut.
class Classe2 {
	/**
	 * Attributs qui seront sauvegardés avec l'objet.
	 */
	private int entier;
	private String chaine;
	private Date date;

	/**
	 * Constructeur qui prend un entier et une chaîne en paramètre les affecte aux
	 * attributs récupère la date courante
	 * 
	 * @param entier : l'entier
	 * @param chaine : la chaîne
	 */
	public Classe2(int entier, String chaine) {
		super();
		this.entier = entier;
		this.chaine = chaine;
		this.date = new Date(); // ceci permet de récupérer la date courante
	}

	/**
	 * Méthode toString qui affiche les attributs
	 */
	@Override
	public String toString() {
		return "MaClasse [entier=" + entier + ", chaine=" + chaine + ", date=" + date + "]";
	}
}

public class ESObjetsJSON {

	public static void main(String[] args) {
		try {
			// Création d'un flux sortie texte et création du fichier texte
			FileWriter sortie = new FileWriter("fichier.txt");
			// Ici aussi on peut créer un flux plus évolué en encapsulant le précédent
			PrintWriter sortiePrint = new PrintWriter(sortie);

			// Ici nous allons utiliser la bibliothèque Gson :
			// https://github.com/google/gson
			// Pour la télécharger :
			// https://search.maven.org/artifact/com.google.code.gson/gson/2.8.6/jar
			Gson gson = new Gson();

			Classe2 var = new Classe2(1000, "Hello World!");
			System.out.println(var);

			sortiePrint.println(gson.toJson(var));

			sortiePrint.close();

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
				if (ligne != null) {
					// Tentons de décoder du JSON :
					Classe2 var2 = gson.fromJson(ligne, Classe2.class);
					
					System.out.println(var2);
					
					// on peut bien vérifier qu'il s'agit d'un nouvel objet :
					if(var2 != var) {
						System.out.println("Il s'agit bien d'un autre objet");
					}
				}
			} while (ligne != null); // on boucle tant qu'il reste des lignes
			
			entreeBufferisee.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
