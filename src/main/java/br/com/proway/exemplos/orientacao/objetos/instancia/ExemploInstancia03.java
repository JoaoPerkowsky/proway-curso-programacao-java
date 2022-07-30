/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.instancia;

import javax.swing.JOptionPane;

/**
 *
 * @author moc
 */
public class ExemploInstancia03 {

    public static void main(String[] args) {
        var emprestimoCarro = new EmprestimoCarro();
        emprestimoCarro.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
        emprestimoCarro.anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o ano de fabricação"));
        emprestimoCarro.quantidadeParcelas = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a quantidade de parcelas"));
        emprestimoCarro.valorParcela = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor da parcela"));
        emprestimoCarro.valorTabelaFipe = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor da tabela FIPE"));
        emprestimoCarro.tamanhoTanque = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o tamanho do tanque"));

        JOptionPane.showMessageDialog(null,
                "Modelo: " + emprestimoCarro.modelo
                + "\nConsumo: " + emprestimoCarro.calcularConsumo()
                + "\nIdade do carro: " + emprestimoCarro.calcularIdade()
                + "\nValor juros: " + emprestimoCarro.calcularValorJuros()
                + "\nPercentual de juros: " + emprestimoCarro.calcularPercentualJuros()
                        );  
    }

}
