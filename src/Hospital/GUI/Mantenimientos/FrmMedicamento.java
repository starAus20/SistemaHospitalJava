/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.GUI.Mantenimientos;

import Hospital.Entities.Camas;
import Hospital.Entities.Medicamento;
import Hospital.Entities.Paciente;
import java.io.*;
import javax.swing.JOptionPane;
import sun.security.jgss.spi.MechanismFactory;

/**
 *
 * @author IVAN
 */
public class FrmMedicamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmMedicamento
     */
    Medicamento m = new Medicamento();
    public FrmMedicamento() {
        initComponents();
        HabilitarBotones(true);
        HabilitarControles(false);
        CargarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLaboratorio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMedicamento = new javax.swing.JList();

        setTitle("Mantenimiento de Medicamento");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 6));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel2.setLayout(new java.awt.GridLayout(5, 2, 0, 2));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Codigo :");
        jPanel2.add(jLabel1);

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtCodigo);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2);
        jPanel2.add(txtNombre);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Laboratorio:");
        jPanel2.add(jLabel3);
        jPanel2.add(txtLaboratorio);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Precio:");
        jPanel2.add(jLabel4);
        jPanel2.add(txtPrecio);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Stock:");
        jPanel2.add(jLabel5);
        jPanel2.add(txtStock);

        lstMedicamento.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMedicamentoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstMedicamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean esGrabar = false;
    void leerdatosdesdetxt(){
        try{
        Medicamento  m;
        FileReader fr = null;
        fr = new FileReader("C:\\Users\\IVAN\\Documents\\NetBeansProjects\\Program\\src\\BD\\Medicamentos.txt");
            BufferedReader b = new BufferedReader(fr);
            String cadena = "";
            Medicamento.lista.clear();
            while( (cadena =  b.readLine()) != null){ 
              String[] datos =   cadena.split("\\|");    
              m = new Medicamento();
              /*
                private int codigo;
                private String nombre;
                private String laboratorio;
                private double precio;
                private int stock;
               */
              m.setCodigo(Integer.parseInt(datos[0]));
              m.setNombre(datos[1]);
              m.setLaboratorio(datos[2]);
              m.setPrecio(Double.parseDouble(datos[3]));
              m.setStock(Integer.parseInt(datos[4]));
              m.Insertar(m);
                            
            }
            
          
            b.close();
        }catch(FileNotFoundException ex )
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(IOException ioexception){
            JOptionPane.showMessageDialog(null, ioexception.getMessage());
        }
    }
    private void Exportarfichero(){
         FileWriter fw = null;
        PrintWriter pw = null;
        try{
         fw = new FileWriter("C:\\Users\\IVAN\\Documents\\NetBeansProjects\\Program\\src\\BD\\Medicamentos.txt");                  
          pw = new PrintWriter(fw);
          
         for(int x = 0 ; x < Medicamento.lista.size(); x++){
             Medicamento fila =  Medicamento.lista.get(x);
             /*
                private int codigo;
                private String nombre;
                private String laboratorio;
                private double precio;
                private int stock;
              */
             
             String linea = fila.getCodigo() + "|" + fila.getNombre() + "|" + fila.getLaboratorio() + "|"
                            +  fila.getPrecio() + "|"+  fila.getStock();
              pw.println(linea);
         }
        }catch(Exception ex){
         ex.printStackTrace();
        }finally{
            try{
                if(fw != null){
                    fw.close();
                }
            }catch(Exception ex2){
                ex2.printStackTrace();
            }
         }
    }
    
     void cargarDatos(){
         String[] datos = new String[Medicamento.lista.size()];
        
        int x = 0;
        for(Medicamento registro: Medicamento.lista){        
            //  con esta linea formateo mi codigo de 1 -> 0001 para ver en 
            // control lista java
            datos[x] = String.format("%1$05d", registro.getCodigo());
            x++;
        }
 
        this.lstMedicamento.setListData(datos);
    }
     void CargarLista(){                      
        try{
            
            leerdatosdesdetxt();
            cargarDatos();
                                                      
        }catch(Exception ex)
        {
             mensaje(ex.getMessage());
        }
                         
    }
    private void HabilitarBotones(boolean valor){
        this.btnNuevo.setEnabled(valor);
        this.btnEditar.setEnabled(valor);
        this.btnEliminar.setEnabled(valor);
        this.btnGuardar.setEnabled(!valor);
        this.btnCancelar.setEnabled(!valor);
        this.btnSalir.setEnabled(valor);
    }
    private void HabilitarControles(boolean valor){
        this.txtCodigo.setEnabled(false);
        this.txtNombre.setEnabled(valor);
        this.txtLaboratorio.setEnabled(valor);
        this.txtPrecio.setEnabled(valor);
        this.txtStock.setEnabled(valor);

    }
    private void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.txtCodigo.setText(m.TraerNuevoCodigo());  
        
        HabilitarControles(true);
        HabilitarBotones(false);
        esGrabar  = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       HabilitarBotones(false);
       HabilitarControles(true);
    }//GEN-LAST:event_btnEditarActionPerformed
    private void limpiar(){
        this.txtCodigo.setText("");
        this.txtLaboratorio.setText("");
        this.txtNombre.setText("");
        this.txtPrecio.setText("");
        this.txtStock.setText("");
    }
    private void cancenlar(){
        esGrabar = false;
        HabilitarBotones(true);
        HabilitarControles(false);
        limpiar();
        CargarLista();
    }
 
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Medicamento medicamento  = new Medicamento();
        medicamento.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
        medicamento.setNombre(this.txtNombre.getText());
        medicamento.setLaboratorio(this.txtLaboratorio.getText());
        medicamento.setPrecio(Double.parseDouble(this.txtPrecio.getText()));
        medicamento.setStock(Integer.parseInt(this.txtStock.getText()));
        if(esGrabar)
        {            
           medicamento.Insertar(medicamento);
           JOptionPane.showMessageDialog(null, "Registro Insertado");
        }else {
            medicamento.Actualiar(medicamento);
            JOptionPane.showMessageDialog(null, "Registro Acutalizado");
        }
        Exportarfichero();
        cancenlar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancenlar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void lstMedicamentoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMedicamentoValueChanged
        if(this.lstMedicamento.getSelectedValue() != null)
        {
            int codigo = Integer.parseInt(this.lstMedicamento.getSelectedValue().toString());
            for(int i = 0 ; i < Medicamento.lista.size(); i ++){
                if(Medicamento.lista.get(i).getCodigo() == codigo)
                {
                    Medicamento registro =  Medicamento.lista.get(i);
                     String pcodigo = String.format("%1$05d",registro.getCodigo());
                    this.txtCodigo.setText(pcodigo);                     
                    this.txtLaboratorio.setText(registro.getLaboratorio());
                    this.txtNombre.setText(registro.getNombre());
                    this.txtPrecio.setText(String.valueOf(registro.getPrecio()));
                    this.txtStock.setText(String.valueOf(registro.getStock()));
                }
            }
        }
    }//GEN-LAST:event_lstMedicamentoValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstMedicamento;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLaboratorio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
