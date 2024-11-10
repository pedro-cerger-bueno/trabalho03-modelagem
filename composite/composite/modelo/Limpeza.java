package composite.modelo;

public class Limpeza extends CategoriaFolha {
    public Limpeza(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Limpeza: " + this.nome);
    }
}