package br.com.proway.exemplos.orientacao.objetos.instancia;

import javax.swing.JOptionPane;

public class ExemploInstancia02 {

    public static void main(String[] args) {
        double somaTotalPedidos = 0;
        
        var opcao = "";
        // enquanto a opção não for igual a fim, 
        // repetir pedindo as informações do pedido
        while (!opcao.equals("fim")) {
            var pedido = new Pedido();
            pedido.nome = JOptionPane
                    .showInputDialog("Digite o nome do produto");
            pedido.quantidade = Integer.parseInt(JOptionPane
                    .showInputDialog("Digite a quantidade desejada"));
            pedido.precoUnitario = Double.parseDouble(JOptionPane
                    .showInputDialog("Digite o preço unitário"));

            var totalPedidoComDesconto = pedido.calcularApresentarTotalPedido();
            
            somaTotalPedidos = somaTotalPedidos + totalPedidoComDesconto;
            
            opcao = JOptionPane.showInputDialog("Digite 'fim' para encerrar");
        }
        JOptionPane.showMessageDialog(null, 
                "Total dos pedidos com desconto: " + somaTotalPedidos); 
    }
}
