package br.com.proway.exemplos.orientacao.objetos.banco.dados03;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class BancoDadosConexao {
    public Connection conectar(){
        try{
            var conexao = DriverManager.getConnection(
            "jdbc:mysql://localhost/lojaBd", "root", "admin");
            return conexao;
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Nao foi possivel conectar ao"
                    + " banco de dados");
            // Encerra a aplicaçao, pois nao faz sentido o usuario utilizar o sistema
            // se o mesmo nao consegue acesso aos dados.
            System.exit(0);
            
            return null;
        }
    }
}
