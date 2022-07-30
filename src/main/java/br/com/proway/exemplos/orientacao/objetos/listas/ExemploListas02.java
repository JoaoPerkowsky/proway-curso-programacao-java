package br.com.proway.exemplos.orientacao.objetos.listas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExemploListas02 {

    public static void main(String[] args) {

        // nomes, quantidades
        // CRUD => criar, ler, atualizar, apagar
        // CRUD => create, read, update e delete
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> quantidades = new ArrayList<Integer>();

        int opcao = 0;
        String[] menus = new String[]{
            "Cadastrar", "Editar", "Apresentar todos", "Apagar", "Sair"};
        while (opcao != 4 && opcao != JOptionPane.CLOSED_OPTION) {
            opcao = JOptionPane.showOptionDialog(null,
                    "MENU",
                    "Sistema de produtos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, menus, 0);
            switch (opcao) {
                case 0:
                    String nome = JOptionPane.showInputDialog("Digite o nome");
                    int quantidade = Integer.parseInt(JOptionPane
                        .showInputDialog("Digite a quantidade"));
                    nomes.add(nome);
                    quantidades.add(quantidade);
                    break;
                case 1:
                    break;
                case 2:
                    String texto = new String();
                    for(int i = 0; i < nomes.size(); i = i + 1){
                        texto = texto + nomes.get(i) + 
                                " => " + quantidades.get(i) + "\n";
                    }
                    JOptionPane.showMessageDialog(null, texto);
                    break;
            }
        }

    }
}
