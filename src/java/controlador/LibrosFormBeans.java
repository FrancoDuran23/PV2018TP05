/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Libro;
import modelo.ListaLibro;

/**
 *
 * @author Judith Aldonate
 */
@ManagedBean
@ViewScoped
public class LibrosFormBeans {
    private String isbn;
    private String titulo;
    private String autor;
    private double precio;
    private ListaLibro listadoLibro;
    private ListaLibro listadoLibroAux;
    private String auxTitulo;

    public LibrosFormBeans() {
        listadoLibro = new ListaLibro();
        listadoLibroAux = new ListaLibro();
      
    }
    public void guardarLibro() {
        getListadoLibro().getListaLibro().add(new Libro(getIsbn(), getTitulo(), getAutor(), getPrecio()));
    }
    
    public void buscarLibro() {
        for (int i = 0; i < getListadoLibro().getListaLibro().size(); i++) {
            if (getListadoLibro().getListaLibro().get(i).getTitulo().equals(getAuxTitulo())) {
                getListadoLibroAux().getListaLibro().add(getListadoLibro().getListaLibro().get(i));
            }
        }
    }
    
    public void reinciar() {
        setListadoLibro(new ListaLibro());
        setListadoLibroAux(new ListaLibro());
    }
    

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the listadoLibro
     */
    public ListaLibro getListadoLibro() {
        return listadoLibro;
    }

    /**
     * @param listadoLibro the listadoLibro to set
     */
    public void setListadoLibro(ListaLibro listadoLibro) {
        this.listadoLibro = listadoLibro;
    }

    /**
     * @return the listadoLibroAux
     */
    public ListaLibro getListadoLibroAux() {
        return listadoLibroAux;
    }

    /**
     * @param listadoLibroAux the listadoLibroAux to set
     */
    public void setListadoLibroAux(ListaLibro listadoLibroAux) {
        this.listadoLibroAux = listadoLibroAux;
    }

    /**
     * @return the auxTitulo
     */
    public String getAuxTitulo() {
        return auxTitulo;
    }

    /**
     * @param auxTitulo the auxTitulo to set
     */
    public void setAuxTitulo(String auxTitulo) {
        this.auxTitulo = auxTitulo;
    }
    


}
  