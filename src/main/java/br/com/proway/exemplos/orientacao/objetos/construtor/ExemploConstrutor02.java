package br.com.proway.exemplos.orientacao.objetos.construtor;

import javax.swing.JOptionPane;

public class ExemploConstrutor02 {

    public static void main(String[] args) {
        String codigoSeguranca = JOptionPane
                .showInputDialog("Digite o código de segurança");
        String numero = JOptionPane
                .showInputDialog("Digite o número do CC");
        String nomeCliente = JOptionPane
                .showInputDialog("Digite o nome do cliente");

        CartaoCredito cartaoCredito = new CartaoCredito(
                numero,
                nomeCliente,
                codigoSeguranca);

        cartaoCredito.setMes(Byte.parseByte(JOptionPane
                .showInputDialog("Digite o mês de validade do CC")));

        cartaoCredito.setAno(Short.parseShort(JOptionPane
                .showInputDialog("Digite o ano de validade do CC")));

        JOptionPane.showMessageDialog(null, 
                cartaoCredito.obterInformacoes());
    }
}
