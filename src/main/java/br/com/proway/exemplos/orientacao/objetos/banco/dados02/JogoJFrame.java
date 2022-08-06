/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
/**
 *
 * @author 72072
 */
public class JogoJFrame extends javax.swing.JFrame {

    private int codigoEditar = -1;
    
    /**
     * Creates new form JogoJFrame
     */
    public JogoJFrame() {
        initComponents();
        listarJogos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelJogos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableJogos = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelJogos.setText("Jogos");

        jTableJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableJogos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTableJogos);
        if (jTableJogos.getColumnModel().getColumnCount() > 0) {
            jTableJogos.getColumnModel().getColumn(0).setResizable(false);
            jTableJogos.getColumnModel().getColumn(1).setResizable(false);
            jTableJogos.getColumnModel().getColumn(2).setResizable(false);
        }

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome");

        jLabelTipo.setText("Tipo");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FPS", "RPG", "Estrategia", "Esportes" }));
        jComboBoxTipo.setSelectedIndex(-1);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonApagar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSalvar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelNome)
                        .addComponent(jLabelTipo)
                        .addComponent(jComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJogos)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonApagar)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/lojaBd", "root", "admin");

            Statement executor = conexao.createStatement();

            String nome = jTextFieldNome.getText();
            String tipo = jComboBoxTipo.getSelectedItem().toString();

            if(codigoEditar == -1){
            executor.execute("INSERT INTO jogos (nome, tipo) VALUES ('" + nome + "', '" + tipo + "')");
            JOptionPane.showMessageDialog(this, "Jogo cadastrado com sucesso");
            }else{
                executor.execute("UPDATE jogos SET nome = '" + nome + "', tipo = '"
                + tipo + "' WHERE id = " + codigoEditar);
                JOptionPane.showMessageDialog(this, "Jogo atualizado com sucesso");
            }
            
            // UPDATE 
            listarJogos();
            // Quando salva ou edita o jogo, limpa o texto e a comboBox.
            limparCampos();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nao foi possivel realizar a operaçao");
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        try{
        // Descobrir o codigo do registro que deseja alterar
        DefaultTableModel modelo = (DefaultTableModel) jTableJogos.getModel();
        int indiceLinhaSelecionada = jTableJogos.getSelectedRow();
        
        // Obter o codigo da coluna 0 que contem o codigo do jogo selecionado
        codigoEditar = Integer.parseInt(modelo.getValueAt(
                indiceLinhaSelecionada, 0).toString());
        
        // Abrir conexao com o banco de dados
        var conexao = DriverManager.getConnection(
                "jdbc:mysql://localhost/lojaBd", "root", "admin");
        
        // Executar comando para consultar os dados da tabela de jogos
        var executor = conexao.createStatement();
        executor.execute("SELECT nome, tipo FROM jogos WHERE id = " + codigoEditar);
        
        // Obter os dados da consulta
        ResultSet registros = executor.getResultSet();
        if(registros.next()){
            var nome = registros.getString("nome");
            var tipo = registros.getString("tipo");
            jTextFieldNome.setText(nome);
            jComboBoxTipo.setSelectedItem(tipo);
        }else{
            // Apresenta mensagem informando que nao encontrou nenhum registro
            // com o Id escolhido.
            JOptionPane.showMessageDialog(this, "Nao foi possivel encontrar o registro");
        }
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Nao foi possivel blah blah blah");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        try{
        // Descobrir o codigo do registro que dejesa apagar
        DefaultTableModel modelo = (DefaultTableModel) jTableJogos.getModel();
        int indiceLinhaSelecionada = jTableJogos.getSelectedRow();
        
        // Obter o codigo da coluna 0 que eh a coluna do codigo no JTable
        int codigo = Integer.parseInt(modelo.getValueAt(indiceLinhaSelecionada,
                0).toString());
        // Conectar no banco de dados
        var conexao = DriverManager.getConnection("jdbc:mysql://localhost/lojaBd",
                 "root", "admin");
        // Executar o comando para apagar o registro da tabela de jogos
        var executor = conexao.createStatement();
        executor.execute("DELETE FROM jogos WHERE id = " + codigo);
        // Fechar a conexao do banco de dados
        conexao.close();
        // Listar os jogos
        listarJogos();
        // Apresentar feedback de que o registro foi apagado
        JOptionPane.showMessageDialog(this, "Registro apagado com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Nao foi possivel apagar");
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void limparCampos(){
        jTextFieldNome.setText("");
        jComboBoxTipo.setSelectedIndex(-1);
        // Retorna para o modo de cadastro, o que permitira o usuario
        // cadastrar novamente.
        codigoEditar = -1;
    }
    
    private void listarJogos() {
        try {
            Connection conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost/lojaBD", "root", "admin");
            Statement executor = conexao.createStatement();
            executor.execute("SELECT id, nome, tipo FROM jogos");

            ResultSet registros = executor.getResultSet();

            DefaultTableModel modeloTabela = (DefaultTableModel) jTableJogos.getModel();

            // Limpar Tela
            modeloTabela.setRowCount(0);
            while (registros.next()) {
                int id = Integer.parseInt(registros.getString("id"));
                String nome = registros.getString("nome");
                String tipo = registros.getString("tipo");
                modeloTabela.addRow(new Object[]{id, nome, tipo});
            }
        } catch (Exception e) {

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelJogos;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableJogos;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
// i like pizza :]