// composite/modelo/TesteUniversidade.java
package composite.pgarquivo;

import composite.modelo.Andar;
import composite.modelo.Auditorio;
import composite.modelo.Bloco;
import composite.modelo.Campus;
import composite.modelo.Cantina;
import composite.modelo.Corredor;
import composite.modelo.Laboratorio;
import composite.modelo.MyException;
import composite.modelo.Sala;
import composite.modelo.Universidade;
public class TesteUniversidade {
    public static void main(String[] args) {
        try {
            // Criação da universidade principal
            Universidade CRaiz = new Universidade("curitiba");

            // Campus Curitiba
            Campus curitiba = new Campus("curitiba");

            // Bloco Azul no campus Curitiba
            Bloco azul = new Bloco("azul");
            
            // Andares do Bloco Azul
            Andar primeiroAndarAzul = new Andar("primeiro");
            primeiroAndarAzul.adicionar(new Corredor("P1"));
            primeiroAndarAzul.adicionar(new Sala("P2"));
            primeiroAndarAzul.adicionar(new Sala("P3"));

            Andar segundoAndarAzul = new Andar("segundo");
            segundoAndarAzul.adicionar(new Corredor("P4"));
            segundoAndarAzul.adicionar(new Sala("P5"));
            segundoAndarAzul.adicionar(new Laboratorio("P6"));

            // Adiciona os andares ao Bloco Azul
            azul.adicionar(primeiroAndarAzul);
            azul.adicionar(segundoAndarAzul);

            // Bloco Verde no campus Curitiba
            Bloco verde = new Bloco("verde");

            // Andares do Bloco Verde
            Andar terreoAndarVerde = new Andar("terreo");
            terreoAndarVerde.adicionar(new Laboratorio("P7"));
            terreoAndarVerde.adicionar(new Auditorio("P8"));
            terreoAndarVerde.adicionar(new Cantina("P9"));

            Andar primeiroAndarVerde = new Andar("primeiro");
            primeiroAndarVerde.adicionar(new Sala("P10"));
            primeiroAndarVerde.adicionar(new Sala("P11"));
            primeiroAndarVerde.adicionar(new Laboratorio("P12"));

            // Adiciona os andares ao Bloco Verde
            verde.adicionar(terreoAndarVerde);
            verde.adicionar(primeiroAndarVerde);

            // Adiciona os blocos ao campus Curitiba
            curitiba.adicionar(azul);
            curitiba.adicionar(verde);

            // Campus Londrina
            Campus londrina = new Campus("londrina");

            // Blocos do campus Londrina como elementos terminais
            londrina.adicionar(new Auditorio("L1"));
            londrina.adicionar(new Sala("L2"));
            londrina.adicionar(new Laboratorio("L3"));

            // Adiciona os campi à universidade principal
            CRaiz.adicionar(curitiba);
            CRaiz.adicionar(londrina);

            // Exibe a estrutura completa da universidade
            CRaiz.listar(0);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}