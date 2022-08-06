package br.com.proway.exemplos.orientacao.objetos.banco.dados03;

import java.util.ArrayList;

public interface JogoRepositorioInterface {
    // CRUD
    // CREATE
    int cadastrar(JogoDao jogo);
    // READ
    JogoDao obterPorId(int id);
    ArrayList<JogoDao> obterTodos();
    // UPDATE
    boolean atualizar(JogoDao jogo);
    // DELETE
    boolean apagar(int id);
}
