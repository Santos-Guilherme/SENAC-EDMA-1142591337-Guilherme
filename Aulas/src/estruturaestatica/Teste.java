package estruturaestatica;

public class Teste {
	public static void main(String []args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		Lista<Integer> lista = new Lista<Integer>();

		for(int i = 1; i <= 12; i++) {
			pilha.empilha(i);
		}
		
		for(int i = 1; i <= 10; i++) {
			lista.adiciona(i);
		}
		
		lista.adiciona(1, 26);
		
		System.out.println("Pilha:");
		System.out.println(pilha.estaVazia());
		System.out.println(pilha);
		System.out.println("O número " + pilha.topo() + " será desempilhado.");
		pilha.desempilha();
		System.out.println(pilha);
		
		System.out.println("Lista:");
		System.out.println(lista.estaVazia());
		System.out.println(lista);
		System.out.println("Esta lista possui " + lista.tamanho() + " elementos.");
	}
}
