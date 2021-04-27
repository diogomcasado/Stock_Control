/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_gumbo.vista;

import javax.swing.JOptionPane;
import projeto_gumbo.Data;
import projeto_gumbo.Produto;
import projeto_gumbo.Stock;
import java.time.LocalDate;

/**
 *
 * @author dicasado
 */
public class DadosEntrada extends javax.swing.JDialog {

    private Stock stock;
    private boolean aceitado = false;

    /**
     * Creates new form DadosEntrada
     */
    public DadosEntrada(java.awt.Frame parent, Produto produto, Stock stock) {
        super(parent, true);
        this.stock = stock;
        initComponents();

        
        tfTipoPreco.setText(produto.getTipo2().toString()); //
        tfProduto.setText(produto.getNome());               // NAO MUDA

        tfValidade.setText(stock.getValidade().toString());
        tfData.setText(stock.getData().toString());
        tfLote.setText(stock.getLote());
        tfQuantidade.setText(Double.toString(stock.getQuant()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfProduto = new javax.swing.JTextField();
        tfData = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfLote = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfValidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfTipoPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Quantidade:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Prazo de validade:");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tfProduto.setEditable(false);
        tfProduto.setBackground(new java.awt.Color(204, 204, 204));
        tfProduto.setForeground(new java.awt.Color(51, 51, 51));
        tfProduto.setText("jTextField1");

        tfData.setText("jTextField1");

        jLabel2.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        jLabel2.setText("GUMBO");

        tfLote.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Registar Entrada de Stock");

        tfQuantidade.setText("jTextField1");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Produto:");

        tfValidade.setText("jTextField1");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Data:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Lote:");

        tfTipoPreco.setEditable(false);
        tfTipoPreco.setBackground(new java.awt.Color(204, 204, 204));
        tfTipoPreco.setForeground(new java.awt.Color(51, 51, 51));
        tfTipoPreco.setText("jTextField6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTipoPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                            .addComponent(tfValidade)
                            .addComponent(tfLote)
                            .addComponent(tfData)
                            .addComponent(tfProduto))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTipoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnCancelar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        stock.setLote(tfLote.getText().toString());

        int ano1 = parseData().getAno();
        int mes1 = parseData().getMes();
        int dia1 = parseData().getDia();

        int ano2 = parseValidade().getAno();
        int mes2 = parseValidade().getMes();
        int dia2 = parseValidade().getDia();

        LocalDate HOJE = LocalDate.now();
        LocalDate data = LocalDate.of(ano1, mes1, dia1);
        LocalDate validade = LocalDate.of(ano2, mes2, dia2);

        try {

            String quantidade = tfQuantidade.getText();
            double quantidadeD = Double.parseDouble(quantidade);
            stock.setData(parseData());
            stock.setValidade(parseValidade());

            if (quantidadeD <= 0 || quantidade.equals("")) {
                JOptionPane.showMessageDialog(null, "Insira a quantidade do produto");
                tfQuantidade.requestFocusInWindow();

            } else {
                if (tfLote.getText().length() < 3) {
                    JOptionPane.showMessageDialog(null, "Insira o lote do produto");

                } else {
                    if (HOJE.isAfter(data)) {
                        JOptionPane.showMessageDialog(null, "Insira uma data válida");

                    } else {
                        if (HOJE.isBefore(validade)) {
                        stock.setQuant(Double.parseDouble(tfQuantidade.getText()));
                        aceitado = true;
                        setVisible(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "Insira uma data de validade válida");
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private Data parseData() {
        String[] valores = tfData.getText().split("/");
        return new Data(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]), Integer.parseInt(valores[2]));
    }

    private Data parseValidade() {
        String[] valores = tfValidade.getText().split("/");
        return new Data(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]), Integer.parseInt(valores[2]));
    }


    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        aceitado = false;
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public boolean isAceite() {
        return aceitado;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfLote;
    private javax.swing.JTextField tfProduto;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfTipoPreco;
    private javax.swing.JTextField tfValidade;
    // End of variables declaration//GEN-END:variables
}