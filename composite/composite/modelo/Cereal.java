package composite.modelo;

public class Cereal extends CategoriaFolha {
    public Cereal(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Cereal: " + this.nome);
    }
}