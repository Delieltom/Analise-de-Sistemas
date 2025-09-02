public class Main {

    // Interface nova que o sistema vai usar
    interface INovoPagamento {
        void realizarPagamento(double montante);
    }

    // Classe antiga que já existe no sistema
    static class Pagamento {
        public void processarPagamento(double valor) {
            System.out.println("Processando pagamento de R$ " + valor);
        }
    }

    // Adapter que adapta a classe Pagamento para a interface INovoPagamento
    static class PagamentoAdapter implements INovoPagamento {
        private Pagamento pagamentoAntigo;

        public PagamentoAdapter(Pagamento pagamentoAntigo) {
            this.pagamentoAntigo = pagamentoAntigo;
        }

        @Override
        public void realizarPagamento(double montante) {
            pagamentoAntigo.processarPagamento(montante);
        }
    }

    // Método principal de execução
    public static void main(String[] args) {
        Pagamento pagamentoExistente = new Pagamento();

        INovoPagamento pagamentoAdaptado = new PagamentoAdapter(pagamentoExistente);

        pagamentoAdaptado.realizarPagamento(150.00);
    }
}