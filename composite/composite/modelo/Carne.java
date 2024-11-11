package composite.modelo;

public class Carne extends CategoriaFolha {
    public Carne(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Carne: " + this.nome);
    }
}