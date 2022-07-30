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
public class ExemploInstancia05 {

    public static void main(String[] args) {
        // Instanciando um objeto chamado calculadora da classe Calculadora
        Calculadora calculadora = new Calculadora();

        double numero1 = solicitarNumero("Número 1");

        double numero2 = solicitarNumero("Número 2");
        

        calculadora.setNumero1(numero1);
        calculadora.setNumero2(numero2);

        JOptionPane.showMessageDialog(null,
                "Número 1: " + calculadora.getNumero1()
                + "\nNúmero 2: " + calculadora.getNumero2()
                + "\nSoma: " + calculadora.somar());

    }

    public static double solicitarNumero(String numeroTexto) {
        var numero = 0.0;

        var numeroValido = false;

        while (numeroValido == false) {

            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + numeroTexto));

                numeroValido = true;
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, numeroTexto + " deve conter número inteiro");
            }
        }

        return numero;
    }
}

// void => Métodos sem retorno 
//     - Executa
// Exemplo: public void somar(int numero1, int numero2) {
//              var soma = numero1 + numero2;
//              JOptionPane.showMessageDialog(null, "Soma: " + soma);
//          }
// String, int, double, ..... => Método com retorno
//     - Executa
//     - Retorna uma informação do tipo estabelecido no método
// Exemplo: public int somar(int numero1, int numero2){
//             var soma = numero1 + numero2;
//             return soma;
//          }

// var numero = somar(2, 2);
