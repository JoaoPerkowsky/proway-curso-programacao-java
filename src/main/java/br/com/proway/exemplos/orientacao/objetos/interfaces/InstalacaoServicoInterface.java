package br.com.proway.exemplos.orientacao.objetos.interfaces;

import java.util.ArrayList;

public interface InstalacaoServicoInterface {
  
    void adicionar(Instalacao instalacao);
    
    void editar(Instalacao instalacao);
    
    void apagar(int id);
   
    Instalacao obterPorId(int id);

    ArrayList<Instalacao> obterTodos();
    
}
