package br.com.proway.exemplos.orientacao.objetos.banco.dados03;

// DAO: Data Access Object (Representaçao do objeto contido em uma tabela).
public class JogoDao {
    private int id;
    private String nome;
    private String tipo;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
