package composite.modelo;

public class Defumado extends CategoriaFolha {
    public Defumado(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Defumado: " + this.nome);
    }
}