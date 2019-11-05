package cours.p4objets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class P4Tableaux {

	public static void main(String[] args) {
		// tableaux
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
		// ça marche aussi pour les tableaux d'entiers.
		for(int i : tabEntiers) {
			System.out.println(i);
		}
		
		// Il y a aussi des classes Java qui gèrent des listes d'objets
		// la notation <String> s'appelle un paramètre de généricité
		// la généricité est un concept avancé
		// disons simplement ici qu'on indique à Java qu'on veut
		// une liste de chaînes de caractères
		ArrayList<String> listeChaines = new ArrayList<String>();
		listeChaines.add("une chaine");
		listeChaines.add("une autre chaine");
		listeChaines.add("une chaine");
		
		// pour consulter la première chaine :
		System.out.println(listeChaines.get(0));
		// Java sait afficher les listes d'objets
		System.out.println(listeChaines);
		
		// Si on veut une liste d'entier on doit utiliser le type Integer 
		// qui permet de transformer un entier en objet
		ArrayList<Integer> listeEntiers = new ArrayList<Integer>();
		listeEntiers.add(1);
		listeEntiers.add(2);
		int somme = 0;
		// on peut utiliser un for each pour parcourir les listes
		for(int entier : listeEntiers) {
			somme += entier;
		}
		System.out.println("La somme vaut "+somme);
		
		// Si on veut gérer un ensemble non ordonné dans lequel un élément 
		// ne peut pas être dupliqué on peut utliser à la place de ArrayList : HashSet
		HashSet<String> ensembleChaines = new HashSet<String>();
		ensembleChaines.add("une chaine");
		ensembleChaines.add("une autre chaine");
		// si on ajoute une chaine identique, elle n'apparaitra pas dans l'ensemble
		// il ne se passe donc rien
		ensembleChaines.add("une chaine");
		// Java sait afficher les ensembles d'objets
		System.out.println(ensembleChaines);
		// On peut demander si une chaine est présente dans l'ensemble
		if (ensembleChaines.contains("une chaine")) {
			System.out.println("La chaine 'une chaine' est bien présente.");
		}
		
		// Parfois nous avons besoin d'indicer les éléments d'un tableau
		// par des indices non entiers. Dans ce cas, on peut utiliser le type HashMap
		// On précisera entre < et > d'abord le type des indices (appelées ici des clés)
		// et le type des "cases" du tableau (appelées ici des valeurs)
		HashMap<String, Integer> populations = new HashMap<String, Integer>();
		populations.put("France", 66);
		populations.put("Japon", 126);
		populations.put("Irlande", 5);
		
		// Pour obtenir une valeur en particulier on fera :
		System.out.println("Population du Japon : "+populations.get("Japon"));
		
		// Voilà une des façons de parcourir une HashMap
		// On peut remarquer que Java réordonne les éléments comme il veut dans ce cas
		for (HashMap.Entry<String, Integer> me : populations.entrySet()) {
			System.out.println("Pays : "+me.getKey() + ", Population : " 
					+ me.getValue() + " Millions.");
	    }
		
	}

}
