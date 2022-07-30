package br.com.proway.exemplos.orientacao.objetos.instancia;

import javax.swing.JOptionPane;

public class ExemploInstancia01 {

    public static void main(String[] args) {
//        int idade1 = 30;
//        String nome1 = "Patricia";
//        double salario1 = 2039;
//        int quantidadeHorasEstudo1 = 20;
//
//        int idade2 = 29;
//        String nome2 = "Pedro";
//        double salario2 = 4000;
//        int quantidadeHorasEstudo2 = 100;
//        
//
//        int idade3 = 18;
//        String nome3 = "João";
//        double salario3 = 10000;
//        int quantidadeHorasEstudo3 = 5;

        // Instanciando um objeto da classe Pessoa
        // O objeto se chama joao
        // NomeClasse nomeObjeto = new NomeClasse();
        Pessoa joao = new Pessoa();
        joao.nome = "João";
        joao.salario = 10000;
        joao.quantidadeHorasEstudo = 5;
        joao.altura = 1.89;

        Pessoa pedro = new Pessoa();
        pedro.nome = "Pedro";
        pedro.altura = 2.10;
        pedro.salario = 4000;
        pedro.quantidadeHorasEstudo = 100;

        Pessoa patricia = new Pessoa();
        patricia.nome = "Patricia";
        patricia.salario = 2039;
        patricia.quantidadeHorasEstudo = 20;
        patricia.idade = 30;

        JOptionPane.showMessageDialog(null,
        "Nome: " + joao.nome
        + "\nAltura: " + joao.altura
        + "\nSalário: " + joao.salario
        + "\nQuantidade horas de estudo: " + joao.quantidadeHorasEstudo
        + "\nIdade: " + joao.idade
        + "\n\nNome: " + pedro.nome
        + "\nAltura: " + pedro.altura
        + "\nSalário: " + pedro.salario
        + "\nQuantidade horas de estudo: " + pedro.quantidadeHorasEstudo
        + "\nIdade: " + pedro.idade
        + "\n\nNome: " + patricia.nome
        + "\nAltura: " + patricia.altura
        + "\nSalário: " + patricia.salario
        + "\nQuantidade horas de estudo: " + patricia.quantidadeHorasEstudo
        + "\nIdade:" + patricia.idade);

    }
}
