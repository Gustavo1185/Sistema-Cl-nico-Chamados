/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gustavo
 */
public class CadastroChamado extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroChamado
     */
    public CadastroChamado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        CADASTROCHAMADO = new javax.swing.JButton();
        ACOMPANHAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        statuschamado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        datahora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        codservico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaochamado = new javax.swing.JTextArea();
        statustext = new javax.swing.JTextField();
        ALTERAR = new javax.swing.JToggleButton();
        MOSTRAR = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel2.setText("DESCRIÇÃO DO CHAMADO:");

        CADASTROCHAMADO.setText("Cadastrar Chamado");
        CADASTROCHAMADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTROCHAMADOActionPerformed(evt);
            }
        });

        ACOMPANHAR.setText("Acompanhar chamados");
        ACOMPANHAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACOMPANHARActionPerformed(evt);
            }
        });

        jLabel3.setText("Status:");

        statuschamado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABERTO", "RESOLVIDO", "ENCERRADO" }));

        jLabel4.setText("DATA/HORA:");

        jLabel5.setText("MATRÍCULA FUNCIONÁRIO:");

        matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaActionPerformed(evt);
            }
        });

        jLabel6.setText("CÓDIGO DO SERVIÇO:");

        codservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codservicoActionPerformed(evt);
            }
        });

        descricaochamado.setColumns(20);
        descricaochamado.setRows(5);
        jScrollPane1.setViewportView(descricaochamado);

        ALTERAR.setText("Alterar");
        ALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTERARActionPerformed(evt);
            }
        });

        MOSTRAR.setText("Mostrar");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });

        jLabel1.setText("              CADASTRO DE CHAMADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(codservico, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(296, 296, 296))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(datahora, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(matricula))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statuschamado, 0, 130, Short.MAX_VALUE)
                            .addComponent(statustext))
                        .addContainerGap(110, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MOSTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ACOMPANHAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(ALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CADASTROCHAMADO)
                .addGap(286, 286, 286))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(codservico, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(statustext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statuschamado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(datahora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACOMPANHAR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CADASTROCHAMADO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(MOSTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CADASTROCHAMADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTROCHAMADOActionPerformed
         String DRIVER = "com.mysql.cj.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/sistema_chamados?useTimezone=true&serverTimezone=UTC";
        String USER = "root";
        String PASS = "";

        try {
            Class.forName(DRIVER);
            Connection con;
            con = DriverManager.getConnection(URL, USER, PASS);

            String query = "INSERT INTO CHAMADO (descricao,status,data_hora_abertura,funcionario_matricula,servico_cod_servico) VALUES (?,?,?,?,?);";

            PreparedStatement stnt = con.prepareStatement(query);

            stnt.setString(1, descricaochamado.getText());
            stnt.setString(2, (String) statuschamado.getSelectedItem());
            stnt.setString(3, datahora.getText());
            stnt.setString(4, matricula.getText());
            stnt.setString(5, codservico.getText());
            stnt.executeUpdate();

            stnt.close();
            con.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possível encontrar a classe");
        } catch (SQLException e) {
            System.out.println("Erro na conexão" + e);
        }

    }//GEN-LAST:event_CADASTROCHAMADOActionPerformed

    private void matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaActionPerformed

    private void codservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codservicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codservicoActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
                                  
       try {
           // listaSetor.removeAllItems();
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_chamados?useTimezone=true&serverTimezone=UTC", "root", "");

            String query = "SELECT descricao,status,data_hora_abertura,funcionario_matricula FROM chamado WHERE servico_cod_servico  = (?) ;";
            
            

            PreparedStatement stnt = con.prepareStatement(query);
            
              stnt.setString(1,codservico.getText()) ;
              
            ResultSet rs;
            rs = stnt.executeQuery();

            while (rs.next()) {
                descricaochamado.setText(rs.getString("descricao"));
                statustext.setText(rs.getString("status"));
                datahora.setText(rs.getString("data_hora_abertura"));
                matricula.setText(rs.getString("funcionario_matricula"));
                
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possível encontrar a classe");
        } catch (SQLException e) {
            System.out.println("Erro no SQL" + e);
        }
    }//GEN-LAST:event_MOSTRARActionPerformed

    private void ALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERARActionPerformed
        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_chamados?useTimezone=true&serverTimezone=UTC", "root", "");

            String query = "UPDATE chamado SET descricao = ?,status = ?,data_hora_abertura = ?,funcionario_matricula = ? WHERE servico_cod_servico = '" + codservico.getText() + "';";

            PreparedStatement stnt = con.prepareStatement(query);

            //stnt.setString(1, MatriculaFun.getText());
            stnt.setString(1, descricaochamado.getText());
            stnt.setString(2, (String) statuschamado.getSelectedItem());
            stnt.setString(3, datahora.getText());
            stnt.setString(4, matricula.getText());
            
            stnt.executeUpdate();
            stnt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Erro no SQL" + e);
        }
    }//GEN-LAST:event_ALTERARActionPerformed

    private void ACOMPANHARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACOMPANHARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACOMPANHARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACOMPANHAR;
    private javax.swing.JToggleButton ALTERAR;
    private javax.swing.JButton CADASTROCHAMADO;
    private javax.swing.JToggleButton MOSTRAR;
    private javax.swing.JTextField codservico;
    private javax.swing.JTextField datahora;
    private javax.swing.JTextArea descricaochamado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField matricula;
    private javax.swing.JComboBox<String> statuschamado;
    private javax.swing.JTextField statustext;
    // End of variables declaration//GEN-END:variables
}
