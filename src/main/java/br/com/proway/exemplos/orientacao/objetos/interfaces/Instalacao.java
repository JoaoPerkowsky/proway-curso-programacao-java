package br.com.proway.exemplos.orientacao.objetos.interfaces;

import java.time.LocalDateTime;

public class Instalacao {
    private int id;
    private String tipo;
    private double valor;
    private String cliente;
    private LocalDateTime dataHoraAgendada;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataHoraAgendada() {
        return dataHoraAgendada;
    }
    public void setDataHoraAgendada(LocalDateTime dataHoraAgendada) {
        this.dataHoraAgendada = dataHoraAgendada;
    }
    
}
