/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Judith Aldonate
 */
@ManagedBean
@ViewScoped
public class PalabraFormBean {
    private ArrayList <String> listaPalabra;
    private String palabra;

    /**
     * Creates a new instance of PalabraFormBean
     */
    public PalabraFormBean() {
         listaPalabra = new ArrayList();
    }
    public void guardarPalabra(){
        getListaPalabra().add(getPalabra());
    }
    
    public void borrarLista(){
        listaPalabra = new ArrayList();
    }

    /**
     * @return the listaPalabra
     */
    public ArrayList <String> getListaPalabra() {
        return listaPalabra;
    }

    /**
     * @param listaPalabra the listaPalabra to set
     */
    public void setListaPalabra(ArrayList <String> listaPalabra) {
        this.listaPalabra = listaPalabra;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    
    
}
