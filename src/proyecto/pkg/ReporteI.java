/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg;

import Conex.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author libreria6
 */
public class ReporteI extends javax.swing.JInternalFrame {
Conexion c= new Conexion();
PreparedStatement ps;
ResultSet rs;
ResultSetMetaData rsm;
DefaultTableModel dtm;
    /**
     * Creates new form ReporteR
     */
public ReporteI() {
        c.conector();
        initComponents();
         this.setSize(730, 460);
        this.jComboBox1.setModel(c.Obt_Doc());
        this.jComboBox2.setModel(c.Obt_Codigo());
        this.jComboBox3.setModel(c.Obt_Serv());
        this.jComboBox1.setEnabled(false);
        this.jComboBox2.setEnabled(false);
        this.jComboBox3.setEnabled(false);
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reportes Ingresos");
        setVisible(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Servicio", "Fecha", "No. Documento", "Documento", "Monto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jCheckBox1.setText("Documento");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Nombre de cuenta");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Servicio");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        jLabel3.setText("Fecha inicial");

        jDateChooser2.setDateFormatString("dd/MM/yyyy");

        jLabel4.setText("Fecha final");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar documento", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar nombre de cuenta", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar servicio", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Total");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addGap(115, 115, 115))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox2))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox3))))
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(this.jCheckBox1.isSelected()){
            this.jComboBox1.setEnabled(true);
        }else{
            this.jComboBox1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if(this.jCheckBox3.isSelected()){
            this.jComboBox3.setEnabled(true);
        }else{
            this.jComboBox3.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if(this.jCheckBox2.isSelected()){
            this.jComboBox2.setEnabled(true);
        }else{
            this.jComboBox2.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String select="SELECT ";
        String fr="FROM transaccion inner join cuenta on cuenta.Id = transaccion.cuenta_No\n" +
        "inner join servicio on servicio.Id = transaccion.servicio_Id\n" +
        "inner join documento on documento.Id = transaccion.documento_Id\n";
        String campos="cuenta.Nombre_asignado,servicio.Tipo, transaccion.Fecha, transaccion.No_doc, documento.Nombre, "
                + "transaccion.monto \n"; //aquí se deberían agrear los campos que se quieran mostrar
        String condicionales="WHERE ";
        String sentencia, sentenciaTotal;
        int contador=0;
        // TODO add your handling code here:
        //Rango de fecha
        
        if((jDateChooser1.getDate()!=null)&&(jDateChooser2.getDate()!=null))
        {
            contador++;
            java.util.Date fechaInicial = jDateChooser1.getDate();
            long d = fechaInicial.getTime();
            java.sql.Date fecha = new java.sql.Date(d);
            //JOptionPane.showMessageDialog(null, fecha);//fecha en formato Año-Mes-Día
            //--------------------------
            java.util.Date fechaFinal = jDateChooser2.getDate();
            long d1 = fechaFinal.getTime();
            java.sql.Date fecha1 = new java.sql.Date(d1);
            //JOptionPane.showMessageDialog(null, fecha1);//fecha en formato Año-Mes-Día
            condicionales=condicionales+"transaccion.Fecha BETWEEN '"+fecha+"' AND '"+fecha1+"' ";    
        }
        if(jCheckBox1.isSelected())
        {  
           if(jComboBox1.getSelectedIndex()>0)
           {
               Integer documento_Id=Integer.parseInt(c.lista.get(jComboBox1.getSelectedIndex()-1));
                if(contador!=0)
                {
                    condicionales=condicionales+"AND ";
                }
                condicionales=condicionales+"transaccion.documento_Id = "+documento_Id+" ";
                contador++;
           }
        }
        if(jCheckBox2.isSelected())
        {  
           if(jComboBox2.getSelectedIndex()>0)
           {
               Integer cuenta_No=Integer.parseInt(jComboBox2.getSelectedItem().toString());
                if(contador!=0)
                {
                    condicionales=condicionales+"AND ";
                }
                condicionales=condicionales+"transaccion.cuenta_No = "+cuenta_No+" ";
                contador++;
           }
        }
        if(jCheckBox3.isSelected())
        {  
           if(jComboBox3.getSelectedIndex()>0)
           {
               Integer servicio_Id=Integer.parseInt(c.listaS.get(jComboBox3.getSelectedIndex()-1));
                if(contador!=0)
                {
                    condicionales=condicionales+"AND ";
                }
                condicionales=condicionales+"transaccion.servicio_Id = "+servicio_Id+" ";
                contador++;
           }
        }
        /*if(jComboBox4.getSelectedIndex()>0)
        {
           Integer Tipo=jComboBox4.getSelectedIndex()-1;
            if(contador!=0)
            {
                condicionales=condicionales+"AND ";
            }
            condicionales=condicionales+"transaccion.Tipo = "+Tipo+" "; 
            contador++;
        }*/
        sentencia=select+campos+fr;
        sentenciaTotal=select + "SUM(transaccion.Monto) "+ fr;
        if (contador!=0)
        {
            sentencia=sentencia+condicionales;
            sentenciaTotal=sentenciaTotal+condicionales;
        }
        
        sentencia = sentencia + "and transaccion.Tipo = 1";
        // aquí viene lo de la tabla
        eliminar();
        try{
            //Impresion en orden
           ps = (PreparedStatement) c.con.prepareStatement(sentencia);
           rs=ps.executeQuery();
           rsm = (ResultSetMetaData)rs.getMetaData();
           ArrayList<Object[]> data = new ArrayList<> ();
           while(rs.next()){
               Object[] rows = new Object[rsm.getColumnCount()];
               for (int i=0; i<rows.length; i++){
                   rows[i] = rs.getObject(i+1);
               }
               data.add(rows);
           }
           dtm=(DefaultTableModel)this.jTable1.getModel();
           for(int i=0; i<data.size(); i++){
               dtm.addRow(data.get(i));
           }
           
        }catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
           
//############################ AQUI SE VIENE LA SUMA
        suma();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void suma()
    {
        int contar=jTable1.getRowCount();
        double sumatoria=0;
        for(int i=0; i<contar;i++)
        {
            double valor= Double.parseDouble(jTable1.getValueAt(i, 5).toString());
            sumatoria=sumatoria+valor;
        }
        jTextField1.setText(String.valueOf(sumatoria));
        
    }
    public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        int a = jTable1.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        //cargaTicket();
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
