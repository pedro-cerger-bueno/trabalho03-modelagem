package composite.modelo;

public class Sala extends Folha {
    public Sala(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Sala: " + this.nome);
    }
}