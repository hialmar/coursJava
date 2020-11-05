package cours.p13es;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class ESTexteBrut {
	public static void main(String[] args) {
		try {
			// Création d'un flux sortie texte et création du fichier texte
			FileWriter sortie = new FileWriter("fichier.txt");
			// Ici aussi, pour écrire à la fin du fichier on peut faire
			//FileWriter sortie = new FileWriter("fichier.txt", true);
			
			// on peut écrire des chaines
			sortie.write("Ecrivons une chaine");
			sortie.write("Ecrivons une autre chaine");
			
			// il ne faut pas oublier de fermer le flux
			sortie.close();
			
			// Essayons de relire les chaines
			FileReader entree = new FileReader("fichier.txt");
			
			// Ici il faut tout faire à la main
			// on doit prévoir un tableau de char suffisamment long
			// ou alors faire plusieurs lectures comme ici :
			char [] tampon = new char[10];
			// ce n'est pas très pratique
			int lu;
			do {
				// lu contiendra le nombre de caractères lus
				// on indique à read qu'il peut écrire de la case 0 à la case finale
				lu = entree.read(tampon, 0, tampon.length);
				if (lu > 0) { // read renvoie -1 quand il n'y a plus rien à lire
					// on doit recréer la chaîne de caractères en 
					// précisant uniquement les cases de 0 jusqu'à la case lu (non comprise)
					String chaine = new String(tampon, 0, lu);
					// on affiche la chaîne
					System.out.println(chaine);
				}
			} while(lu > 0); // tant qu'on a lu quelque chose

			// il vaut mieux fermer le flux
			entree.close();
		} catch (IOException e) {
			// erreurs d'entrée/sortie
			e.printStackTrace();
		}
	}

}
