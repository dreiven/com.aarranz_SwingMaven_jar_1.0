/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swig;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;

/**
 *
 * @author PC
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    ResultSet result;
    String[] columns = {"idLibro", "Autor", "titulo"};
    DefaultTableModel modelo = new DefaultTableModel(columns, 0);
    private DefaultListModel modeloLista = new DefaultListModel();

    public NewJFrame() throws SQLException {
        initComponents();
        getConex();
        result = consultaInicial();
        jTextField1.setText(result.getMetaData().getCatalogName(WIDTH));
//      jList1.add(result.getMetaData().getColumnName(0));
//      modeloLista.addElement(result.getMetaData().getColumnName(1));
        modeloLista.addElement(result.getMetaData().getSchemaName(2));
        modeloLista.addElement(result.getMetaData().getTableName(1));
        modeloLista.addElement(result.getMetaData().getTableName(3));
        jList1.setModel(modeloLista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Albert Av
    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton3 = new JButton();
        jButton2 = new JButton();
        jButton4 = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jTextField1 = new JTextField();
        jScrollPane2 = new JScrollPane();
        jList1 = new JList<>();
        label1 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base de Datos");
        Container contentPane = getContentPane();

        //======== jScrollPane1 ========
        {
            jScrollPane1.setViewportView(jTable1);
        }

        //======== jPanel1 ========
        {

            // JFormDesigner evaluation mark
            jPanel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), jPanel1.getBorder())); jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- jButton1 ----
            jButton1.setText("Cargar Tabla SQL");
            jButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionMostrar(e);
                }
            });

            //---- jButton3 ----
            jButton3.setText("Borrar Tabla");
            jButton3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionBorrar(e);
                }
            });

            //---- jButton2 ----
            jButton2.setText("Salir");
            jButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionSalir(e);
                }
            });

            //---- jButton4 ----
            jButton4.setText("Insertar Datos");
            jButton4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionInsertar(e);
                }
            });

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(119, Short.MAX_VALUE)
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup()
                            .addComponent(jButton1)
                            .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 157, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
            );
        }

        //---- jLabel1 ----
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel1.setText("Mostrar Tabla :");

        //---- jLabel4 ----
        jLabel4.setText("Base de Datos");

        //---- jTextField1 ----
        jTextField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1ActionPerformed(e);
            }
        });

        //======== jScrollPane2 ========
        {

            //---- jList1 ----
            jList1.setModel(new AbstractListModel<String>() {
                String[] values = {
                    "Item 1",
                    "Item 2",
                    "Item 3",
                    "Item 4",
                    "Item 5"
                };
                @Override
                public int getSize() { return values.length; }
                @Override
                public String getElementAt(int i) { return values[i]; }
            });
            jList1.setAutoscrolls(false);
            jList1.setValueIsAdjusting(true);
            jScrollPane2.setViewportView(jList1);
        }

        //---- label1 ----
        label1.setIcon(new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\com.aarranz_SwingMaven_jar_1.0\\src\\main\\java\\swig\\img\\bbddpk.png"));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 1, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 42, Short.MAX_VALUE))
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- bindings ----
        bindingGroup = new BindingGroup();
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            jTextField1, BeanProperty.create("text"),
            this, BeanProperty.create("title")));
        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void accionMostrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionMostrar
        CargaBaseDatos(modelo, jTable1, jLabel2);
    }//GEN-LAST:event_accionMostrar

    private void accionSalir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionSalir
        Salir();
    }//GEN-LAST:event_accionSalir

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void accionBorrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionBorrar
        borrarTabla();
    }//GEN-LAST:event_accionBorrar

    private void accionInsertar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionInsertar
        insertarDatos(jTable1);
    }//GEN-LAST:event_accionInsertar

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static Connection getConex() {
        //se declara el objeto COnnection con la referencia conexion a null 
        java.sql.Connection conexion = null;
        //String con la direccion de la bbdd en el servidor 
        String url = "jdbc:mysql://localhost:3306/control";
        //usuario en String
        String user = "root";
        //password en String
        String password = "";
        try {
            //le asignamos parametros(url , user y password) para conectar al objeto conexion a traves del metodo Druvermanager.getConnection
            conexion = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexion;
    }

    public static ResultSet consultaTodos() {
        ResultSet result = null;
        Statement sentencia = null;
        String res;
        try {
            //se crea el objeto Statement para realizar una consulta la bbdd con los datos a traves de la conexion creada anteriormente 
            sentencia = getConex().createStatement();
            //se crea objeto ResulSet para almacenar el valor obtenido por la consulta SQL realizada por el obj Statement
            res = JOptionPane.showInputDialog("Que tabla desea abrir archivos o usuarios ");

            result = sentencia.executeQuery("SELECT * FROM " + res);

        } catch (Exception e) {
        }
        return result;
    }

    public static ResultSet consultaInicial() {
        ResultSet result = null;
        Statement sentencia = null;
        String res;
        try {
            //se crea el objeto Statement para realizar una consulta la bbdd con los datos a traves de la conexion creada anteriormente 
            sentencia = getConex().createStatement();
            //se crea objeto ResulSet para almacenar el valor obtenido por la consulta SQL realizada por el obj Statement
            result = sentencia.executeQuery("SELECT * FROM control.archivos");

        } catch (Exception e) {
        }
        return result;
    }

    public static void borrarTabla() {
        try {
            Statement sentencia = getConex().createStatement();
            /* ejecuta la sentencia de borrado */
            int filasAfectadas;

            filasAfectadas = sentencia.executeUpdate("DELETE FROM control.archivos WHERE 1=1");
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }

    }

    public static JTable insertarDatos(JTable tabla) {
        try {
            Statement sentencia = getConex().createStatement();

            int filasAfectadas;
            String res;
            int value1 = 0;
            String resValue1 = "";
            String value2;
            String value3;
//                res = JOptionPane.showInputDialog("Que tabla desea modificar usuarios o archivos");
            resValue1 = JOptionPane.showInputDialog("Inserte primer valor");
            value1 = Integer.parseInt(resValue1);
            value2 = JOptionPane.showInputDialog("Inserte segundo valor");
            value3 = JOptionPane.showInputDialog("Inserte tercer valor");
            filasAfectadas = sentencia.executeUpdate("INSERT INTO archivos VALUES" + "(" + value1 + value2 + value3 + ")");
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }

        return tabla;

    }

    public static DefaultTableModel CargaBaseDatos(DefaultTableModel modelo, JTable tabla, JLabel jLabel2) {
        //se declara condicion para que no repinte la tabla con los mismos datos una y otra vez
        //,si el modelo contiene menos de 0 filas accede
        tabla.setModel(modelo);

        /////////////////////REEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE//////////////////////
        if (modelo.getRowCount() <= 1) {
            try {
             
                //se crea el objeto Statement para realizar una consulta la bbdd con los datos a traves de la conexion creada anteriormente 
                Statement sentencia = getConex().createStatement();
                //se crea objeto ResulSet para almacenar el valor obtenido por la consulta SQL realizada por el obj Statement
                ResultSet result = sentencia.executeQuery("SELECT * FROM archivos ");
                //declaramos objetos para guardar los resultados obtenidos para la tabla
                Object[] fila = new Object[3];

                //bucle while para mostrar datos mientras haya algun valor en el ResulSet si no los hay, no lo realizara
                while (result.next()) {

//                System.out.println(result.);
                    //Creamos un Objeto con tantos parámetros como datos retorne cada fila 
                    // de la consulta
//                System.out.println(result.getMetaData().getTableName(0));
                    fila[0] = result.getInt("idLibro"); //pasamos como parametro el nombre en String de los campos de la base de datos
                    fila[1] = result.getString("Autor");
                    fila[2] = result.getString("Titulo");
                    System.out.println();
                    jLabel2.setText(result.getMetaData().getTableName(WIDTH));
                    tabla.setName(result.getMetaData().getTableName(WIDTH));
                    modelo.addRow(fila);

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            //para referescar la tabla despues de cada llamada al metodo , da problemas ya que desaparecen los demas componentes del panel
//         tabla.updateUI();
        }
        return modelo;
    }

    public static void Salir() {
        System.exit(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Albert Av
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JPanel jPanel1;
    private JButton jButton1;
    private JButton jButton3;
    private JButton jButton2;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JTextField jTextField1;
    private JScrollPane jScrollPane2;
    private JList<String> jList1;
    private JLabel label1;
    private BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
