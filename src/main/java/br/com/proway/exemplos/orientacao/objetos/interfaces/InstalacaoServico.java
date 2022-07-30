package br.com.proway.exemplos.orientacao.objetos.interfaces;

import java.util.ArrayList;

public class InstalacaoServico implements InstalacaoServicoInterface {

    private ArrayList<Instalacao> instalacoes;
    
    private int indiceId;
    
    // Construtor
    public InstalacaoServico(){
        instalacoes = new ArrayList<Instalacao>();
        indiceId = 0;
    }
    
    @Override
    public void adicionar(Instalacao instalacao) {
        // Registrar este serviço de instalaçao na lista de instalaçoes
        instalacao.setId(++indiceId);
        
        instalacoes.add(instalacao);
    }

    @Override
    public void editar(Instalacao instalacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar(int id) {
        // Percorrer a lista de instalaçoes para remover a instalaçao com
        // o Id desejado
        for(var instalacao : instalacoes){
            if(instalacao.getId() == id){
                // Remove a instalaçao pois conseguiu encontrar uma instalaçao
                // com o id desejado
                instalacoes.remove(instalacao);
                // return neste caso eh utilizado para encerrar o foreach,
                // pois ja foi encontrado a instalaçao com o id desejado,
                // ou seja, nao deveria existir outra instalaçao com este id
                return;
            }
        }
    }

    @Override
    public Instalacao obterPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Instalacao> obterTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
