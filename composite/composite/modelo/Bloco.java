// composite/modelo/Bloco.java
package composite.modelo;

public class Bloco extends Composicao {
    public Bloco(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Bloco: " + this.nome);
        super.listar(nivel + 1);  
    }
}
