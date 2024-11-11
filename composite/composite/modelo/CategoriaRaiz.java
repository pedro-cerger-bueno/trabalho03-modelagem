package composite.modelo;

public class CategoriaRaiz extends Categoria {
    public CategoriaRaiz(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("CategoriaRaiz: " + this.nome);
        super.listar(nivel + 1);
    }
}
