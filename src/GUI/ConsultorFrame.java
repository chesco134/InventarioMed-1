/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Managers.ManejadorCatalogoProducto;
import Managers.ManejadorInventario;
import Usuarios.Consultor;
import javax.swing.JOptionPane;

public class ConsultorFrame extends javax.swing.JFrame {

    ManejadorCatalogoProducto manejadorCatalogo;
    Consultor co;
    ManejadorInventario manejadorInventario;
    
    public ConsultorFrame(Consultor consultor) {
        initComponents();
        co = consultor;
        co.actualizaInventario();
        manejadorInventario = new ManejadorInventario(co.getInventario());
        manejadorInventario.setInventario(manejadorInventario.cargaInventario());
        manejadorCatalogo = new ManejadorCatalogoProducto();
        manejadorCatalogo.cargaProductos();
        recargaComboUno();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        existenciasProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        especificacionOTipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fechaCaducidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        unidadMedida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        receptor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        panelIzquierda = new javax.swing.JPanel();
        consultarProductos = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(545, 410));
        setResizable(false);

        panelDerecha.setPreferredSize(new java.awt.Dimension(390, 410));
        panelDerecha.setLayout(new java.awt.CardLayout());

        Welcome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Welcome.setText("Bienvenido al panel del Consultor");

        javax.swing.GroupLayout equisdeLayout = new javax.swing.GroupLayout(equisde);
        equisde.setLayout(equisdeLayout);
        equisdeLayout.setHorizontalGroup(
            equisdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equisdeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Welcome)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        equisdeLayout.setVerticalGroup(
            equisdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equisdeLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        panelDerecha.add(equisde, "card2");

        agregarProductosPanel.setPreferredSize(new java.awt.Dimension(385, 410));

        listaEstantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin estantes" }));
        listaEstantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEstantesActionPerformed(evt);
            }
        });

        etiquetaEstante.setText("Estante: \"  \"");

        listaProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin productos" }));
        listaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProductosActionPerformed(evt);
            }
        });

        etiquetaProducto.setText("Producto: \"   \"");

        cantidadDeProducto.setEditable(false);
        cantidadDeProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cantidadProducto.setText("Nombre del producto");

        tamanioEstante.setEditable(false);
        tamanioEstante.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        existenciasProducto.setEditable(false);
        existenciasProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Precio del producto");

        jLabel2.setText("Existencias del producto");

        especificacionOTipo.setEditable(false);
        especificacionOTipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Especificacion/Clasificacion");

        fechaCaducidad.setEditable(false);
        fechaCaducidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Fecha de caducidad");

        unidadMedida.setEditable(false);
        unidadMedida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Unidad de medida");

        receptor.setEditable(false);
        receptor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("¿Quien lo agregó?");

        javax.swing.GroupLayout agregarProductosPanelLayout = new javax.swing.GroupLayout(agregarProductosPanel);
        agregarProductosPanel.setLayout(agregarProductosPanelLayout);
        agregarProductosPanelLayout.setHorizontalGroup(
            agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductosPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(receptor)
                    .addComponent(unidadMedida)
                    .addComponent(fechaCaducidad)
                    .addComponent(especificacionOTipo)
                    .addComponent(existenciasProducto)
                    .addComponent(listaProductos, 0, 125, Short.MAX_VALUE)
                    .addComponent(tamanioEstante)
                    .addComponent(cantidadDeProducto)
                    .addComponent(listaEstantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cantidadProducto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(agregarProductosPanelLayout.createSequentialGroup()
                            .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiquetaProducto)
                                .addComponent(etiquetaEstante))
                            .addGap(25, 25, 25)))
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        agregarProductosPanelLayout.setVerticalGroup(
            agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductosPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaEstantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEstante))
                .addGap(18, 18, 18)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaProducto))
                .addGap(19, 19, 19)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadDeProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanioEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(existenciasProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(especificacionOTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarProductosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        panelDerecha.add(agregarProductosPanel, "card3");

        getContentPane().add(panelDerecha, java.awt.BorderLayout.EAST);

        panelIzquierda.setPreferredSize(new java.awt.Dimension(160, 40));

        consultarProductos.setText("Consultar Productos");
        consultarProductos.setToolTipText("");
        consultarProductos.setPreferredSize(new java.awt.Dimension(97, 23));
        consultarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarProductosActionPerformed(evt);
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
                .addComponent(consultarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIzquierdaLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(consultarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(cerrarSesion)
                .addGap(53, 53, 53))
        );

        getContentPane().add(panelIzquierda, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarProductosActionPerformed
        panelDerecha.removeAll();
        panelDerecha.repaint();
        panelDerecha.revalidate();
        panelDerecha.add(agregarProductosPanel);
        panelDerecha.repaint();
        panelDerecha.revalidate();
    }//GEN-LAST:event_consultarProductosActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
                int result = JOptionPane.showConfirmDialog(null, "Esta seguro?", "InfoBox: " + "confirmar", JOptionPane.OK_CANCEL_OPTION);
       if(result == JOptionPane.OK_OPTION){
       MainFrame mf = new MainFrame();
       this.dispose();
       mf.setVisible(true);
       }
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void listaEstantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEstantesActionPerformed
        if (listaEstantes.getSelectedIndex() == -1) {} else {
            if (((String) listaEstantes.getSelectedItem()).equals("Sin estantes")) {} else {
                java.util.ArrayList<Inventario.Estante> estantes = co.getEstantes();
                recargaComboDos(estantes.get(listaEstantes.getSelectedIndex()));
                etiquetaEstante.setText("Estante : " + "\"" +estantes.get(listaEstantes.getSelectedIndex()).getNombre() +"\"");
            }
        }
    }//GEN-LAST:event_listaEstantesActionPerformed

    private void listaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProductosActionPerformed
if (listaProductos.getSelectedIndex() == -1) {
        } else {
            if ((((String) listaProductos.getSelectedItem()).equals("Sin Productos"))) {
            } else {
                java.util.ArrayList<Inventario.Estante> estantes = co.getEstantes();
                Inventario.Estante estante = estantes.get(listaEstantes.getSelectedIndex());
                Inventario.Slot slot;
                java.util.ArrayList<Inventario.Slot> slots = estante.getSlots();
                slot = slots.get(0);
                java.util.ArrayList<Inventario.ProductoAgregado> productoss = slot.getProductos();
                if(productoss.isEmpty()){
                    cantidadDeProducto.setText("");
                    tamanioEstante.setText("");
                    especificacionOTipo.setText("");
                    fechaCaducidad.setText("");
                    unidadMedida.setText("");
                    existenciasProducto.setText("");
                    receptor.setText("");
                }else{
                tamanioEstante.setText(Float.toString(productoss.get(listaProductos.getSelectedIndex()).getProducto().getPrecio()));
                cantidadDeProducto.setText(productoss.get(listaProductos.getSelectedIndex()).getProducto().getNombre());
                especificacionOTipo.setText(productoss.get(listaProductos.getSelectedIndex()).getProducto().getDistintivo());
                fechaCaducidad.setText(productoss.get(listaProductos.getSelectedIndex()).getProducto().convertDateToString(productoss.get(listaProductos.getSelectedIndex()).getProducto().getFechaCaducidad()));
                unidadMedida.setText(productoss.get(listaProductos.getSelectedIndex()).getProducto().getUnidadMedida());
                existenciasProducto.setText(Integer.toString(getExistencias(cantidadDeProducto.getText(), estante)));
                receptor.setText(productoss.get(listaProductos.getSelectedIndex()).getNombreOperador());
                etiquetaProducto.setText("Producto : " + "\"" +productoss.get(listaProductos.getSelectedIndex()).getProducto().getNombre() +"\"");
            }
            }
        }
    }//GEN-LAST:event_listaProductosActionPerformed

    public void recargaComboUno(){
        java.util.ArrayList<Inventario.Estante> estantes = co.getInventario().getEstantes();    
        if (estantes.isEmpty()) {
            System.out.println("Sin estantes"); 
        } else {
            listaEstantes.removeAllItems();
            for (Inventario.Estante estante : estantes) {
                listaEstantes.addItem(estante.getNombre());
            }
        }
    }

    public void recargaComboDos(Inventario.Estante estante) {
        boolean trel = true;
        java.util.ArrayList<String> strings = new java.util.ArrayList<>();
        String string;
        Inventario.Slot slot;
        java.util.ArrayList<Inventario.Slot> slots = estante.getSlots();
        slot = slots.get(0);
        java.util.ArrayList<Inventario.ProductoAgregado> productos = slot.getProductos();
        listaProductos.removeAllItems();
        if(productos.isEmpty()){
            listaProductos.addItem("Sin productos");
        }else{
        for (Inventario.ProductoAgregado producto : productos) {
            trel = true;
            for(String stringg : strings){
            if(producto.getProducto().getNombre().equals(stringg)){
                trel = false;
            }else{
            }
            }
            if(trel){
            listaProductos.addItem(producto.getProducto().getNombre());
            string = producto.getProducto().getNombre();
            strings.add(string);
            }
        }
    }
}
    
    public int getExistencias(String nombreProducto, Inventario.Estante estante) {
        int trel = 0;
        Inventario.Slot slot;
        java.util.ArrayList<Inventario.Slot> slots = estante.getSlots();
        slot = slots.get(0);
        java.util.ArrayList<Inventario.ProductoAgregado> productos = slot.getProductos();
        if (productos.isEmpty()) {
            return trel = 0;
        } else {
            for (Inventario.ProductoAgregado producto : productos) {
                if (producto.getProducto().getNombre().equals(nombreProducto)) {
                    trel++;
                } else {
                }
            }
        }
        return trel;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome;
    private javax.swing.JPanel agregarProductosPanel;
    private javax.swing.JTextField cantidadDeProducto;
    private javax.swing.JLabel cantidadProducto;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton consultarProductos;
    private javax.swing.JPanel equisde;
    private javax.swing.JTextField especificacionOTipo;
    private javax.swing.JLabel etiquetaEstante;
    private javax.swing.JLabel etiquetaProducto;
    private javax.swing.JTextField existenciasProducto;
    private javax.swing.JTextField fechaCaducidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> listaEstantes;
    private javax.swing.JComboBox<String> listaProductos;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JTextField receptor;
    private javax.swing.JTextField tamanioEstante;
    private javax.swing.JTextField unidadMedida;
    // End of variables declaration//GEN-END:variables
}
