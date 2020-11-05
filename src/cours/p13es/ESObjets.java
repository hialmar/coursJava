package cours.p13es;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

// il faut implémenter sérializable pour pouvoir lire et écrire les objets sur les flux
class MaClasse implements Serializable {
	/**
	 * numéro de version de la classe utilisé pour s'assurer qu'on n'a pas modifié
	 * la classe depuis la dernière sauvegarde.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Attributs qui seront sauvegardés avec l'objet. Ils doivent être de type de
	 * base (comme l'int) ou de types sérialisables Vous pouvez vérifier avec les
	 * deux liens suivants que String et Date sont sérialisables :
	 * https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/String.html
	 * https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Date.html
	 * 
	 * Par exemple pour Date on peut lire dans la doc : All Implemented Interfaces:
	 * Serializable, Cloneable, Comparable<Date> Donc il y a bien Serializable
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
	public MaClasse(int entier, String chaine) {
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

public class ESObjets {
	public static void main(String[] args) {
		// on crée l'objet a sauver
		MaClasse var = new MaClasse(1000, "Hello World!");
		// on l'affiche
		System.out.println(var);
		try {
			// Création d'un nouveau flux qui crée un fichier binaire
			FileOutputStream sortie = new FileOutputStream("fichier.bin");
			// On crée un flux plus évolué en encapsulant le précédent flux
			ObjectOutputStream sortieObjets = new ObjectOutputStream(sortie);
			// On écrit l'objet sur le flux
			// Ceci va aussi écrire tous les attributs
			sortieObjets.writeObject(var);
			// il ne faut pas oublier de fermer le flux
			sortieObjets.close(); // ferme aussi sortie
			
			// On va maintenant le relire
			
			// Relisons ce qu'on a écrit
			FileInputStream entree = new FileInputStream("fichier.bin");
			// On crée un flux plus évolué en encapsulant le précédent flux
			ObjectInputStream entreeObjets = new ObjectInputStream(entree);
			
			// On lit un objet sur le flux
			// Ca recrée l'objet et ses attributs (new)
			// Il faut caster car readObject renvoie un Object
			MaClasse var2 = (MaClasse) entreeObjets.readObject();
			// On affiche l'objet lu
			System.out.println(var2);
			
			// on peut bien vérifier qu'il s'agit d'un nouvel objet :
			if(var2 != var) {
				System.out.println("Il s'agit bien d'un autre objet");
			}
			
		} catch (FileNotFoundException e) {
			// en cas de fichier inexistant
			e.printStackTrace();
		} catch (IOException e) {
			// autres erreurs d'E/S
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// si l'objet qu'on lit n'est pas du bon type
			e.printStackTrace();
		}
	}
}
