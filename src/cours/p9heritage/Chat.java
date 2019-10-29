package cours.p9heritage;

public class Chat extends Animal {
	
	public Chat() {
		cri = "Miaou";
	}
	
	public void miauler() {
		this.crier();
	}
	
	public void ronronner() {
		System.out.println("Rrrrrrrrr");
	}

}
