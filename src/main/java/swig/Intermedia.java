/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swig;

/**
 *
 * @author Alberto Arranz Villaplana
 */
//se crea clase intermedia para pasar los datos entre formularios 
public class Intermedia {
    //se declara variable de clase dato  en String para transportar datos en caracteres
    private String dato;
    //se declara variable de clase id  en int para transportar datos umericos 
    private int id;
    //constructor de clase que acepta 2 parametro un String y un int
    public Intermedia(String dato, int id) {
        this.dato = dato;
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   //constructor de clase vacio 
    public Intermedia() {
    }

    public Intermedia(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

}
