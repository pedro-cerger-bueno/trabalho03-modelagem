package composite.modelo;

public class Auditorio extends Folha {
    public Auditorio(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Auditorio: " + this.nome);
    }
}