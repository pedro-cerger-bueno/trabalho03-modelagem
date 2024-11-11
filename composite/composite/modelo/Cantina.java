package composite.modelo;

public class Cantina extends Folha {
    public Cantina(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Cantina: " + this.nome);
    }
}