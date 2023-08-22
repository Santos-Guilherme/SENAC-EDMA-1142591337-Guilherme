package RevisaoED;

public class Vetor {
	private String[] elementos;
	private int tamanho;
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	public void adicionar(String elemento) throws Exception {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}
		else {
			throw new Exception("O vetor está cheio. " + 
								"Não é possível adicionar novos elementos");
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i< this.tamanho -1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	public String busca(int posicao) throws Exception{
		if(posicao >= 0 && posicao<tamanho) {
			return this.elementos[posicao];
		}
		else {
			throw new Exception("Posição inválida");
		}
	}
}

