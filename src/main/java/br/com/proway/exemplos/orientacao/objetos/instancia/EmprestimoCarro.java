/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.instancia;

import java.time.LocalDateTime;

/**
 *
 * @author moc
 */
public class EmprestimoCarro {

    // Atributos
    public String modelo;
    public double valorParcela;
    public int quantidadeParcelas;
    public int anoFabricacao;
    public int tamanhoTanque;
    public double quilometragemPercorridoParcial;
    public double valorTabelaFipe;

    // vale a pena comprar?
    
    
    // quanto será pago de juros
    public double calcularValorJuros() {
        var totalEmprestimo = quantidadeParcelas * valorParcela;
        var valorJurosPago = valorTabelaFipe - totalEmprestimo;
        
        return valorJurosPago;
    }
    
    // qual percentual de juros que será pago
    public double calcularPercentualJuros(){
        // R$ 70000 (carro)       100%
        // R$ 55000 (juros)        x
        
        var valorJuros = calcularValorJuros();
        var percentualJuros = (valorJuros * 100) / valorTabelaFipe;
        
        return percentualJuros;
    }
    
    // quantos anos tem esse carro
    public int calcularIdade(){
        // Obtém o ano do momento atual
        var anoAtual = LocalDateTime.now().getYear();
        var idade = anoAtual - anoFabricacao;
        
        return idade;
    }
    
    // quantos quilometros esse carro faz com 1 litros
    public double calcularConsumo(){
        var consumo = quilometragemPercorridoParcial / tamanhoTanque;
        
        return consumo;
    }
    /* Criar uma classe chamada Aluno com os seguintes atributos:
    - nome, sobrenome, 
    - nota 1, nota 2, nota 3, nota 4
    Criar os seguintes métodos:
    - calcularSomaNotas()
    - calcularMedia()
    - apresentarStatus() => Menor que 5 reprovado, 
    Menor que 7 em exame, senão aprovado
    - apresentarNomeCompleto
    */
    
}
