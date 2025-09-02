package Singleton;

/* Um Singleton que representa a sessão de um usuário */

public class SessaoUser {

    private static SessaoUser instancia;
    private String nomeCliente;
    private String informacao;
    private boolean autenticado = false;

    private SessaoUser() {
        System.err.println("Sessão de usuário criada");
    }

    public static SessaoUser getInstance() {
        if (instancia == null) {
            instancia = new SessaoUser();
        }
        return instancia;
    }

    public void autenticar(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.autenticado = true;
        System.out.println("Usuário autenticado: " + nomeCliente);
    }

    public void acessarPainel() {
        if (autenticado) {
            System.out.println("Bem-vindo ao painel, " + nomeCliente);
        } else {
            System.out.println("Acesso negado. Usuário não autenticado.");
        }
    }

    public String getCliente() {
        if (autenticado) {
            return nomeCliente;
        } else {
            return "Usuário não autenticado.";
        }
    }

    public void setInformacaoCliente(String info) {
        if (autenticado) {
            this.informacao = info;
            System.out.println("Informação atualizada para o cliente: " + info);
        } else {
            System.out.println("Não é possível atualizar. Usuário não autenticado.");
        }
    }

    public String getInformacaoCliente() {
        if (autenticado) {
            return informacao;
        } else {
            return "Sem acesso à informação.";
        }
    }
}
