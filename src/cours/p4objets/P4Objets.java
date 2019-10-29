package cours.p4objets;

import java.util.ArrayList;
import java.util.Scanner;

public class P4Objets {

	public static void main(String[] args) {
		// un premier objet : System.out
		System.out.println("Test!");
		// un autre objet qui lui ressemble : System.err
		System.err.println("Test!");
		
		// Créons un objet de type String (chaîne de caractères)
		String s = new String();
		System.out.println("<"+s+">");
		// Créons un autre objet en l'initialisant
		String s2 = new String("test");
		System.out.println("<"+s2+">");
		// pour les chaines on peut aussi écrire :
		s2 = "test";
		
		// Appelons des méthodes sur notre second objet
		System.out.println("<"+s2.charAt(0)+">");
		System.out.println("<"+s2.substring(2)+">");
		System.out.println("<"+s2.toUpperCase()+">");
		
		// Notons qu'ici l'objet n'est pas modifié
		System.out.println("<"+s2+">");
		
		// Créons un objet qui permet de lire du texte
		// System.in est un objet représentant le flux d'entrée d'un programme
		// Comme cet objet ne permet de lire que des octets
		// On utilise en général un objet de type Scanner pour lire des lignes,
		// des nombres entiers, des réels...
		Scanner lecteur = new Scanner(System.in); 
		
		// lisons une ligne de texte
		System.out.println("Tapez quelque chose s'il vous plait :");
		String s3 = lecteur.nextLine();
		System.out.println("Vous avez tapé : "+s3);
		
		// quand on n'en a plus besoin on peut le fermer
		lecteur.close();
		
		// tableau
		// attention il faut créer les "cases" du tableau en utilisant l'opérateur new
		int [] tabEntiers = new int[3];
		// les tableaux fonctionnent un peu comme des objets et ont un attribut length
		// qui stocke la taille du tableau
		// pour les parcourir on commence à 0
		// voilà une boucle pour remplir le tableau
		for(int i=0; i<tabEntiers.length; i++) {
			// on affecte un entier à la i-ème case du tableau
			tabEntiers[i] = i;
		}
		
		// tableau d'objets
		// ici on ne crèe que les cases du tableau
		// il faudra ensuite créer les objets
		String [] tabChaines = new String[3];
		for(int i=0; i<tabChaines.length; i++) {
			// on crèe un objet et on range sa référence dans la case du tableau
			tabChaines[i] = new String("chaine "+i);
		}
		
		// Affichons le tableau
		for(int i=0; i<tabChaines.length; i++) {
			System.out.println(tabChaines[i]);
		}
		
		// on peut aussi écrire
		// la variable chaine prendra successivement la valeur de chaque chaine du tableau
		// on appelle parfois cette boudle un for each
		for(String chaine : tabChaines) {
			System.out.println(chaine);
		}
		
		// Il y a aussi des classes Java qui gèrent des listes d'objets
		// la notation <String> s'appelle un paramètre de généricité
		// la généricité est un concept avancé
		// disons simplement ici qu'on indique à Java qu'on veut
		// une liste de chaînes de caractères
		ArrayList<String> listeChaines = new ArrayList<String>();
		listeChaines.add("une chaine");
		listeChaines.add("une autre chaine");
		// Java sait afficher les listes d'objets
		System.out.println(listeChaines);
		
		// Si on veut une liste d'entier on doit utiliser la classe Integer 
		// qui permet de transformer un entier en objet
		ArrayList<Integer> listeEntiers = new ArrayList<Integer>();
		listeEntiers.add(1);
		listeEntiers.add(2);
		int somme = 0;
		// on peut utiliser un for each par parcourir les listes
		for(int entier : listeEntiers) {
			somme += entier;
		}
		System.out.println("La somme vaut "+somme);
		
	}

}
