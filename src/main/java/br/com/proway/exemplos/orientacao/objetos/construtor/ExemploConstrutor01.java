package br.com.proway.exemplos.orientacao.objetos.construtor;

import javax.swing.JOptionPane;

public class ExemploConstrutor01 {

    public static void main(String[] args) {

        int codigo = 10;
        String nome = "Herbologia";

        // Instanciando um objeto da classe Materia
        Materia materia = new Materia(codigo, nome);

        materia.setCargaHoraria(100);
        materia.setProfessor("Snape");

        JOptionPane.showMessageDialog(null,
            "Matéria: " + materia.getNome()
            + "\nCódigo: " + materia.getCodigo()
            + "\nCarga horária: " + materia.getCargaHoraria()
            + "\nProfessor: " + materia.getProfessor());
    }
}
