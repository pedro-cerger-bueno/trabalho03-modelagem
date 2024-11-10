// composite/modelo/portfolio/TestePortfolio.java
package composite.pgarquivo;

import composite.modelo.Atividade;
import composite.modelo.Portfolio;
import composite.modelo.Projeto;
import composite.modelo.ProjetoSimples;
import composite.modelo.Tarefa;

public class TestePortfolio {
    public static void main(String[] args) {
        try {
            // Portfólio principal
            Portfolio praiz = new Portfolio("praiz");

            // Projeto principal e subprojetos
            Projeto projeto1 = new Projeto("Projeto 1");
            Projeto subprojeto1_1 = new Projeto("Subprojeto 1.1");
            Projeto subprojeto1_2 = new Projeto("Subprojeto 1.2");
            ProjetoSimples projeto2 = new ProjetoSimples("Projeto 2");

            // Atividades e tarefas para Subprojeto 1.1
            Atividade atividade1 = new Atividade("Atividade 1");
            atividade1.adicionar(new Atividade("T1"));
            atividade1.adicionar(new Atividade("T2"));
            atividade1.adicionar(new Atividade("T3"));

            Atividade atividade2 = new Atividade("Atividade 2");
            atividade2.adicionar(new Atividade("T4"));
            atividade2.adicionar(new Atividade("T5"));
            atividade2.adicionar(new Atividade("T6"));

            // Adiciona as atividades ao subprojeto 1.1
            subprojeto1_1.adicionar(atividade1);
            subprojeto1_1.adicionar(atividade2);

            // Atividades e tarefas para Subprojeto 1.2
            Atividade atividade8 = new Atividade("Atividade 8");
            atividade8.adicionar(new Atividade("T7"));
            atividade8.adicionar(new Atividade("T8"));
            atividade8.adicionar(new Atividade("T9"));

            Atividade atividade9 = new Atividade("Atividade 9");
            atividade9.adicionar(new Atividade("T10"));
            atividade9.adicionar(new Atividade("T11"));
            atividade9.adicionar(new Atividade("T12"));

            // Adiciona as atividades ao subprojeto 1.2
            subprojeto1_1.adicionar(atividade8);
            subprojeto1_1.adicionar(atividade9);

            // Adiciona subprojetos ao projeto principal
            projeto1.adicionar(subprojeto1_1);
            projeto1.adicionar(subprojeto1_2);

            // Atividade e tarefas para ProjetoSimples (projeto2)
            Atividade atividadeTS = new Atividade("Atividade TS");
            atividadeTS.adicionar(new Atividade("TS1"));
            atividadeTS.adicionar(new Atividade("TS2"));
            atividadeTS.adicionar(new Atividade("TS3"));

            // Adiciona atividade ao ProjetoSimples
            projeto2.adicionar(atividadeTS);

            // Adiciona projetos ao portfólio
            praiz.adicionar(projeto1);
            praiz.adicionar(projeto2);

            // Exibe a estrutura completa do portfólio
            praiz.listar(0);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
