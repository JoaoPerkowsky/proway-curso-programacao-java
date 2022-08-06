package br.com.proway.exemplos.orientacao.objetos.banco.dados03;

import java.sql.Statement;
import java.util.ArrayList;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean apagar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
