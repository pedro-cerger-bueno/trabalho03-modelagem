// interpretador.prefixada/Teste.java
package interpretador.prefixada;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        try {
            // Configuração dos operandos e variáveis
            Constante c1 = new Constante(20.0);
            Constante c2 = new Constante(40.0);
            Variavel v1 = new Variavel("v1", 10.0);
            Variavel v2 = new Variavel("v2", 100.0);
            Variavel n = new Variavel("n", 10);

            // Expressão fatorial
            ArrayList<Expressao> fatorialElemento = new ArrayList<>();
            fatorialElemento.add(n);

            // Expressões aritméticas
            ArrayList<Expressao> adicaoElemento = new ArrayList<>();
            adicaoElemento.add(c1);
            adicaoElemento.add(v1);
            Adicao a = new Adicao(adicaoElemento);

            ArrayList<Expressao> subtracaoElemento = new ArrayList<>();
            subtracaoElemento.add(a);
            subtracaoElemento.add(v1);
            Subtracao s = new Subtracao(subtracaoElemento);

            ArrayList<Expressao> divisaoElemento = new ArrayList<>();
            divisaoElemento.add(s);
            divisaoElemento.add(a);
            Divisao d = new Divisao(divisaoElemento);

            ArrayList<Expressao> multiplicacaoElemento = new ArrayList<>();
            multiplicacaoElemento.add(a);
            multiplicacaoElemento.add(s);
            Multiplicacao m = new Multiplicacao(multiplicacaoElemento);

            // Lista das expressões
            ArrayList<Expressao> programa = new ArrayList<>();
            programa.add(a);
            programa.add(s);
            programa.add(d);
            programa.add(m);

            // Executa e exibe cada expressão
            for (Expressao exp : programa) {
                System.out.println(exp.toString() + " = " + exp.resolva());
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
