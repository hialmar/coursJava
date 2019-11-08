package cours.p5classes;

public class Main {

	public static void main(String[] args) {
		// créons un premier chat
		Chat tom = new Chat();
		// faisons le faire quelque chose
		tom.crier();
		// créons un autre chat
		Chat hercule = new Chat();
		// lui aussi peut crier
		hercule.crier();
		
		/*
		// changeons le cri d'hercule
		hercule.cri = "Meow";
		
		// seul le cri d'hercule à changé.
		tom.crier();
		hercule.crier();
		*/

	}

}
