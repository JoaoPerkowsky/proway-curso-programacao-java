package br.com.proway.exemplos.orientacao.objetos.telas;

import java.util.ArrayList;

public class PessoaServico {
    private ArrayList<Pessoa> pessoas = new ArrayList();
    
    // Método que permite armazenar o objeto de uma pessoa em uma lista de pessoas
    public void adicionar(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    
    // Método que permite obter a lista de pessoas armazenadas
    public ArrayList<Pessoa> obterTodasPessoas(){
        return pessoas;
    }
}
