package br.com.proway.exemplos.orientacao.objetos.banco.dados03;

public class JogoServico {
    public static void main(String[] args) {
        var jogoRepositorio = new JogoRepositorio();
        
        var jogo = new JogoDao();
        jogo.setNome("Jogo da vida");
        jogo.setTipo("Dificuldade nivel Luiz Alvez");
        
        var idGerado = jogoRepositorio.cadastrar(jogo);
        System.out.println("Id gerado: " + idGerado);
    }
}
