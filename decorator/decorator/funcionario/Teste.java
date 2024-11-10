
package decorator.funcionario;

public class Teste {
    public static void execute() {
        //João
        Componente joao = new Funcionario("João", "Silva");
        Componente p1, p2, p3;

        try {
            p1 = new Programador(80, 20);
            p1.aponta(joao);
            p2 = new Implantador(40, 40);
            p2.aponta(p1);
            p3 = new TreinamentoDeUsuario(60, 40);
            p3.aponta(p2);

            double salarioJoao = p3.calculaSalario();
            System.out.println("Funcionario: João Silva");
            System.out.println("Salário: " + salarioJoao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Maria
        Componente maria = new Funcionario("Maria", "Ferreira");
        Componente m1, m2, m3;

        try {
            m1 = new AnalistaDeSistema(90, 30);
            m1.aponta(maria);
            m2 = new TestadorDeSoftware(20, 40);
            m2.aponta(m1);
            m3 = new Programador(70, 20);
            m3.aponta(m2);

            double salarioMaria = m3.calculaSalario();
            System.out.println("Funcionario: Maria Ferreira");
            System.out.println("Salário: " + salarioMaria);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Teste.execute();
    }
}

/* exemplo dado pelo professor:
package decorator.funcionario;

public class Teste
{
    public static void execute()
    {
        Componente pedroMes11 = new Funcionario("Pedro", "Silva");
        Componente a1, a2, a3, a4, a5;
        try{
            a1 = new AnalistaDeSistema(80f, 40f);
            a1.aponta( pedroMes11 );
            a2 = new ArquitetoDeSoftware(20F, 50F);
            a2.aponta( a1 );
            a3 = new AnalistaDeSistema(40F, 40F);
            a3.aponta( a2 );
            a4 = new ArquitetoDeSoftware(20F, 50F);
            a4.aponta( a3 );
            a5 = new TestadorDeSoftware(20F, 30F);
            a5.aponta( a4 );
            
            double salario = a5.calculaSalario();
            System.out.println(a5.toString());
            System.out.println("Salario: "+a5.calculaSalario());
   
                
            Funcionario: Pedro Silva
            :- Atividade executada: Analista de sistema
              [Numero de horas = 80.0, Valor hora = 40.0] = 3200.0
            :- Atividade executada: Arquiteto de software
              [Numero de horas = 20.0, Valor hora = 50.0] = 1000.0
            :- Atividade executada: Analista de sistema
               [Numero de horas = 40.0, Valor hora = 40.0] = 1600.0
            :- Atividade executada: Arquiteto de software
               [Numero de horas = 20.0, Valor hora = 50.0] = 1000.0
            :- Atividade executada: Testador de Software
               [Numero de horas = 20.0, Valor hora = 30.0] = 600.0
            Salario: 7400.00
                       
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String [] args){
        
        Teste.execute();
        
    }
}  */
