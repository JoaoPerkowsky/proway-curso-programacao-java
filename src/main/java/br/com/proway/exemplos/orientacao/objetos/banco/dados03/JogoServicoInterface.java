package br.com.proway.exemplos.orientacao.objetos.banco.dados03;

import java.util.ArrayList;

interface JogoServicoInterface {
    int adicionar(String nome, String especie);
    boolean atualizar(int id, String nome, String especie);
    boolean apagar(int id);
    JogoDao obterPorId(int id);
    ArrayList<JogoDao> obterTodos();
}
