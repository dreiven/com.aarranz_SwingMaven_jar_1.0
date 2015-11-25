/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swig;

import java.awt.*;
import java.awt.event.*;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.*;

/**
 *
 * @author PC
 */
public class loginTabla extends javax.swing.JFrame {

    /**
     * Creates new form loginTabla
     */
    private DefaultListModel modeloList = new DefaultListModel();
    ResultSet resultIni = null;

    private void accionSalir(ActionEvent e) {
        salir();
    }

    private void accionLogin(ActionEvent e) {

        try {

            getConex();

            if (comprobacionUsuario(textField1.getText(), passwordField1.getText())) {
                NewJFrame ventana = new NewJFrame();
                ventana.setVisible(true);

            }
        } catch (Exception ex) {
        }

    }

    public loginTabla() {

        initComponents();
        consultaInicial(modeloList, list1);

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
        jPanel1 = new JPanel();
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        button1 = new JButton();
        label1 = new JLabel();
        label4 = new JLabel();
        label3 = new JLabel();
        button2 = new JButton();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        jLabel1 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(0, 153, 204));
        setTitle("LOGUIN");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== jPanel1 ========
        {

            // JFormDesigner evaluation mark
            jPanel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), jPanel1.getBorder())); jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            jPanel1.setLayout(null);
            jPanel1.add(textField1);
            textField1.setBounds(130, 230, 180, 45);
            jPanel1.add(passwordField1);
            passwordField1.setBounds(130, 300, 180, 45);

            //---- button1 ----
            button1.setText("Salir");
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionSalir(e);
                }
            });
            jPanel1.add(button1);
            button1.setBounds(285, 405, 70, 25);

            //---- label1 ----
            label1.setText("Usuario");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 2f));
            jPanel1.add(label1);
            label1.setBounds(10, 240, 75, 25);

            //---- label4 ----
            label4.setIcon(new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\com.aarranz_SwingMaven_jar_1.0\\src\\main\\java\\swig\\img\\pass_txt.png"));
            jPanel1.add(label4);
            label4.setBounds(85, 300, 45, 45);

            //---- label3 ----
            label3.setIcon(new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\com.aarranz_SwingMaven_jar_1.0\\src\\main\\java\\swig\\img\\user_txt.png"));
            jPanel1.add(label3);
            label3.setBounds(85, 230, 45, 45);

            //---- button2 ----
            button2.setText("Acceder");
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionLogin(e);
                }
            });
            jPanel1.add(button2);
            button2.setBounds(190, 405, 75, 25);

            //---- label2 ----
            label2.setText("Password");
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 2f));
            jPanel1.add(label2);
            label2.setBounds(10, 310, 75, 35);

            //======== scrollPane1 ========
            {
                scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                scrollPane1.setBorder(null);

                //---- list1 ----
                list1.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
                scrollPane1.setViewportView(list1);
            }
            jPanel1.add(scrollPane1);
            scrollPane1.setBounds(25, 365, 90, 85);

            //---- jLabel1 ----
            jLabel1.setIcon(new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\com.aarranz_SwingMaven_jar_1.0\\src\\main\\java\\swig\\img\\frame.png"));
            jLabel1.setLabelFor(jPanel1);
            jLabel1.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
            jPanel1.add(jLabel1);
            jLabel1.setBounds(0, 0, 385, 470);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < jPanel1.getComponentCount(); i++) {
                    Rectangle bounds = jPanel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = jPanel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                jPanel1.setMinimumSize(preferredSize);
                jPanel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(jPanel1);
        jPanel1.setBounds(-5, -5, 385, 465);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(loginTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginTabla().setVisible(true);
            }
        });
    }

    public void salir() {
        System.exit(0);

    }

    public static Connection getConex() {
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/control";
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {

        }

        return conexion;
    }

    public static DefaultListModel consultaInicial(DefaultListModel modeloList, JList list) {
        ResultSet result = null;
        Statement sentencia = null;

        try {
            //se crea el objeto Statement para realizar una consulta la bbdd con los datos a traves de la conexion creada anteriormente 
            sentencia = getConex().createStatement();
            //se crea objeto ResulSet para almacenar el valor obtenido por la consulta SQL realizada por el obj Statement
            result = sentencia.executeQuery("SHOW FULL TABLES FROM control");
            while (result.next()) {
                System.out.println(result.getString(WIDTH));

                modeloList.addElement(result.getString(1));

                list.setModel(modeloList);

            }

        } catch (Exception ex) {
            Logger.getLogger(loginTabla.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modeloList;
    }

    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////

    public static Boolean comprobacionPermisos() throws SQLException {

        getConex();
        ResultSet result = null;
        Statement sentencia = null;
        try {

            //se crea el objeto Statement para realizar una consulta la bbdd con los datos a traves de la conexion creada anteriormente 
            sentencia = getConex().createStatement();
            result = sentencia.executeQuery("SELECT * FROM usuarios AND roles");
            while (result.next()) {

                System.out.println(result.getInt("IdRol"));
                return true;
            }

        } catch (Exception e) {
        }
        System.out.println("Permiso denegado a la BBDD selecionada");
        return false;
    }

    public static Boolean comprobacionUsuario(String user, String pass) throws SQLException {

        getConex();
        ResultSet result = null;
        Statement sentencia = null;

        try {
            //se crea el objeto Statement para realizar una consulta la bbdd con los datos a traves de la conexion creada anteriormente 
            sentencia = getConex().createStatement();
            result = sentencia.executeQuery("SELECT * FROM control.usuarios WHERE Nombre = '" + user + "'AND Password ='" + pass + "'");
            while (result.next()) {

                return true;
            }

        } catch (Exception ex) {
            Logger.getLogger(loginTabla.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("No ha introducido datos correctos");
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Albert Av
    private JPanel jPanel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JLabel label1;
    private JLabel label4;
    private JLabel label3;
    private JButton button2;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JList list1;
    private JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
