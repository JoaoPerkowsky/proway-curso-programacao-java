package br.com.proway.exemplos.orientacao.objetos.listas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExemploLista01 {

    public static void main(String[] args) {

        // "João", "Fernanda", "José", "Lucas", "Jefferson", "Deyvid"
        /*String[] nomes = new String[6];
        nomes[0] = "João";
        nomes[1] = "Fernanda";
        nomes[2] = "José";
        nomes[3] = "Lucas";
        nomes[4] = "Jefferson";
        nomes[5] = "Deyvid"; */
        ArrayList<String> nomes = new ArrayList<String>();
        // Adicionar
        nomes.add("João");
        nomes.add("Fernanda");
        nomes.add("José");
        nomes.add("Lucas");
        nomes.add("Jefferson");
        nomes.add("Deyvid");

        // Remover
        nomes.remove("Deyvid");
        nomes.remove("José");

        // Obter da lista
        System.out.println(
                "Quantidade de nomes:  " + nomes.size()
                + "\nNome [0]: " + nomes.get(0)
                + "\nNome [1]: " + nomes.get(1)
                + "\nNome [2]: " + nomes.get(2)
                + "\nNome [3]: " + nomes.get(3));

        // Remover em determinado indice
        nomes.remove(0); // Remover o João que está no indice 0
        System.out.println(
                "Quantidade de nomes:  " + nomes.size()
                + "\nNome [0]: " + nomes.get(0)
                + "\nNome [1]: " + nomes.get(1)
                + "\nNome [2]: " + nomes.get(2));

        // Alterar o nome no ArrayList(vetor) de nomes
        nomes.set(1, "Lucas aluno Lector Live");
        System.out.println(
                "Quantidade de nomes:  " + nomes.size()
                + "\nNome [0]: " + nomes.get(0)
                + "\nNome [1]: " + nomes.get(1)
                + "\nNome [2]: " + nomes.get(2));
    }
}
