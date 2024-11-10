package composite.modelo;

public class Universidade extends Composicao {
    public Universidade(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Universidade: " + this.nome);
        super.listar(nivel + 1);  // Chama a listagem interna, sem imprimir o nome novamente
    }
}
