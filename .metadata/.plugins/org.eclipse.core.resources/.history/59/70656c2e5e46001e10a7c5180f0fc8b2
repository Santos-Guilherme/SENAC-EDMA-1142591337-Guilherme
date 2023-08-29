package RevisaoED;

import javax.swing.JOptionPane;

public class Executor {
	public static void main(String []args) {
		VetorObjeto vetor = new VetorObjeto(5);
		
		Contato c1 = new Contato("Claudio", "9999-2525", "claudio@gmail.com");
		Contato c2 = new Contato("Daniel", "9999-7213", "daniel@gmail.com");
		Contato c3 = new Contato("Miguel", "9999-0101", "miguel@gmail.com");

		try {
		
		vetor.adicionar(c1);
		vetor.adicionar(c1);
		vetor.adicionar(c3);
		}
		
		catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Tamanho do vetor: " + vetor.tamanho());
		
		System.out.println(vetor);
	}
}
