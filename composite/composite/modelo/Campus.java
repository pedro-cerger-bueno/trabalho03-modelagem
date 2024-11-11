package composite.modelo;

public class Campus extends Composicao {
    public Campus(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Campus: " + this.nome);
        super.listar(nivel + 1);  // Evita a duplicação de "Composição"
    }
}
