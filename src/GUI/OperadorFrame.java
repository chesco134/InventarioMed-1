/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Inventario.Producto;
import javax.swing.JOptionPane;
import Usuarios.Operador;
import Managers.*;

/**
 *
 * @author copec
 */
public class OperadorFrame extends javax.swing.JFrame {

    ManejadorCatalogoProducto manejadorCatalogo;
    Operador op;
    ManejadorInventario manejadorInventario;
    
    public OperadorFrame(Operador operador) {
        initComponents();
        op = operador;
        manejadorInventario = new ManejadorInventario(op.getInventario());
        manejadorCatalogo = new ManejadorCatalogoProducto();
        manejadorCatalogo.cargaProductos();
        recargaCombo();
        recargaComboDos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelDerecha = new javax.swing.JPanel();
        equisde = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        agregarProductosPanel = new javax.swing.JPanel();
        listaEstantes = new javax.swing.JComboBox<>();
        etiquetaEstante = new javax.swing.JLabel();
        listaProductos = new javax.swing.JComboBox<>();
        etiquetaProducto = new javax.swing.JLabel();
        cantidadDeProducto = new javax.swing.JTextField();
        cantidadProducto = new javax.swing.JLabel();
        tamanioEstante = new javax.swing.JTextField();
        tamanioRestanteEstante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        eliminarProductosPanel = new javax.swing.JPanel();
        listaEstantes1 = new javax.swing.JComboBox<>();
        etiquetaEstante1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        etiquetaProducto1 = new javax.swing.JLabel();
        cantidadDeProducto1 = new javax.swing.JTextField();
        cantidadProducto1 = new javax.swing.JLabel();
        tamanioEstante1 = new javax.swing.JTextField();
        tamanioRestanteEstante1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panelIzquierda = new javax.swing.JPanel();
        agregarProductos = new javax.swing.JButton();
        eliminarProductos = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelDerecha.setPreferredSize(new java.awt.Dimension(390, 410));
        panelDerecha.setLayout(new java.awt.CardLayout());

        Welcome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Welcome.setText("Bienvenido al panel del Operador");

        javax.swing.GroupLayout equisdeLayout = new javax.swing.GroupLayout(equisde);
        equisde.setLayout(equisdeLayout);
        equisdeLayout.setHorizontalGroup(
            equisdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equisdeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Welcome)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        equisdeLayout.setVerticalGroup(
            equisdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equisdeLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        panelDerecha.add(equisde, "card2");

        agregarProductosPanel.setPreferredSize(new java.awt.Dimension(390, 410));

        listaEstantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin estantes" }));
        listaEstantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEstantesActionPerformed(evt);
            }
        });

        etiquetaEstante.setText("Estante: \"  \"");

        listaProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin productos" }));

        etiquetaProducto.setText("Producto: \"   \"");

        cantidadDeProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cantidadProducto.setText("Ingrese la cantidad");

        tamanioEstante.setEditable(false);
        tamanioEstante.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tamanioRestanteEstante.setEditable(false);
        tamanioRestanteEstante.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Tamaño total del estante");

        jLabel2.setText("Tamaño restante del estante");

        jButton1.setText("Guardar cambios");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        agregar.setText("Agregar producto");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agregarProductosPanelLayout = new javax.swing.GroupLayout(agregarProductosPanel);
        agregarProductosPanel.setLayout(agregarProductosPanelLayout);
        agregarProductosPanelLayout.setHorizontalGroup(
            agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductosPanelLayout.createSequentialGroup()
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarProductosPanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(agregarProductosPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tamanioRestanteEstante)
                            .addComponent(listaProductos, 0, 125, Short.MAX_VALUE)
                            .addComponent(tamanioEstante)
                            .addComponent(cantidadDeProducto)
                            .addComponent(listaEstantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadProducto)
                            .addComponent(etiquetaProducto)
                            .addComponent(etiquetaEstante)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(agregarProductosPanelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(agregar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        agregarProductosPanelLayout.setVerticalGroup(
            agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductosPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaEstantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEstante))
                .addGap(27, 27, 27)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaProducto))
                .addGap(30, 30, 30)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadDeProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadProducto))
                .addGap(18, 18, 18)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanioEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tamanioRestanteEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(agregar)
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        panelDerecha.add(agregarProductosPanel, "card3");

        eliminarProductosPanel.setPreferredSize(new java.awt.Dimension(390, 410));

        listaEstantes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin estantes" }));

        etiquetaEstante1.setText("Estante: \"  \"");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin productos", " " }));

        etiquetaProducto1.setText("Producto: \"   \"");

        cantidadDeProducto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cantidadProducto1.setText("Ingrese la cantidad");

        tamanioEstante1.setEditable(false);
        tamanioEstante1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tamanioRestanteEstante1.setEditable(false);
        tamanioRestanteEstante1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Tamaño total del estante");

        jLabel4.setText("Tamaño restante del estante");

        jButton2.setText("Guardar cambios");
        jButton2.setToolTipText("");

        javax.swing.GroupLayout eliminarProductosPanelLayout = new javax.swing.GroupLayout(eliminarProductosPanel);
        eliminarProductosPanel.setLayout(eliminarProductosPanelLayout);
        eliminarProductosPanelLayout.setHorizontalGroup(
            eliminarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarProductosPanelLayout.createSequentialGroup()
                .addGroup(eliminarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eliminarProductosPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(eliminarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tamanioRestanteEstante1)
                            .addComponent(jComboBox2, 0, 125, Short.MAX_VALUE)
                            .addComponent(tamanioEstante1)
                            .addComponent(cantidadDeProducto1)
                            .addComponent(listaEstantes1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(eliminarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadProducto1)
                            .addComponent(etiquetaProducto1)
                            .addComponent(etiquetaEstante1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(eliminarProductosPanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        eliminarProductosPanelLayout.setVerticalGroup(
            eliminarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarProductosPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(eliminarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaEstantes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEstante1))
                .addGap(27, 27, 27)
                .addGroup(eliminarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaProducto1))
                .addGap(32, 32, 32)
                .addGroup(eliminarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadDeProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadProducto1))
                .addGap(52, 52, 52)
                .addGroup(eliminarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanioEstante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addGroup(eliminarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanioRestanteEstante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addComponent(jButton2)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        panelDerecha.add(eliminarProductosPanel, "card3");

        getContentPane().add(panelDerecha, java.awt.BorderLayout.EAST);

        panelIzquierda.setPreferredSize(new java.awt.Dimension(140, 40));

        agregarProductos.setText("Agregar productos");
        agregarProductos.setToolTipText("");
        agregarProductos.setPreferredSize(new java.awt.Dimension(97, 23));
        agregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductosActionPerformed(evt);
            }
        });

        eliminarProductos.setText("Eliminar productos");
        eliminarProductos.setPreferredSize(new java.awt.Dimension(97, 23));
        eliminarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductosActionPerformed(evt);
            }
        });

        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIzquierdaLayout = new javax.swing.GroupLayout(panelIzquierda);
        panelIzquierda.setLayout(panelIzquierdaLayout);
        panelIzquierdaLayout.setHorizontalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(eliminarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(agregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(eliminarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(cerrarSesion)
                .addGap(53, 53, 53))
        );

        getContentPane().add(panelIzquierda, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductosActionPerformed
        panelDerecha.removeAll();
        panelDerecha.repaint();
        panelDerecha.revalidate();
        panelDerecha.add(agregarProductosPanel);
        panelDerecha.repaint();
        panelDerecha.revalidate();
    }//GEN-LAST:event_agregarProductosActionPerformed

    private void eliminarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductosActionPerformed
        panelDerecha.removeAll();
        panelDerecha.repaint();
        panelDerecha.revalidate();
        panelDerecha.add(eliminarProductosPanel);
        panelDerecha.repaint();
        panelDerecha.revalidate();
    }//GEN-LAST:event_eliminarProductosActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
                int result = JOptionPane.showConfirmDialog(null, "Esta seguro?", "InfoBox: " + "confirmar", JOptionPane.OK_CANCEL_OPTION);
       if(result == JOptionPane.OK_OPTION){
       MainFrame mf = new MainFrame();
       this.dispose();
       mf.setVisible(true);
       }
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void listaEstantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEstantesActionPerformed
        if (listaProductos.getSelectedIndex() == -1) {} else {
            if (((String) listaProductos.getSelectedItem()).equals("Sin estantes")) {} else {
                java.util.ArrayList<Inventario.Estante> estantes = op.getEstantes();
                tamanioEstante.setText(Integer.toString(estantes.get(listaProductos.getSelectedIndex()).getEspacioTotal()));
                tamanioRestanteEstante.setText(Integer.toString(estantes.get(listaProductos.getSelectedIndex()).getEspacioRestante()));
            }
        }

    }//GEN-LAST:event_listaEstantesActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        agregarProductoEstante();
    }//GEN-LAST:event_agregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        manejadorCatalogo.guardaProductos();
        recargaCombo();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void quitarProductoEstante(){
        
    }
    
    public java.util.ArrayList<Inventario.Estante> agregarProductoEstante(){
        if (listaProductos.getSelectedIndex() == -1) {return null;} else {
            if (((String) listaProductos.getSelectedItem()).equals("Sin estantes")) {return null;} else {Inventario.Producto produucto;
        java.util.ArrayList<Producto> productos = manejadorCatalogo.obtenerCatalogoProductos();
        produucto = productos.get(listaProductos.getSelectedIndex());
        Inventario.ProductoAgregado producto;
        Inventario.Estante estante;
        producto = new Inventario.ProductoAgregado(produucto, op.getNombre());
        java.util.ArrayList<Inventario.Estante> estantes = op.getEstantes();
        estante = estantes.get(listaEstantes.getSelectedIndex());
        estante.agregarProducto(producto);
        tamanioRestanteEstante.setText(Integer.toString(estante.getEspacioRestante()));
        return estantes;
            }
        }
        
    }
    
    public void recargaCombo(){
        java.util.ArrayList<Inventario.Estante> estantes = op.getEstantes();    
        if (estantes.isEmpty()) {
            System.out.println("Sin estantes"); 
        } else {
            listaEstantes.removeAllItems();
            for (Inventario.Estante estante : estantes) {
                listaEstantes.addItem(estante.getNombre());
            }
        }
    }
    
    public void recargaComboDos(){
        java.util.ArrayList<Producto> productos = manejadorCatalogo.obtenerCatalogoProductos();
        if(productos.isEmpty()){
            System.out.println("Sin catalogo");
        }else{
            this.listaProductos.removeAllItems();
            for (Producto product : productos){
                this.listaProductos.addItem(product.getNombre());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome;
    private javax.swing.JButton agregar;
    private javax.swing.JButton agregarProductos;
    private javax.swing.JPanel agregarProductosPanel;
    private javax.swing.JTextField cantidadDeProducto;
    private javax.swing.JTextField cantidadDeProducto1;
    private javax.swing.JLabel cantidadProducto;
    private javax.swing.JLabel cantidadProducto1;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton eliminarProductos;
    private javax.swing.JPanel eliminarProductosPanel;
    private javax.swing.JPanel equisde;
    private javax.swing.JLabel etiquetaEstante;
    private javax.swing.JLabel etiquetaEstante1;
    private javax.swing.JLabel etiquetaProducto;
    private javax.swing.JLabel etiquetaProducto1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> listaEstantes;
    private javax.swing.JComboBox<String> listaEstantes1;
    private javax.swing.JComboBox<String> listaProductos;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JTextField tamanioEstante;
    private javax.swing.JTextField tamanioEstante1;
    private javax.swing.JTextField tamanioRestanteEstante;
    private javax.swing.JTextField tamanioRestanteEstante1;
    // End of variables declaration//GEN-END:variables
}
