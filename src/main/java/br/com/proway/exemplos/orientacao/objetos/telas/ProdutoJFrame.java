/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.telas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProdutoJFrame extends javax.swing.JFrame {

    private ProdutoServico produtoServico = new ProdutoServico();
    private int codigo;

    public ProdutoJFrame() {
        initComponents();
        listarTodosOsProdutos();
        codigo = 1;
        produtoServico.lerProdutosEmArquivoJson();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonApagar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPrecoUnitario = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Preço Unitário", "Preço Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Quantidade");

        jLabel3.setText("Preço Unitário");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonApagar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPrecoUnitario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonApagar)
                    .addComponent(jButtonEditar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // Input (obter dos campos e armazenar em variáveis)
        var nome = jTextFieldNome.getText();
        var quantidade = Integer.parseInt(jTextFieldQuantidade.getText());
        var precoUnitario = Double.parseDouble(jTextFieldPrecoUnitario
                .getText()
                .replace("R$", "") // " 3.490,50"
                .replace(" ", "") // "3.490,50"
                .replace(".", "") // "3490,50"
                .replace(",", "."));

        // Construir o objeto do Produto com as informações da tela
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPrecoUnitario(precoUnitario);
        produto.setQuantidade(quantidade);
        // Verifica se não está editando
        if (ehModoEdicao() == false) {
            // Adicionar o produto na lista dos produtos
            produtoServico.adicionar(produto);
            // Apresenta feedback
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
        } else {
            // Necessário obter o código do produto que está sendo editado
            DefaultTableModel modeloTabela = (DefaultTableModel) jTable1.getModel();
            // Obter o código do produto selecionado
            var indiceLinhaSelecionada = obterIndiceValidando();
            // Obter o código da tabela
            var codigoProdutoParaAlterar = Integer.parseInt(modeloTabela
                    .getValueAt(indiceLinhaSelecionada, 0).toString());
            // Definir o código obtido da tabela para o objeto que será alterado
            produto.setCodigo(codigoProdutoParaAlterar);
            // Alterar o produto na lista de produtos
            produtoServico.editar(produto);
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");
            
        }
        listarTodosOsProdutos();

        jTable1.getSelectionModel().clearSelection();
        limparCampos();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        var indiceLinhaSelecionada = obterIndiceValidando();

        if (indiceLinhaSelecionada == -1) {
            return;
        }

        // Questiona o usuário se realmente deseja remover o produto
        var opcaoEscolhida = JOptionPane
                .showConfirmDialog(this, "Deseja realmente remover o produto?");

        // Validar se o usuário escolheu remover
        if (opcaoEscolhida == JOptionPane.YES_OPTION) {
            // Obtém o modelo da tabela para que seja possível remover a linha da tabela
            var tabelaModelo = (DefaultTableModel) jTable1.getModel();
            // Obter o valor de uma célula através da linha e coluna
            String nomeParaApagar = tabelaModelo.getValueAt(indiceLinhaSelecionada, 1)
                    .toString();
            // Remover o produto escolhido da lista de produto
            produtoServico.apagar(nomeParaApagar);
            // Atualizar a lista de produtos com o produto removido
            listarTodosOsProdutos();
            // Apresentar mensagem de remoção do produto
            JOptionPane.showMessageDialog(null, "Produto " + nomeParaApagar
                    + " apagado com sucesso");
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // Verificar se o usuário escolheu algum produto para editar
        int indiceLinhaSelecionada = obterIndiceValidando();

        if (indiceLinhaSelecionada == -1) {
            return;
        }

        var tabelaModelo = (DefaultTableModel) jTable1.getModel();

        // Obter o código do produto selecionado no JTable
        var codigoProduto = Integer.parseInt(tabelaModelo
                .getValueAt(indiceLinhaSelecionada, 0).toString());
        // Obter o produto da lista de produtos
        var produto = produtoServico.obterProdutoPorCodigo(codigoProduto);
        // Verifica senão foi possível encontrar o produto com o código
        if (produto == null) {
            // Apresenta mensagem
            JOptionPane.showMessageDialog(null,
                    "Não foi possível encontrar produto com este código");
            return;
        }
        // Converter inteiro, double... para String
        // var numero = String.valueOf(2.30); // Double -> String

        // Preencher os campos com os valores extraídos da tabela
        jTextFieldNome.setText(produto.getNome());
        jTextFieldQuantidade.setText(String.valueOf(produto.getQuantidade()));
        jTextFieldPrecoUnitario.setText(String.valueOf(produto.getPrecoUnitario()));
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private int obterIndiceValidando() {
        // Verificar se a tabela está vazia
        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Cadastre um produto primeiro");
            return -1;
        }

        // Obter o indice da linha selecionada
        var indiceLinhaSelecionada = jTable1.getSelectedRow();

        // Verificar senão foi selecionada nenhuma linha
        if (indiceLinhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Escolha o produto primeiro");
            return -1;
        }

        return indiceLinhaSelecionada;
    }

    private void limparCampos() {
        jTextFieldNome.setText("");
        jTextFieldPrecoUnitario.setText("");
        jTextFieldQuantidade.setText("");

        // Coloca o foco do cursor no campo do nome
        jTextFieldNome.requestFocus();
    }

    private boolean ehModoEdicao() {
        var indiceLinhaSelecioanda = jTable1.getSelectedRow();

        // Operador ternários
        return indiceLinhaSelecioanda == -1
                ? false
                : true;

//        if(indiceLinhaSelecioanda == -1){
//            return false;
//        }
//        
//        return true;
    }

    private void listarTodosOsProdutos() {
        var produtos = produtoServico.obterTodosProdutos();

        // Obter o modelo da tabela, para adicionar, editar e remover linhas do JTable
        DefaultTableModel modeloTabela = (DefaultTableModel) jTable1.getModel();
        // Limpar a tabela, pois a cada novo registro ou edição ou remoção, 
        // toda a tabela é redesenhada
        modeloTabela.setRowCount(0);

        // Percorrer a lista de produtos para adicionar as linhas no jTable
        for (int i = 0; i < produtos.size(); i++) {
            // Obter o produto em determinado indice da lista de produtos
            var produto = produtos.get(i);
            // Adicionar linha com as informações do produto no JTable
            modeloTabela.addRow(new Object[]{
                produto.getCodigo(),
                produto.getNome(),
                produto.getQuantidade(),
                produto.getPrecoUnitario(),
                produto.getQuantidade() * produto.getPrecoUnitario()
            });
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPrecoUnitario;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
