/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.construtor;

/**
 *
 * @author moc
 */
public class Materia {
    // Atributos
    private int codigo;         // Obrigatoria
    private String nome;        // Obrigatoria
    private String professor;   // Opcional
    private int cargaHoraria;   // Opcional

    // Exemplo de construtor: construir o objeto com o que é obrigatórios
    // encapsulamento + NomeClasse(parametros)
    public Materia(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Métodos
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
