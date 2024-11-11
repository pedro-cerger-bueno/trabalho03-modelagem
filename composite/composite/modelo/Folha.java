package composite.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Folha extends Elemento {
    // Lista para armazenar subelementos, se necessário
    protected ArrayList<Elemento> subelementos;

    public Folha(String nm) {
        super(nm);
        this.subelementos = new ArrayList<>();
    }

    @Override
    public boolean adicionar(Elemento d) throws MyException {
        // Adiciona um subelemento à folha
        subelementos.add(d);
        return true;
    }

    @Override
    public Elemento excluir(String nm) throws MyException {
        // Procura e remove o subelemento pelo nome
        Iterator<Elemento> iterator = subelementos.iterator();
        while (iterator.hasNext()) {
            Elemento e = iterator.next();
            if (e.getNome().equals(nm)) {
                iterator.remove();
                return e;
            }
        }
        throw new MyException("Elemento não encontrado: " + nm);
    }

    @Override
    public Elemento consultar(String nome) throws MyException {
        // Procura e retorna o subelemento pelo nome
        for (Elemento e : subelementos) {
            if (e.getNome().equals(nome)) {
                return e;
            }
        }
        throw new MyException("Elemento não encontrado: " + nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Folha: " + this.nome);

        // Lista todos os subelementos, se existirem
        for (Elemento e : subelementos) {
            e.listar(nivel + 1);
        }
    }
}
