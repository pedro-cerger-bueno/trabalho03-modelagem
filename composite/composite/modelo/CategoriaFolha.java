package composite.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class CategoriaFolha extends Elemento {
    // Lista para armazenar subelementos na CategoriaFolha
    protected ArrayList<Elemento> subelementos;

    public CategoriaFolha(String nome) {
        super(nome);
        this.subelementos = new ArrayList<>(); // Inicializa a lista de subelementos
    }

    @Override
    public boolean adicionar(Elemento d) {
        // Adiciona um subelemento à CategoriaFolha
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
        System.out.println("CategoriaFolha: " + this.nome);

        // Lista todos os subelementos, se existirem
        for (Elemento e : subelementos) {
            e.listar(nivel + 1);
        }
    }
}
