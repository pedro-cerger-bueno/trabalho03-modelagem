package interpretador.prefixada;

import java.util.ArrayList;

public class Fatorial extends Operador {
    public Fatorial(ArrayList<Expressao> elemento) {
        super(elemento);
    }

    @Override
    public char simbolo() {
        return '!';
    }

    @Override
    public double resolva() {
        int n = (int) this.elemento.get(0).resolva();
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
