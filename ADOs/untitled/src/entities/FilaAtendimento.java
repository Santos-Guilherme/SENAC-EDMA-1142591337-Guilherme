package entities;

public class FilaAtendimento {

    private Fila<String> filaNormal;
    private Fila<String> filaPreferencial;

    public FilaAtendimento () {
        filaNormal = new Fila<>();
        filaPreferencial = new Fila<>();
    }

    public void adicionaSenha (String senha, boolean preferencial) {
        if (preferencial) {
            filaPreferencial.adiciona(senha);
            System.out.println("Senha preferencial adicionada: " + senha);
        } else {
            filaNormal.adiciona(senha);
            System.out.println("Senha normal adicionada: " + senha);
        }
    }

    public void chamarProximo() {
        if (!filaPreferencial.estaVazia()) {
            String senha = filaPreferencial.espiar();
            System.out.println("Chamando próximo paciente preferencial: " + senha);
        } else if (!filaNormal.estaVazia()) {
            String senha = filaNormal.espiar();
            System.out.println("Chamando próximo paciente normal: " + senha);
        } else {
            System.out.println("Não há pacientes na fila.");
        }
    }
}