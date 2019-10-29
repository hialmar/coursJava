package cours.p1programmes;

import java.util.Scanner;

public class Test {
	// un exemple de fonction
	public static int addition(int a, int b) {
       return a + b;
    }
    
	// la fonction main
    public static void main(String[] args) {
    	// déclaration de variable
        int x, y, z;
        
        // ce qui permet de lire au clavier
        Scanner stdin = new Scanner(System.in);
        
        // lectures clavier
        System.out.println("Tapez un entier :");
        x = stdin.nextInt();
        System.out.println("Tapez un entier :");
        y = stdin.nextInt();
        
        // calcul
        z = addition(x,y);
        
        // affichage
        System.out.println(x+" "+y+" "+z);
        
        // fermeture de ce qui permet de lire au clavier
        stdin.close();
    }
	
}
