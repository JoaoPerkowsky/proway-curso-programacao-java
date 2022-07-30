package br.com.proway.exemplos.orientacao.objetos.interfaces;

import javax.swing.JOptionPane;

public class FuncionarioPrincipal {
    
    public static void main(String[] args) {
        var funcionario = new Funcionario();
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        int quantidadeHoras = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"
                + " de horas que vc trabalha:"));
        double valorHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"
                + " das horas que vc trabalha:"));
        
        var salarioBruto = funcionario.calcularSalarioBruto(quantidadeHoras, valorHoras);
        
        var impostoRenda = funcionario.calcularImpostoRenda(salarioBruto);
        
        var salarioLiquido = funcionario.calcularSalarioLiquido(salarioBruto, impostoRenda);
        
        JOptionPane.showMessageDialog(null, "Nome do funcionario: " + nome
        + "\nQuantidade de horas que ele trabalha: " + quantidadeHoras
        + "\nValor de cada hora: R$" + valorHoras
        + "\nSalario Bruto: R$" + salarioBruto
        + "\nImposto de renda: R$" + impostoRenda
        + "\nSalario liquido: R$" + salarioLiquido);
    }
    
    
}
