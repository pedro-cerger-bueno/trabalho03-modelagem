package composite.pgarquivo;

import composite.modelo.MyException;
import composite.modelo.Elemento;
import composite.modelo.Composicao;
import composite.modelo.CategoriaRaiz;
import composite.modelo.Categoria;
import composite.modelo.CategoriaFolha;
import composite.modelo.Cereal;
import composite.modelo.Bebida;
import composite.modelo.Defumado;
import composite.modelo.Carne;
import composite.modelo.Limpeza;

public class Teste {
    public static void main(String[] args) {
        
            // Criação da categoria raiz
            CategoriaRaiz CRaiz = new CategoriaRaiz("CRaiz");

            // Categoria principal: Comestível
            Categoria comestivel = new Categoria("comestivel");

            // Subcategoria: Proteína Animal dentro de Comestível
            Categoria proteinaAnimal = new Categoria("proteinaAnimal");

            // Categoria Diversos
            Categoria diversos = new Categoria("diversos");

            // Folhas de categoria para Comestível > Proteína Animal
            CategoriaFolha cereal = new CategoriaFolha("cereal");
            CategoriaFolha bebida = new CategoriaFolha("bebida");
            CategoriaFolha defumado = new CategoriaFolha("defumado");
            CategoriaFolha carne = new CategoriaFolha("carne");

            // Instâncias de produtos em cada categoria
            Cereal P1 = new Cereal("P1");
            Cereal P2 = new Cereal("P2");
            Cereal P3 = new Cereal("P3");

            Bebida P4 = new Bebida("P4");
            Bebida P5 = new Bebida("P5");
            Bebida P6 = new Bebida("P6");

            Defumado P7 = new Defumado("P7");
            Defumado P8 = new Defumado("P8");
            Defumado P9 = new Defumado("P9");

            Carne P10 = new Carne("P10");
            Carne P11 = new Carne("P11");
            Carne P12 = new Carne("P12");

            // Folha de categoria para Diversos
            CategoriaFolha limpeza = new CategoriaFolha("limpeza");

            Limpeza L1 = new Limpeza("L1");
            Limpeza L2 = new Limpeza("L2");
            Limpeza L3 = new Limpeza("L3");

            // Adiciona categorias à raiz
            CRaiz.adicionar(comestivel);
            CRaiz.adicionar(limpeza);

            // Adiciona subcategorias a Comestível
            comestivel.adicionar(diversos);
            comestivel.adicionar(proteinaAnimal);

            // Adiciona folhas a Diversos
            diversos.adicionar(cereal);
            diversos.adicionar(bebida);

            // Adiciona folhas a Proteína Animal
            proteinaAnimal.adicionar(defumado);
            proteinaAnimal.adicionar(carne);

            // Adiciona produtos a Cereal
            cereal.adicionar(P1);
            cereal.adicionar(P2);
            cereal.adicionar(P3);

            // Adiciona produtos a Bebida
            bebida.adicionar(P4);
            bebida.adicionar(P5);
            bebida.adicionar(P6);

            // Adiciona produtos a Defumado
            defumado.adicionar(P7);
            defumado.adicionar(P8);
            defumado.adicionar(P9);

            // Adiciona produtos a Carne
            carne.adicionar(P10);
            carne.adicionar(P11);
            carne.adicionar(P12);

            // Adiciona produtos a Limpeza
            limpeza.adicionar(L1);
            limpeza.adicionar(L2);
            limpeza.adicionar(L3);

            // Exibe a estrutura completa das categorias
            CRaiz.listar(0);

         /*catch (MyException e) {
            System.out.println("Erro: " + e.getMessage());
        }*/
    }
}
