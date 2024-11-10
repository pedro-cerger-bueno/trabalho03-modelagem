// composite/modelo/CategoriaFolha.java
package composite.modelo;

public class CategoriaFolha extends Elemento {
    
    public CategoriaFolha(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("CategoriaFolha: " + this.nome);
    }

    @Override
    public boolean adicionar(Elemento d) {
        throw new UnsupportedOperationException("Operação 'adicionar' não é válida em CategoriaFolha.");
    }

    @Override
    public Elemento consultar(String nome) throws MyException {
        if (this.nome.equals(nome)) {
            return this;
        }
        throw new MyException("Elemento não encontrado: " + nome);
    }

    @Override
    public Elemento excluir(String nome) throws MyException {
        throw new MyException("Não é possível excluir de uma CategoriaFolha.");
    }
}
