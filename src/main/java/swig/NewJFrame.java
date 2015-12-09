/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swig;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.*;
import java.awt.event.*;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    DefaultTableModel modelo = new DefaultTableModel();
    public DefaultListModel modeloLista = new DefaultListModel();

    
   int numeroRecuperado=loginTabla.numero;
    private void accionGuardar(ActionEvent e) {
        guardarArchivo();
    }

   

    public NewJFrame() throws SQLException {
        initComponents();
       
        consultaInicial(modeloLista, jList1, jTextField1,label2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - juab tobin
    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton3 = new JButton();
        jButton2 = new JButton();
        jButton4 = new JButton();
        button1 = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jTextField1 = new JTextField();
        jScrollPane2 = new JScrollPane();
        jList1 = new JList<>();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

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

            //---- button1 ----
            button1.setText("Guardar");
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionGuardar(e);
                }
            });

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup()
                            .addComponent(jButton1)
                            .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(button1))
                        .addGap(30, 30, 30)
                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
            );
        }

        //---- jLabel1 ----
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel1.setText("Mostrar Tabla :");

        //---- jLabel2 ----
        jLabel2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));

        //---- jLabel4 ----
        jLabel4.setText("Base de Datos");

        //---- jTextField1 ----
        jTextField1.setEditable(false);
        jTextField1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
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

        //---- label2 ----
        label2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));

        //---- label3 ----
        label3.setText("Usuario :");
        label3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        label3.setFont(new Font("Tahoma", Font.BOLD, 12));
        label3.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
                            .addGap(186, 186, 186))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
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
                            .addGap(1, 1, 1)))
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
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 29, Short.MAX_VALUE))
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
        CargaBaseDatos(modelo, jTable1, jLabel2, jList1);
        jLabel1.setText(loginTabla.puente.getDato());
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
        insertarDatos(jTable1, jList1);
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
                    
                    
                    label2.setText(loginTabla.puente.getDato());
                    
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    //Metodo para conseguir una conexion con la BBDD
    public static Connection getConex() {
        //se declara el objeto COnnection con la referencia conexion a null 
        java.sql.Connection conexion = null;
        //String con la direccion de la bbdd en el servidor 
        String url = "jdbc:mysql://localhost:3306/control";
        //usuario en String
        String user = "root";
        //password en String
        String password = "manager";
        try {
            //le asignamos parametros(url , user y password) para conectar al objeto conexion a traves del metodo Druvermanager.getConnection
            conexion = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //se devuelve el objeto conexion cargado con los datos url,user,password 
        return conexion;
    }

    //Metodo para realizar una consulta inicial para conseguir la informacion de la BBdd y mostrar las tablas disponibles
    public static void consultaInicial(DefaultListModel modeloList, JList list, JTextField texto,JLabel label2) {
        //se declara objeto ResulSet pero sin inicializacion,donde se guardaran los datos de la consulta
        ResultSet result = null;
        //se declara objeto Statementt pero sin inicializacion, donde guardaremos la consulta en SQL a realizar
        Statement sentencia = null;

        Statement sentencia2 = null;
        ResultSet result2 = null;
        String usuario = label2.getText();
        
        
        ////////////////////////NO RECOGE LA LABEL EL NOMBRE DEL USUARIO DEBE LLEGAR ANTES
        

        //bloque try & catch
        try {
            //se crea el objeto Statement para realizar una consulta la bbdd con los datos a traves de la conexion creada anteriormente 
            sentencia = getConex().createStatement();
            sentencia2 = getConex().createStatement();
            //se crea objeto ResulSet para almacenar el valor obtenido por la consulta SQL realizada por el obj Statement
            result = sentencia.executeQuery("SHOW FULL TABLES FROM control");
            result2 = sentencia2.executeQuery("SELECT * FROM usuarios WHERE Nombre ='" + usuario + "'");

            //bloque while ,mientras result tenga datos entrar en el while
            while (result.next()) {

                //se agrega la modelo de la lista ///////////////////////
                modeloList.addElement(result.getString(1));
                //se setea el texto al nombre de la BBDD
                texto.setText("control");
                //se setea el modelo de la lista a la lista
                list.setModel(modeloList);

            }
             
            /////////////////////lA lISTA NO ACTUALIZA CORRECTAMENTE MARCA USUARIOS Y CARGA ARCHIVOS
            while (result2.next()) {
                System.out.println(result2.getString(4));
                if ("1".equals(result2.getString(4))){
                    System.out.println("Bienvenido Admin");
                    System.out.println("Acceso completo");
                
                }
                if ("2".equals(result2.getString(4))) {

                    modeloList.removeElementAt(3);
                    System.out.println("Bienvenido Usuario avanzado");
                    System.out.println("Acceso Avanzado ");
                }
                if ("3".equals(result2.getString(4))) {

                    modeloList.removeElementAt(2);
                    modeloList.removeElementAt(1);
                    System.out.println("Bienvenido Usuario");
                    System.out.println("Acceso Standar");
                       
                } else {
                    
                    
                    
                }
            }

        } catch (Exception ex) {

            Logger.getLogger(loginTabla.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void borrarTabla() {
        try {
            Statement sentencia = getConex().createStatement();
            /* ejecuta la sentencia de borrado */
            int filasAfectadas;

            filasAfectadas = sentencia.executeUpdate("DELETE FROM archivos WHERE 1=1");
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }

    }

    public static void guardarArchivo() {

    }

    // Metodo para la insercion de datos en la tabla seleccionada en una jlist 
    public static JTable insertarDatos(JTable tabla, JList lista) {
        try {
            //se declara objeto PreparedStatement y se inicia a null
            PreparedStatement sentencia = null;
            int filasAfectadas;
            int opcion;
            int value1 = 0;
            int value4 = 0;
            String resValue1 = "";
            String resValue2 = "";
            String value2;
            String value3;
            //se asocia el index en la lista selecionado con la variable int opcion
            opcion = lista.getSelectedIndex();
            switch (opcion) {
                case 0:
                    //se declara la sentencia de SQL como string con los valores en ? (en este caso todos los datos en la tabla archivos)
                    String SQL = "INSERT INTO  archivos VALUES (?,?,?)";
                    //cargamos en la variable sentencia el prepared statement con la String SQL como parametro
                    sentencia = getConex().prepareStatement(SQL);
                    //solicitamos un primer valor por pantalla
                    resValue1 = JOptionPane.showInputDialog("Inserte primer valor");
                    //pasamos el valor String recibido a int y lo guardamos en la var int value1
                    //esto debe hacerse ya que el primer dato que  recibe la bbdd es int y al solicitarlo por pantalla se recibira un String
                    value1 = Integer.parseInt(resValue1);
                    //solicitamos por pantalla el segundo parametro (en este caso no es necesario el parseo ya que la bbdd solicita un String)
                    value2 = JOptionPane.showInputDialog("Inserte segundo valor");
                    //solicitamos tercer dato por pantalla 
                    value3 = JOptionPane.showInputDialog("Inserte tercer valor");
                    //con el prepared Statement sentencia seteamos los datos que le vamos a pasar a la bbdd ,el primer parametro le da la posicion en la tabla y el segundo los datos a setear ,
                    //los tipos de datos deben de coincidir
                    sentencia.setInt(1, value1);//id
                    sentencia.setString(2, value2);//autor
                    sentencia.setString(3, value3);//titulo
                    //ejecutamos la sentencia con el metodo executeUpdate y lo guardamos en la variable filasAfectadas para que informe de cuantas filas se han modificado
                    filasAfectadas = sentencia.executeUpdate();
                    //se muestra por pantalla un mensaje indicando la cantidad de filas modificadas
                    System.out.println("Filas afectadas: " + filasAfectadas);
                    break;

                case 1:
                    //se declara la sentencia de SQL como string con los valores en ? (en este caso todos los datos en la tabla departamentos)
                    String SQL2 = "INSERT INTO  departamentos VALUES (?,?,?)";
                    //cargamos en la variable sentencia el prepared statement con la String SQL como parametro
                    sentencia = getConex().prepareStatement(SQL2);
                    resValue1 = JOptionPane.showInputDialog("Inserte primer valor");
                    value1 = Integer.parseInt(resValue1);
                    value2 = JOptionPane.showInputDialog("Inserte segundo valor");
                    value3 = JOptionPane.showInputDialog("Inserte tercer valor");
                    sentencia.setInt(1, value1);
                    sentencia.setString(2, value2);
                    sentencia.setString(3, value3);
                    filasAfectadas = sentencia.executeUpdate();
                    System.out.println("Filas afectadas: " + filasAfectadas);
                    break;
                case 2:
                    //se declara la sentencia de SQL como string con los valores en ? (en este caso todos los datos en la tabla roles)
                    String SQL3 = "INSERT INTO  roles VALUES (?,?)";
                    sentencia = getConex().prepareStatement(SQL3);
                    resValue1 = JOptionPane.showInputDialog("Inserte primer valor");
                    value1 = Integer.parseInt(resValue1);
                    value2 = JOptionPane.showInputDialog("Inserte segundo valor");
                    sentencia.setInt(1, value1);
                    sentencia.setString(2, value2);
                    filasAfectadas = sentencia.executeUpdate();
                    System.out.println("Filas afectadas: " + filasAfectadas);
                    break;

                case 3:
                    //se declara la sentencia de SQL como string con los valores en ? (en este caso todos los datos en la tabla usuarios)
                    String SQL4 = "INSERT INTO  usuarios VALUES (?,?,?,?)";
                    sentencia = getConex().prepareStatement(SQL4);
                    resValue1 = JOptionPane.showInputDialog("Inserte primer valor");
                    value1 = Integer.parseInt(resValue1);
                    value2 = JOptionPane.showInputDialog("Inserte segundo valor");
                    value3 = JOptionPane.showInputDialog("Inserte tercer valor");
                    resValue2 = JOptionPane.showInputDialog("Inserte cuarto valor");
                    value4 = Integer.parseInt(resValue2);
                    sentencia.setInt(1, value1);
                    sentencia.setString(2, value2);
                    sentencia.setString(3, value3);
                    sentencia.setInt(4, value4);
                    filasAfectadas = sentencia.executeUpdate();
                    System.out.println("Filas afectadas: " + filasAfectadas);

                    break;

            }

        } catch (SQLException | HeadlessException | NumberFormatException ex) {
            Logger.getLogger(loginTabla.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tabla;

    }

    public static DefaultTableModel CargaBaseDatos(DefaultTableModel modelo, JTable tabla, JLabel jLabel2, JList lista) {
        //se declara condicion para que no repinte la tabla con los mismos datos una y otra vez
        //,si el modelo contiene menos de 0 filas accede

        int opcion = 0;

        Statement sentencia = null;

        if (modelo.getRowCount() > 1) {
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }
        }
        try {
            opcion = lista.getSelectedIndex();

            switch (opcion) {

                case 0:
                    try {
                        if (modelo.getRowCount() > 1) {

                        }
                        String[] columns = {"idLibro", "Autor", "titulo"};
                        modelo.setColumnIdentifiers(columns);
                        tabla.setModel(modelo);
                        //se crea el objeto Statement para realizar una consulta la bbdd con los datos a traves de la conexion creada anteriormente 
                        sentencia = getConex().createStatement();
                        //se crea objeto ResulSet para almacenar el valor obtenido por la consulta SQL realizada por el obj Statement
                        ResultSet result = sentencia.executeQuery("SELECT * FROM archivos ");
                        //declaramos objetos para guardar los resultados obtenidos para la tabla
                        Object[] fila = new Object[3];

                        //bucle while para mostrar datos mientras haya algun valor en el ResulSet si no los hay, no lo realizara
                        while (result.next()) {

                            fila[0] = result.getInt("idLibro"); //pasamos como parametro el nombre en String de los campos de la base de datos
                            fila[1] = result.getString("Autor");
                            fila[2] = result.getString("Titulo");

                            jLabel2.setText(result.getMetaData().getTableName(WIDTH));
                            tabla.setName(result.getMetaData().getTableName(WIDTH));
                            modelo.addRow(fila);

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {

                        if (sentencia != null) {
                            try {
                                sentencia.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }

                        }

                        if (getConex() != null) {
                            try {
                                getConex().close();
                            } catch (SQLException e) {
                                e.printStackTrace();

                            }

                        }

                    }
                    break;

                case 1:
                    try {
                        
                        String[] columns = {"idDepartamentos", "Nombre", "Extension"};
                        modelo.setColumnIdentifiers(columns);
                        tabla.setModel(modelo);
                        //se crea el objeto Statement para realizar una consulta la bbdd con los datos a traves de la conexion creada anteriormente 
                        sentencia = getConex().createStatement();
                        //se crea objeto ResulSet para almacenar el valor obtenido por la consulta SQL realizada por el obj Statement
                        ResultSet result = sentencia.executeQuery("SELECT * FROM departamentos ");
                        //declaramos objetos para guardar los resultados obtenidos para la tabla
                        Object[] fila = new Object[4];

                        //bucle while para mostrar datos mientras haya algun valor en el ResulSet si no los hay, no lo realizara
                        while (result.next()) {

                            fila[0] = result.getInt("idDepartamentos"); //pasamos como parametro el nombre en String de los campos de la base de datos
                            fila[1] = result.getString("Nombre");
                            fila[2] = result.getString("Extension");

                            jLabel2.setText(result.getMetaData().getTableName(WIDTH));
                            tabla.setName(result.getMetaData().getTableName(WIDTH));
                            modelo.addRow(fila);

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {

                        if (sentencia != null) {
                            try {
                                sentencia.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }

                        }

                        if (getConex() != null) {
                            try {
                                getConex().close();
                            } catch (SQLException e) {
                                e.printStackTrace();

                            }

                        }

                    }
                    break;

                case 2:
                    try {

                        String[] columns = {"idRoles", "nivel"};
                        modelo.setColumnIdentifiers(columns);
                        tabla.setModel(modelo);
                        //se crea el objeto Statement para realizar una consulta la bbdd con los datos a traves de la conexion creada anteriormente 
                        sentencia = getConex().createStatement();
                        //se crea objeto ResulSet para almacenar el valor obtenido por la consulta SQL realizada por el obj Statement
                        ResultSet result = sentencia.executeQuery("SELECT * FROM roles ");
                        //declaramos objetos para guardar los resultados obtenidos para la tabla
                        Object[] fila = new Object[4];

                        //bucle while para mostrar datos mientras haya algun valor en el ResulSet si no los hay, no lo realizara
                        while (result.next()) {

                            fila[0] = result.getInt("idRoles"); //pasamos como parametro el nombre en String de los campos de la base de datos
                            fila[1] = result.getString("nivel");

                            jLabel2.setText(result.getMetaData().getTableName(WIDTH));
                            tabla.setName(result.getMetaData().getTableName(WIDTH));
                            modelo.addRow(fila);
                            tabla.updateUI();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        String[] columns = {"idUsuarios", "Nombre", "Password", "IdRol"};
                        modelo.setColumnIdentifiers(columns);
                        tabla.setModel(modelo);
                        //se crea el objeto Statement para realizar una consulta la bbdd con los datos a traves de la conexion creada anteriormente 
                        sentencia = getConex().createStatement();
                        //se crea objeto ResulSet para almacenar el valor obtenido por la consulta SQL realizada por el obj Statement
                        ResultSet result = sentencia.executeQuery("SELECT * FROM usuarios ");
                        //declaramos objetos para guardar los resultados obtenidos para la tabla
                        Object[] fila = new Object[4];

                        //bucle while para mostrar datos mientras haya algun valor en el ResulSet si no los hay, no lo realizara
                        while (result.next()) {

                            fila[0] = result.getInt("idUsuarios"); //pasamos como parametro el nombre en String de los campos de la base de datos
                            fila[1] = result.getString("Nombre");
                            fila[2] = result.getString("Password");
                            fila[3] = result.getInt("IdRol");

                            jLabel2.setText(result.getMetaData().getTableName(WIDTH));
                            tabla.setName(result.getMetaData().getTableName(WIDTH));
                            modelo.addRow(fila);

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //para referescar la tabla despues de cada llamada al metodo , da problemas ya que desaparecen los demas componentes del panel
//         tabla.updateUI();
//        } 
        return modelo;
    }

    public static void Borrar(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

    }

    public static void Salir() {
//        loginTabla.visibilidad(getFrames()., true);
        System.exit(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - juab tobin
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JPanel jPanel1;
    private JButton jButton1;
    private JButton jButton3;
    private JButton jButton2;
    private JButton jButton4;
    private JButton button1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JTextField jTextField1;
    private JScrollPane jScrollPane2;
    private JList<String> jList1;
    private JLabel label1;
    public static JLabel label2;
    private JLabel label3;
    private BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
