package composite.modelo;

public class Categoria extends Composicao {
    
    public Categoria(String nome) {
        super(nome); // chama o construtor da classe Composicao para definir o nome
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel); // método auxiliar para identação na listagem
        System.out.println("Categoria: " + this.nome);
        super.listar(nivel + 1); // chama o método listar da superclasse Composicao
    }
}
