package Fact_Method_Aula02;

public class Main {
    public static void main(String[] args) {
        String metodoEscolhido = "boleto"; // Pode vir de config ou entrada do usuário
        PagamentoFactory factory;

        switch (metodoEscolhido.toLowerCase()) {
            case "paypal":
                factory = new PayPalFactory();
                break;
            case "boleto":
                factory = new BoletoFactory();
                break;
            case "pix":
                factory = new PixFactory();
                break;
            default:
                throw new IllegalArgumentException("Método de pagamento não suportado!");
        }

        Pagamento pagamento = factory.criarPagamento();
        pagamento.processarPagamento(150.00);
    }
}
