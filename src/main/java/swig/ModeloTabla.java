/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swig;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author PC
 */
public class ModeloTabla extends DefaultTableModel{
      
    
    
    
    public ModeloTabla(Object [][] objeto, String [] columnas) {
        
    	//Dimensiona la tabla para la presentación inicial
//        this.setColumnIdentifiers(columnas);
    	this.setColumnCount(4);
    	this.setRowCount(4);
    
       
    }
    public ModeloTabla(){
    this.setColumnCount(4);
    	this.setRowCount(4);
    
    }
    
     public static void Salir(){
     System.exit(0);
 }
    
    
    
    
    
}
