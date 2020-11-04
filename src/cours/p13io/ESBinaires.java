package cours.p13io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ESBinaires {

	public static void main(String[] args) {
		try {
			
			// Création d'un nouveau flux qui crée un fichier binaire
			FileOutputStream sortie = new FileOutputStream("fichier.bin");
			// Note, si on veut ajouter à un fichier existant on peut écrire :
			// FileOutputStream fos = new FileOutputStream("fichier.bin", true);
			
			// on peut écrire des octets
			sortie.write(1);
			
			// ceci provoque une troncature et donc ça écrit 1
			sortie.write(257);
			// ceci provoque aussi une troncature et donc ça écrit 255
			sortie.write(-1);
			
			// il vaut mieux rester sur des octets entre 1 et 255
			
			// on peut aussi écrire un tableau
			byte [] tab = new byte[255];
			for(int i = 0; i<tab.length; i++) {
				tab[i] = (byte)i;
			}
			// ici on écrit
			sortie.write(tab);
			
			// enfin on peut écrire des caractères ascii :
			sortie.write('a');

			// il ne faut pas oublier de fermer le flux pour fermer le fichier
			sortie.close();
			
			// Essayons de relire ce qu'on a écrit
			FileInputStream entree = new FileInputStream("fichier.bin");
			
			int b;
			do {
				b = entree.read(); // renvoie -1 quand le fichier est fermé
				System.out.println(b);
				if (b >= 32 && b <= 126) {
					// ce peut être un caractère affichable
					// cf https://en.wikipedia.org/wiki/ASCII#Printable_characters
					System.out.println((char)b);
				}
			} while(b>=0);
			
			// ici aussi il vaut mieux fermer le flux
			entree.close();
			
		} catch (FileNotFoundException e) {
			// Si le fichier n'existe pas
			e.printStackTrace();
		} catch (IOException e) {
			// pour tout autre erreur d'entrée/sortie
			e.printStackTrace();
		}

	}

}
