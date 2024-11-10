// composite/modelo/Andar.java
package composite.modelo;

public class Andar extends Composicao {
    public Andar(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Andar: " + this.nome);
        super.listar(nivel + 1);
    }
}
