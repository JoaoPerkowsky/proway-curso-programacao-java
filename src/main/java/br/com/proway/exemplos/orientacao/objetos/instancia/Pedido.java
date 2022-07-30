package br.com.proway.exemplos.orientacao.objetos.instancia;

import javax.swing.JOptionPane;

public class Pedido {

    public String nome;
    public int quantidade;
    public double precoUnitario;

    // Método: é a execução de determinada ação
    // Neste contexto é o calculo do total do pedido e 
    // a apresentação do total do pedido
    public double calcularApresentarTotalPedido() {
        double totalPedido = calcularTotalPedido();
        double desconto  = calcularDesconto();
        double totalPedidoComDesconto = totalPedido - desconto;
        
        JOptionPane.showMessageDialog(null,"Valor do produto: " + totalPedido
            + "\nValor do desconto: " + desconto 
             + "\nValor do produto com desconto: " + totalPedidoComDesconto);
        
        return totalPedidoComDesconto;    
    }
    
    public double calcularDesconto(){
        double totalPedido = calcularTotalPedido();
        double valorDesconto = 0;
        
        if(quantidade >= 1000){
            // calcular o valor de 5% do pedido, que será 
            // o valor do desconto que será aplicado
            valorDesconto = totalPedido * 0.05;
        }
        
        return valorDesconto;
    }
    public double calcularTotalPedido(){
        double totalPedido = quantidade * precoUnitario;
        return totalPedido;
    }
}
