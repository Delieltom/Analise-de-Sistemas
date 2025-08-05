package Singleton;

/*Um Singleton que cria um objeto que representa a conexão com um BD*/

public class DBConnection{
    
    private static DBConnection conexao; //Ponto acesso global
    private int statusConexao = 0;

    private DBConnection(){ //Construtor privado. Somente o singleton pode "fazer"
        System.err.println("Criando conexão com o banco");
        this.statusConexao = 1;
    }

    public static DBConnection getInstance(){
        if(conexao == null){//Verifica se o objeto já existe
            conexao = new DBConnection();
        }
        return conexao;
    }

    public int getStatusConexao(){
        return this.statusConexao;
    }

}