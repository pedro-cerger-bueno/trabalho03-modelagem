// Interface Estado
interface Estado {
    String solicita(Pedido pedido);
    String cotacao(Pedido pedido);
    String rejeita(Pedido pedido);
    String encomenda(Pedido pedido);
    String cancela(Pedido pedido);
    String entrega(Pedido pedido);
    String paga(Pedido pedido);
    String arquiva(Pedido pedido);
}

// Classe Pedido
class Pedido {
    private Estado estado;

    public Pedido() {
        this.estado = new Solicitado(); 
    }

    public String solicita() {
        return estado.solicita(this);
    }

    public String cotacao() {
        return estado.cotacao(this);
    }

    public String rejeita() {
        return estado.rejeita(this);
    }

    public String encomenda() {
        return estado.encomenda(this);
    }

    public String cancela() {
        return estado.cancela(this);
    }

    public String entrega() {
        return estado.entrega(this);
    }

    public String paga() {
        return estado.paga(this);
    }

    public String arquiva() {
        return estado.arquiva(this);
    }

    public void setEstado(Estado novoEstado) {
        this.estado = novoEstado;
    }
}

// Estado Solicitado
class Solicitado implements Estado {
    public String solicita(Pedido pedido) {
        return "Solicitado";
    }

    public String cotacao(Pedido pedido) {
        pedido.setEstado(new Cotado());
        return "Cotado";
    }

    public String rejeita(Pedido pedido) {
        return "Ação inválida";
    }

    public String encomenda(Pedido pedido) {
        return "Ação inválida";
    }

    public String cancela(Pedido pedido) {
        return "Ação inválida";
    }

    public String entrega(Pedido pedido) {
        return "Ação inválida";
    }

    public String paga(Pedido pedido) {
        return "Ação inválida";
    }

    public String arquiva(Pedido pedido) {
        return "Ação inválida";
    }
}

// Estado Cotado
class Cotado implements Estado {
    public String solicita(Pedido pedido) {
        return "Ação inválida";
    }

    public String cotacao(Pedido pedido) {
        return "Cotado"; 
    }

    public String rejeita(Pedido pedido) {
        pedido.setEstado(new Rejeitado());
        return "Rejeitado";
    }

    public String encomenda(Pedido pedido) {
        pedido.setEstado(new Encomendado());
        return "Encomendado";
    }

    public String cancela(Pedido pedido) {
        return "Ação inválida";
    }

    public String entrega(Pedido pedido) {
        return "Ação inválida";
    }

    public String paga(Pedido pedido) {
        return "Ação inválida";
    }

    public String arquiva(Pedido pedido) {
        return "Ação inválida";
    }
}

// Estado Encomendado
class Encomendado implements Estado {
    public String solicita(Pedido pedido) {
        return "Ação inválida";
    }

    public String cotacao(Pedido pedido) {
        return "Ação inválida";
    }

    public String rejeita(Pedido pedido) {
        return "Ação inválida";
    }

    public String encomenda(Pedido pedido) {
        return "Encomendado"; 
    }

    public String cancela(Pedido pedido) {
        pedido.setEstado(new Cancelado());
        return "Cancelado";
    }

    public String entrega(Pedido pedido) {
        pedido.setEstado(new Faturado());
        return "Faturado";
    }

    public String paga(Pedido pedido) {
        return "Ação inválida";
    }

    public String arquiva(Pedido pedido) {
        return "Ação inválida";
    }
}

// Estado Faturado
class Faturado implements Estado {
    public String solicita(Pedido pedido) {
        return "Ação inválida";
    }

    public String cotacao(Pedido pedido) {
        return "Ação inválida";
    }

    public String rejeita(Pedido pedido) {
        return "Ação inválida";
    }

    public String encomenda(Pedido pedido) {
        return "Ação inválida";
    }

    public String cancela(Pedido pedido) {
        return "Ação inválida";
    }

    public String entrega(Pedido pedido) {
        return "Faturado"; 
    }

    public String paga(Pedido pedido) {
        pedido.setEstado(new Pago());
        return "Pago";
    }

    public String arquiva(Pedido pedido) {
        return "Ação inválida";
    }
}

// Estado Pago
class Pago implements Estado {
    public String solicita(Pedido pedido) {
        return "Ação inválida";
    }

    public String cotacao(Pedido pedido) {
        return "Ação inválida";
    }

    public String rejeita(Pedido pedido) {
        return "Ação inválida";
    }

    public String encomenda(Pedido pedido) {
        return "Ação inválida";
    }

    public String cancela(Pedido pedido) {
        return "Ação inválida";
    }

    public String entrega(Pedido pedido) {
        return "Ação inválida";
    }

    public String paga(Pedido pedido) {
        return "Pago"; 
    }

    public String arquiva(Pedido pedido) {
        pedido.setEstado(new Fim());
        return "FIM";
    }
}

// Estado Rejeitado
class Rejeitado implements Estado {
    public String solicita(Pedido pedido) {
        return "Ação inválida";
    }

    public String cotacao(Pedido pedido) {
        return "Ação inválida";
    }

    public String rejeita(Pedido pedido) {
        return "Rejeitado"; 
    }

    public String encomenda(Pedido pedido) {
        return "Ação inválida";
    }

    public String cancela(Pedido pedido) {
        return "Ação inválida";
    }

    public String entrega(Pedido pedido) {
        return "Ação inválida";
    }

    public String paga(Pedido pedido) {
        return "Ação inválida";
    }

    public String arquiva(Pedido pedido) {
        pedido.setEstado(new Fim());
        return "FIM";
    }
}

// Estado Cancelado
class Cancelado implements Estado {
    public String solicita(Pedido pedido) {
        return "Ação inválida";
    }

    public String cotacao(Pedido pedido) {
        return "Ação inválida";
    }

    public String rejeita(Pedido pedido) {
        return "Ação inválida";
    }

    public String encomenda(Pedido pedido) {
        return "Ação inválida";
    }

    public String cancela(Pedido pedido) {
        return "Cancelado"; 
    }

    public String entrega(Pedido pedido) {
        return "Ação inválida";
    }

    public String paga(Pedido pedido) {
        return "Ação inválida";
    }

    public String arquiva(Pedido pedido) {
        pedido.setEstado(new Fim());
        return "FIM";
    }
}

// Estado Fim
class Fim implements Estado {
    public String solicita(Pedido pedido) { return "FIM"; }
    public String cotacao(Pedido pedido) { return "FIM"; }
    public String rejeita(Pedido pedido) { return "FIM"; }
    public String encomenda(Pedido pedido) { return "FIM"; }
    public String cancela(Pedido pedido) { return "FIM"; }
    public String entrega(Pedido pedido) { return "FIM"; }
    public String paga(Pedido pedido) { return "FIM"; }
    public String arquiva(Pedido pedido) { return "FIM"; }
}


public class novoPedido {
    public static void main(String[] args) {
        Pedido p1 = new Pedido();
        
        String str = p1.solicita(); //solicitado
        System.out.println("p1-Estado : " + str); 
        
        str = p1.cotacao(); //cotado
        System.out.println("p1-Estado : " + str); 
        
        str = p1.cotacao(); //cotado sem mudar de estado
        System.out.println("p1-Estado : " + str); 
        
        str = p1.encomenda(); //encomendado
        System.out.println("p1-Estado : " + str); 
        
        str = p1.entrega(); //faturado
        System.out.println("p1-Estado : " + str); 
        
        str = p1.paga(); //pago
        System.out.println("p1-Estado : " + str); 
        
        str = p1.arquiva(); //fim
        System.out.println("p1-Estado : " + str); 
    }
}
