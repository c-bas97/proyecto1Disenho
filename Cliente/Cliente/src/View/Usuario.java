/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import dto_cliente.DTO_Cliente;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Monserrath
 */
public class Usuario extends javax.swing.JFrame {
    
    DefaultListModel modelSalidas = new DefaultListModel();
    DefaultListModel modelAlgoritmos = new DefaultListModel();
    DTO_Cliente dtoC = new DTO_Cliente();

    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        ArrayList algoritmos = new ArrayList();
        algoritmos.add("PalabraClave");
        algoritmos.add("Sustitucion");
        algoritmos.add("love me");
        dtoC.setAlfabetos(algoritmos);
        for (String alfabeto : dtoC.getAlfabetos()) {
            comboAlfabetos.addItem(alfabeto);
        }
        
        //Popular algoritmos
        for (String alfabeto : dtoC.getAlfabetos()) {
            modelAlgoritmos.addElement(alfabeto);
        }
        listAlgoritmos.setModel(modelAlgoritmos);
        
        //Popular Salidas
        for (String alfabeto : dtoC.getAlfabetos()) {
            modelSalidas.addElement(alfabeto);
        }
        listSalida.setModel(modelAlgoritmos);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboAlfabetos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaRes = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAlgoritmos = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtfLargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfPClave = new javax.swing.JTextField();
        radDeco = new javax.swing.JRadioButton();
        radSim = new javax.swing.JRadioButton();
        radNoD = new javax.swing.JRadioButton();
        radNoGen = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        txtfFrase = new javax.swing.JTextField();
        btnPeticion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listSalida = new javax.swing.JList<>();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Alfabetos");

        comboAlfabetos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtaRes.setColumns(20);
        txtaRes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtaRes.setRows(5);
        jScrollPane1.setViewportView(txtaRes);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Algoritmo a implementar");

        listAlgoritmos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(listAlgoritmos);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Resultado");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles Adicionales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        txtfLargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfLargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfLargoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Longitud:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Palabra Clave");

        txtfPClave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        radDeco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radDeco.setText("Codificar");

        radSim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radSim.setText("Simbolos no consecutivos");
        radSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSimActionPerformed(evt);
            }
        });

        radNoD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radNoD.setText("No duplicados");

        radNoGen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radNoGen.setText("No generar frase");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radDeco)
                    .addComponent(radSim)
                    .addComponent(radNoD)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(radNoGen)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtfPClave, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtfLargo)
                .addGap(9, 9, 9))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radDeco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radNoD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radNoGen)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfPClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtfLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Frase");

        txtfFrase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnPeticion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPeticion.setText("Realizar Peticion");
        btnPeticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeticionActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Tipo de Bitacora");

        listSalida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(listSalida);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addComponent(txtfFrase)
                    .addComponent(jLabel5)
                    .addComponent(btnPeticion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(comboAlfabetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel18)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(255, 255, 255))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboAlfabetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel18)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtfFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnPeticion))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Codificar", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(343, 343, 343))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        //ArrayList alfabetos = new ArrayList();
        //alfabetos.add((String) comboAlfabetos.getSelectedItem());

        dtoC.setAlfabeto((String) comboAlfabetos.getSelectedItem());
        //System.out.println(dtoC.getAlfabeto());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeticionActionPerformed
        // TODO add your handling code here:
           
        informacion();
        //System.out.println(dtoC.getAlgoritmos().contains("PalabraClave"));
        if(dtoC.getCodificar() == true){
            
            if(dtoC.getAlgoritmos().contains("PalabraClave") == true){
                if(txtfPClave.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Por favor inserte una frase", "InfoBox: " + "Warning", JOptionPane.INFORMATION_MESSAGE);    
                }
                else{
                    dtoC.setFrase(txtfPClave.getText());
                }
            }
            if (dtoC.getAlgoritmos().contains("Sustitucion")){
                if(txtfLargo.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Por favor insertar un numero", "InfoBox: " + "Warning", JOptionPane.INFORMATION_MESSAGE);
                }
                
                if(txtfLargo.getText().length() != 2){
                    JOptionPane.showMessageDialog(null, "Por favor inserte un nuemro de dos cifras", "InfoBox: " + "Warning", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    dtoC.setCifra(txtfLargo.getText());
                }
            }
        }
        
        //pasar el dto
        
        //llamar al metodo que hace las cosas
        
        try {
        txtaRes.append("Resultado de ejecutar el/los algortimos:\n");
            for (int i=0; i<dtoC.getResultados().size(); i++){
                txtaRes.append(dtoC.getResultados().get(i) + "\n");
            }
        } 
        catch (Exception e){
            txtaRes.append("Error al ejecutar el/los algortimos");
        }
    }//GEN-LAST:event_btnPeticionActionPerformed

    private void txtfLargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfLargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfLargoActionPerformed

    private void radSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radSimActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }
    
    private void informacion(){
        int pos;
        dtoC.setAlfabeto((String) comboAlfabetos.getSelectedItem());
        
        if(listSalida.getSelectedValuesList().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor seleccionar algun tipo de salida", "InfoBox: " + "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        if(listAlgoritmos.getSelectedValuesList().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor seleccionar algun tipo de algoritmo", "InfoBox: " + "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        if (radDeco.isSelected()){
            dtoC.setCodificar(true);
        }
        if(txtfFrase.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor introducir frase", "InfoBox: " + "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else{
            dtoC.setTiposBitacoras((ArrayList<String>) listSalida.getSelectedValuesList());
            dtoC.setAlgoritmos((ArrayList<String>) listAlgoritmos.getSelectedValuesList());
            String replaceAll = dtoC.getAlgoritmos().get(0).replaceAll("(^\\[|\\]$)", "");
            pos = dtoC.getAlgoritmos().size();
            String replaceAll2 = dtoC.getAlgoritmos().get(pos-1).replaceAll("(^\\[|\\]$)", "");
            dtoC.getAlgoritmos().remove(0);
            dtoC.getAlgoritmos().add(0, replaceAll);
            dtoC.getAlgoritmos().remove(pos-1);
            pos = dtoC.getAlgoritmos().size();
            dtoC.getAlgoritmos().add(pos, replaceAll2);
            dtoC.setCodificar(false);
            dtoC.setFrase(txtfFrase.getText());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPeticion;
    private javax.swing.JComboBox<String> comboAlfabetos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listAlgoritmos;
    private javax.swing.JList<String> listSalida;
    private javax.swing.JRadioButton radDeco;
    private javax.swing.JRadioButton radNoD;
    private javax.swing.JRadioButton radNoGen;
    private javax.swing.JRadioButton radSim;
    private javax.swing.JTextArea txtaRes;
    private javax.swing.JTextField txtfFrase;
    private javax.swing.JTextField txtfLargo;
    private javax.swing.JTextField txtfPClave;
    // End of variables declaration//GEN-END:variables
}
