package Singleton;

public class Main {
    public static void main(String[] args) {

        // Testando Singleton do banco de dados
        DBConnection conexao1 = DBConnection.getInstance();
        System.out.println("Status conexão 1: " + conexao1.getStatusConexao());
        DBConnection conexao2 = DBConnection.getInstance();
        System.out.println("Status conexão 2: " + conexao2.getStatusConexao());
        System.out.println("conexao1 == conexao2 ? " + (conexao1 == conexao2));
        System.out.println("\n---- Testando Sessão de Usuário ----");

        // Testando Singleton da sessão de usuário
        SessaoUser sessao1 = SessaoUser.getInstance();
        sessao1.acessarPainel(); // Deve negar acesso
        sessao1.autenticar("Delieltom");
        sessao1.acessarPainel();
        sessao1.setInformacaoCliente("Cliente Fodão");

        System.out.println("Cliente: " + sessao1.getCliente());
        System.out.println("Informação: " + sessao1.getInformacaoCliente());
        SessaoUser sessao2 = SessaoUser.getInstance();
        System.out.println("sessao1 é igual a sessao2? " + "Resposta:" + (sessao1 == sessao2));
    }
}
