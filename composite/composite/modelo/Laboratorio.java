package composite.modelo;

public class Laboratorio extends Folha {
    public Laboratorio(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Laboratorio: " + this.nome);
    }
}