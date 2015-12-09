/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swig;

/**
 *
 * @author pabloarqueros
 */
public class Intermedia {

    private String dato;
 private int id;

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
