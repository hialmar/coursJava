package cours.p13es;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ESTypes {

	public static void main(String[] args) {
		try {
			// Création d'un nouveau flux qui crée un fichier binaire
			FileOutputStream sortie = new FileOutputStream("fichier.bin");
			// On crée un flux plus évolué en encapsulant le précédent flux
			DataOutputStream sortieTypes = new DataOutputStream(sortie);
			
			// On peut écrire ce qu'on veut comme type de base :
			sortieTypes.writeBoolean(true);
			sortieTypes.writeDouble(2.5);
			sortieTypes.writeInt(1000);
			sortieTypes.writeChar('A');
			
			// On peut aussi écrire des chaines de caractères
			sortieTypes.writeUTF("Hello World!");
			
			// Il faut fermer l'un des flux pour fermer le fichier
			sortieTypes.close(); // appelle sortie.close();
			sortie.close(); // inutile ici
			
			// Relisons ce qu'on a écrit
			FileInputStream entree = new FileInputStream("fichier.bin");
			// On crée un flux plus évolué en encapsulant le précédent flux
			DataInputStream entreeTypes = new DataInputStream(entree);
			
			// Attention à l'ordre de lecture !
			int i = entreeTypes.readInt();
			System.out.println(i);
			boolean b = entreeTypes.readBoolean();
			System.out.println(b);
			double d = entreeTypes.readDouble();
			System.out.println(d);

			char c = entreeTypes.readChar();
			System.out.println(c);
			String s = entreeTypes.readUTF();
			System.out.println(s);
			
			// il vaut mieux fermer
			entreeTypes.close();
			
		} catch (FileNotFoundException e) {
			// si un fichier n'existe pas
			e.printStackTrace();
		} catch (IOException e) {
			// pour tout autre erreur d'E/S
			e.printStackTrace();
		}

	}

}
