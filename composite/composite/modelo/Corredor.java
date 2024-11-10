package composite.modelo;

public class Corredor extends Folha {
    public Corredor(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Corredor: " + this.nome);
    }
}