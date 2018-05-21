/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Judith Aldonate
 */
public class ListaLibro {
     private ArrayList <Libro> listaLibro;

    public ListaLibro() {
    }

    public ListaLibro(ArrayList<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }
     

    /**
     * @return the listaLibro
     */
    public ArrayList <Libro> getListaLibro() {
        return listaLibro;
    }

    /**
     * @param listaLibro the listaLibro to set
     */
    public void setListaLibro(ArrayList <Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }
    
}
