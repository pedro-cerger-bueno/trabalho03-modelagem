interface Estado {
    String solicita(Pedido pedido) throws IllegalStateException;
    String cotacao(Pedido pedido) throws IllegalStateException;
    String rejeita(Pedido pedido) throws IllegalStateException;
    String encomenda(Pedido pedido) throws IllegalStateException;
    String cancela(Pedido pedido) throws IllegalStateException;
    String entrega(Pedido pedido) throws IllegalStateException;
    String paga(Pedido pedido) throws IllegalStateException;
    String arquiva(Pedido pedido) throws IllegalStateException;
}


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


class Solicitado implements Estado {
    public String solicita(Pedido pedido) {
        return "Solicitado";
    }

    public String cotacao(Pedido pedido) {
        pedido.setEstado(new Cotado());
        return "Cotado";
    }

    public String rejeita(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Solicitado");
    }

    public String encomenda(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Solicitado");
    }

    public String cancela(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Solicitado");
    }

    public String entrega(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Solicitado");
    }

    public String paga(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Solicitado");
    }

    public String arquiva(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Solicitado");
    }
}


class Cotado implements Estado {
    public String solicita(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Cotado");
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
        throw new IllegalStateException("Ação inválida no estado Cotado");
    }

    public String entrega(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Cotado");
    }

    public String paga(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Cotado");
    }

    public String arquiva(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Cotado");
    }
}


class Encomendado implements Estado {
    public String solicita(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Encomendado");
    }

    public String cotacao(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Encomendado");
    }

    public String rejeita(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Encomendado");
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
        throw new IllegalStateException("Ação inválida no estado Encomendado");
    }

    public String arquiva(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Encomendado");
    }
}


class Faturado implements Estado {
    public String solicita(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Faturado");
    }

    public String cotacao(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Faturado");
    }

    public String rejeita(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Faturado");
    }

    public String encomenda(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Faturado");
    }

    public String cancela(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Faturado");
    }

    public String entrega(Pedido pedido) {
        return "Faturado"; 
    }

    public String paga(Pedido pedido) {
        pedido.setEstado(new Pago());
        return "Pago";
    }

    public String arquiva(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Faturado");
    }
}


class Pago implements Estado {
    public String solicita(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Pago");
    }

    public String cotacao(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Pago");
    }

    public String rejeita(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Pago");
    }

    public String encomenda(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Pago");
    }

    public String cancela(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Pago");
    }

    public String entrega(Pedido pedido) {
        throw new IllegalStateException("Ação inválida no estado Pago");
    }

    public String paga(Pedido pedido) {
        return "Pago"; 
    }

    public String arquiva(Pedido pedido) {
        pedido.setEstado(new Fim());
        return "FIM";
    }
}


class Fim implements Estado {
    public String solicita(Pedido pedido) { throw new IllegalStateException("Ação inválida no estado FIM"); }
    public String cotacao(Pedido pedido) { throw new IllegalStateException("Ação inválida no estado FIM"); }
    public String rejeita(Pedido pedido) { throw new IllegalStateException("Ação inválida no estado FIM"); }
    public String encomenda(Pedido pedido) { throw new IllegalStateException("Ação inválida no estado FIM"); }
    public String cancela(Pedido pedido) { throw new IllegalStateException("Ação inválida no estado FIM"); }
    public String entrega(Pedido pedido) { throw new IllegalStateException("Ação inválida no estado FIM"); }
    public String paga(Pedido pedido) { throw new IllegalStateException("Ação inválida no estado FIM"); }
    public String arquiva(Pedido pedido) { return "FIM"; }
}



public class novoPedido {
    public static void main(String[] args) {
        Pedido p1 = new Pedido();
        
        String str = p1.solicita(); 
        System.out.println("p1-Estado : " + str); 
        
        str = p1.cotacao(); 
        System.out.println("p1-Estado : " + str); 
        
        str = p1.cotacao(); 
        System.out.println("p1-Estado : " + str); 
        
        str = p1.encomenda(); 
        System.out.println("p1-Estado : " + str); 
        
        str = p1.entrega(); 
        System.out.println("p1-Estado : " + str); 
        
        str = p1.paga(); 
        System.out.println("p1-Estado : " + str); 
        
        str = p1.arquiva(); 
        System.out.println("p1-Estado : " + str); 
    }
}
