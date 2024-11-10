package composite.modelo;

public class Bebida extends CategoriaFolha {
    public Bebida(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Bebida: " + this.nome);
    }
}