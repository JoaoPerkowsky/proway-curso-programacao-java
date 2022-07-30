package br.com.proway.exemplos.orientacao.objetos.banco.dados01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExemploBancoDados {
    public static void main(String[] args) {
        try{
            Connection conexao = DriverManager
                    .getConnection("jdbc:mysql://Localhost:3306/lojaBd",
                            "root", "admin");
            
            System.out.println("Conexao aberta com sucesso");
            
//            Statement executor = conexao.createStatement();
//            executor.execute("INSERT INTO carros (modelo, marca, preco)" +
//                    "VALUES ('Kombi', 'VK', 52000)" );
//            System.out.println("Registro criado com sucesso");
//
//        Statement executor = conexao.createStatement();
//        executor.execute("DELETE FROM carros WHERE id = 1");
//        System.out.println("Registro apagado com sucesso");

// CRUD Create(Insert), Read(Select), Update(Update), Delete(Delete).
//            Statement executor = conexao.createStatement();
//            executor.execute("UPDATE carros SET modelo = 'Fiat uno tunado com escada',"
//            + "marca = 'Fiat' WHERE id = 3");
//            System.out.println("Registro atualizado com sucesso");

            Statement executor = conexao.createStatement();
            executor.execute("SELECT id, modelo, marca, preco FROM carros");
            
            // Obter os dados Da consulta para variaveis no JAVA
            ResultSet registros = executor.getResultSet();
            
            while(registros.next()){
                int id = Integer.parseInt(registros.getString("id"));
                String modelo = registros.getString("modelo");
                String marca = registros.getString("marca");
                double preco = Double.parseDouble(registros.getString("preco"));
                System.out.println(
                "Codigo: " + id + 
                        " - Modelo: " + modelo +
                        " - Marca: " + marca +
                        " - Preço: " + preco + "\n");
            }
            
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Nao foi possivel conectar");
        }
        
    }
    
}
