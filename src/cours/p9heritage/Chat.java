package cours.p9heritage;

public class Chat extends Animal {
	
	public Chat() {
		cri = "Miaou";
	}
	
	public void changerCri(String cri) {
		this.cri = cri;
	}
	
	public void miauler() throws ExceptionChatMuet {
		if(cri == null)
			throw new ExceptionChatMuet();
		this.crier();
	}
	
	public void ronronner() {
		System.out.println("Rrrrrrrrr");
	}

}
