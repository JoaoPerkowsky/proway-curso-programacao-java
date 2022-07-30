/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.construtor;

public class CartaoCredito {

    private String numero;
    private String cliente;
    private String codigoSeguranca;
    private byte mes;
    private short ano;

    // byte => -128 .. 127 => 256
    // short => -32768 .. 32767
    // int => -2147483648 .. 2 147 483 647
    // long => -9223372036854775808 .. 9223372036854775807
    public CartaoCredito(String numero, String cliente, String codigoSeguranca) {
        this.numero = numero;
        this.cliente = cliente;
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public String obterInformacoes() {
        return "Número: " + numero
                + "\nCliente: " + cliente
                + "\nCódigo de segurança: " + codigoSeguranca
                + "\nMês: " + mes + "Ano: " + ano;
    }
}
