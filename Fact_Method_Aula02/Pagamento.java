package Fact_Method_Aula02;

interface Pagamento {
    void processarPagamento(double valor);
}

class PagamentoPayPal implements Pagamento {
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via PayPal...");
    }
}

class PagamentoBoleto implements Pagamento {
    public void processarPagamento(double valor) {
        System.out.println("Gerando boleto no valor de R$" + valor + "...");
    }
}

class PagamentoPix implements Pagamento {
    public void processarPagamento(double valor) {
        System.out.println("Enviando chave PIX para pagamento de R$" + valor + "...");
    }
}

abstract class PagamentoFactory {
    public abstract Pagamento criarPagamento();
}

class PayPalFactory extends PagamentoFactory {
    public Pagamento criarPagamento() {
        return new PagamentoPayPal();
    }
}

class BoletoFactory extends PagamentoFactory {
    public Pagamento criarPagamento() {
        return new PagamentoBoleto();
    }
}

class PixFactory extends PagamentoFactory {
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }
}
