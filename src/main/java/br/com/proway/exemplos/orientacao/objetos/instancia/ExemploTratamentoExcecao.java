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
public class ExemploTratamentoExcecao {

    public static void main(String[] args) {
//        Exemplo01();
        Exemplo02();
    }

    public static void Exemplo01() {
        int numero = 0;
        // Tente
        try {
            // Converter de texto(String) para inteiro(int)
            numero = Integer.parseInt("89");

        } catch (Exception exception) {
            // Irá executar o código do catch, caso ocorrer algum erro no bloco do try.
            // Neste cenário o bloco do try faz a conversão de uma String para inteiro.
            System.out.println("Número deve conter um número inteiro");
        }
        System.out.println("Número: " + numero);
    }

    public static void Exemplo02() {
        var salario = obterSalario();
        
        var cargo = obterCargo(salario);
        
        JOptionPane.showMessageDialog(null, "Cargo: " + cargo);
    }
    
    // encapsulamento + static? + tipoRetorno + nomeMetodo(parametros?)
    // encapsulmaneto: public e private
    public static String obterCargo(double salario){
        var cargo = "";
        if (salario < 1000) {
            cargo = "Estagiário";
        } else if (salario < 3_000) {
            cargo = "Programador Júnior";
        } else if (salario < 6_000) {
            cargo = "Programador Pleno";
        } else {
            cargo = "Programador Senior";
        }
        
        return cargo;
    }
    
    public static double obterSalario(){
        double salario = 0;
        while (salario <= 0) {
            try {
                salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário"));

            } catch (Exception exception) {
                // Se der algum problema, executa esse código que está dentro do catch
                JOptionPane.showMessageDialog(null, "Salário deve conter somente número real");
            }
        }
        
        return salario;
    }
}
