package br.com.proway.exemplos.orientacao.objetos.instancia;

import javax.swing.JOptionPane;

public class ExemploInstancia04 {

    public static void main(String[] args) {
        try {
            Ingresso ingressoMaria = new Ingresso();
            ingressoMaria.definirCodigo(10);
            ingressoMaria.definirDono(
                    "Joãozinho da Silva");
            ingressoMaria.definirValor(100);
            ingressoMaria.definirQuantidade(10);

            var valorIngresso = ingressoMaria
                    .calcularValorIngresso();

            JOptionPane.showMessageDialog(
        null,
        "Dono: " + ingressoMaria.obterDono()
        + "\nQuantidade: " + ingressoMaria.obterQuantidade()
        + "\nValor unitário: " + ingressoMaria.obterValor()
        + "\nValor ingressor: " + valorIngresso);
            
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,
                    exception.getMessage());
        }

    }

}
