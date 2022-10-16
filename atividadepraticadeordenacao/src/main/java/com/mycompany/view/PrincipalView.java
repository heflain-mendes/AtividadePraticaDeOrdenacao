/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;

/**
 *
 * @author Heflain
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        initComponents();

        this.grpOrdem.add(this.getRbtmCrescente());
        this.grpOrdem.add(this.getRbtmDecrescente());
        this.rbtmCrescente.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpOrdem = new javax.swing.ButtonGroup();
        lblSemOrdem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstOrdenados = new javax.swing.JList<>();
        lblOrdenados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSemOrdem = new javax.swing.JList<>();
        lblMetodoOrdenacao = new javax.swing.JLabel();
        cmdMetodo = new javax.swing.JComboBox<>();
        lblOrdem = new javax.swing.JLabel();
        rbtmCrescente = new javax.swing.JRadioButton();
        rbtmDecrescente = new javax.swing.JRadioButton();
        btnOrdenar = new javax.swing.JButton();
        btnCarregarArquivo = new javax.swing.JButton();
        lblTempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSemOrdem.setText("Elementos a serem ordenados");

        jScrollPane1.setViewportView(lstOrdenados);

        lblOrdenados.setText("Elementos Ordenados");

        jScrollPane2.setViewportView(lstSemOrdem);

        lblMetodoOrdenacao.setText("Metodo de ordenação");

        cmdMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblOrdem.setText("Ordem");

        rbtmCrescente.setText("Crescente ");
        rbtmCrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtmCrescenteActionPerformed(evt);
            }
        });

        rbtmDecrescente.setText("Decrescente");
        rbtmDecrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtmDecrescenteActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");

        btnCarregarArquivo.setText("Carregar do arquivo ...");
        btnCarregarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarArquivoActionPerformed(evt);
            }
        });

        lblTempo.setText("tempo: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblOrdem)
                                    .addComponent(cmdMetodo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMetodoOrdenacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(rbtmCrescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbtmDecrescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblSemOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(btnCarregarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addGap(669, 669, 669)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrdenados)
                    .addComponent(lblSemOrdem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMetodoOrdenacao)
                        .addGap(18, 18, 18)
                        .addComponent(cmdMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(lblOrdem)
                        .addGap(18, 18, 18)
                        .addComponent(rbtmDecrescente)
                        .addGap(5, 5, 5)
                        .addComponent(rbtmCrescente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTempo))
                .addGap(78, 78, 78))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtmCrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtmCrescenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtmCrescenteActionPerformed

    private void btnCarregarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarregarArquivoActionPerformed

    private void rbtmDecrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtmDecrescenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtmDecrescenteActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregarArquivo;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JComboBox<String> cmdMetodo;
    private javax.swing.ButtonGroup grpOrdem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMetodoOrdenacao;
    private javax.swing.JLabel lblOrdem;
    private javax.swing.JLabel lblOrdenados;
    private javax.swing.JLabel lblSemOrdem;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JList<String> lstOrdenados;
    private javax.swing.JList<String> lstSemOrdem;
    private javax.swing.JRadioButton rbtmCrescente;
    private javax.swing.JRadioButton rbtmDecrescente;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnCarregarArquivo() {
        return btnCarregarArquivo;
    }

    public JButton getBtnOrdenar() {
        return btnOrdenar;
    }

    public ButtonGroup getButtonGroup1() {
        return grpOrdem;
    }

    public ButtonGroup getGrpOrdem() {
        return grpOrdem;
    }

    
    public JComboBox<String> getCmdMetodo() {
        return cmdMetodo;
    }

    public JLabel getLblMetodoOrdenacao() {
        return lblMetodoOrdenacao;
    }

    public JLabel getLblOrdem() {
        return lblOrdem;
    }

    public JLabel getLblOrdenados() {
        return lblOrdenados;
    }

    public JLabel getLblSemOrdem() {
        return lblSemOrdem;
    }

    public JLabel getLblTempo() {
        return lblTempo;
    }

    public JList<String> getLstOrdenados() {
        return lstOrdenados;
    }

    public JList<String> getLstSemOrdem() {
        return lstSemOrdem;
    }

    public JRadioButton getRbtmCrescente() {
        return rbtmCrescente;
    }

    public JRadioButton getRbtmDecrescente() {
        return rbtmDecrescente;
    }
 
}