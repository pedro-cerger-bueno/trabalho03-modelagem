package composite.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Composicao extends Elemento {

    private ArrayList<Elemento> elementos;

    public Composicao(String nome) {
        super(nome);
        this.elementos = new ArrayList<>();
    }

    @Override
    public boolean adicionar(Elemento d) {
        return adicionarElemento(d);
    }

    private boolean adicionarElemento(Elemento d) {
        elementos.add(d);
        d.pertenceA(this);
        return true;
    }

    @Override
    public Elemento consultar(String nome) throws MyException {
        return consultarElemento(nome);
    }

    private Elemento consultarElemento(String nome) throws MyException {
        for (Elemento e : elementos) {
            if (e.getNome().equals(nome)) {
                return e;
            }
            if (e instanceof Composicao) {
                try {
                    return ((Composicao) e).consultarElemento(nome);
                } catch (MyException ignored) {}
            }
        }
        throw new MyException("Elemento não encontrado: " + nome);
    }

    @Override
    public Elemento excluir(String nome) throws MyException {
        return excluirElemento(nome);
    }

    private Elemento excluirElemento(String nome) throws MyException {
        Iterator<Elemento> iterator = elementos.iterator();
        while (iterator.hasNext()) {
            Elemento e = iterator.next();
            if (e.getNome().equals(nome)) {
                iterator.remove();
                return e;
            }
            if (e instanceof Composicao) {
                try {
                    return ((Composicao) e).excluirElemento(nome);
                } catch (MyException ignored) {}
            }
        }
        throw new MyException("Elemento não encontrado para exclusão: " + nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Composição: " + this.nome);
        for (Elemento e : elementos) {
            e.listar(nivel + 1);
        }
    }
}
