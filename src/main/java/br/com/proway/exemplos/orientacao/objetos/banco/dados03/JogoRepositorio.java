package br.com.proway.exemplos.orientacao.objetos.banco.dados03;

import java.sql.Statement;
import java.util.ArrayList;

// INSERT INTO nomeTabela (campos) VALUES (valores);
// SELECT campos FROM nomeTabela WHERE (opcional)
// UPDATE nomeTabela SET campo - valor WHERE id = valorId
// DELETE FROM nomeTabela WHERE id = valorId

public class JogoRepositorio implements JogoRepositorioInterface {
    // Alt + enter para criar todos os @overrides.
    
    private BancoDadosConexao bancoDadosConexao;
    
    // Construtor: definir informaçoes primordiais.
    public JogoRepositorio(){
        bancoDadosConexao = new BancoDadosConexao();
    }
    
    @Override
    public int cadastrar(JogoDao jogo) {
        var conexao = bancoDadosConexao.conectar();
        
        try{
            var sql = "INSERT INTO jogos (nome, tipo) VALUES (?, ?)";
            var preparador = conexao.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            preparador.setString(1, jogo.getNome());
            preparador.setString(2, jogo.getTipo());
            
            preparador.execute();
            var registros = preparador.getGeneratedKeys();
            // Verificar so o banco de dados retornou o id gerado
            if(registros.next()){
                // Retornar o id que foi gerado no banco
                return registros.getInt(1);
            }
            // Retornar para dizer que nao foi possivel cadastrar
            return -1;
            
        }catch(Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public JogoDao obterPorId(int id) {
        try{
            var conexao = bancoDadosConexao.conectar();
            var sql = "SELECT id, nome, tipo FROM jogos WHERE id = ?";
            var preparador = conexao.prepareStatement(sql);
            preparador.setInt(1, id);
            preparador.execute();
            var registros = preparador.getResultSet();
            
            // Verifica se encontrou algum registro
            if(registros.next()){
                var jogo = new JogoDao();
                jogo.setId(Integer.parseInt(registros.getString("id")));
                jogo.setNome(registros.getString("nome"));
                jogo.setTipo(registros.getString("tipo"));
                
                return jogo;
            }
            // Nao encontrou nenhum registro
            return null;
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public ArrayList<JogoDao> obterTodos() {
        // Abrir a conexao com o banco de dados
        var jogos = new ArrayList();
        // Criar lista de jogos vazio, para depois preencher com os dados
        // do banco de dados
            
        var conexao = bancoDadosConexao.conectar();
        
        try{
            var executor = conexao.createStatement();
            var sql = "SELECT id, nome, tipo FROM jogos";
            executor.execute(sql);
            // Obtem a lista de registros consultados da tabela de jogos.
            var registros = executor.getResultSet();
            // Percorre cada um dos registros.
            while(registros.next()){
                // Instanciando um objeto de JogoDao.
                var jogo = new JogoDao();
                jogo.setId(Integer.parseInt(registros.getString("id")));
                jogo.setNome(registros.getString("nome"));
                jogo.setTipo(registros.getString("tipo"));
                jogos.add(jogo);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return jogos;
    }

    @Override
    public boolean atualizar(JogoDao jogo) {
        try{
            var conexao = bancoDadosConexao.conectar();
            var sql = "UPDATE jogos SET nome = ?, tipo = ? WHERE id = ?";
            var preparador = conexao.prepareCall(sql);
           preparador.setString(1, jogo.getNome());
           preparador.setString(2, jogo.getTipo());
           preparador.setInt(3, jogo.getId());

           var quantidadeRegistrosAfetados = preparador.executeUpdate();
           
           var alterou = quantidadeRegistrosAfetados == 1;
           return alterou;
           
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean apagar(int id) {
        try{
            var conexao = bancoDadosConexao.conectar();
            var sql = "DELETE FROM jogos WHERE id = ?";
            var preparador = conexao.prepareStatement(sql);
            preparador.setInt(1, id);
            var registrosAfetados = preparador.executeUpdate();
            
//            if(registrosAfetados == 1){
//                return true;
//            }else {
//                return false;
//            }
//         ou
//            var apagou = registrosAfetados == 1;
//            return apagou;
//         ou
            return registrosAfetados == 1;

            
        }catch(Exception e){
            return false;
        }
    }
    
}
