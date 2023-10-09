/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author pc2
 */
public class Bombero {
    private int idBombero;
    private int dni; 
    private String nombreApe;
    private LocalDate fechaNac;
    private int celular;
    private Brigada codBrigada;
    private boolean estado;
    
    public Bombero() {
    }

    public Bombero(int idBombero, int dni, String nombreApe, LocalDate fechaNac, int celular, Brigada codBrigada,boolean estado) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.nombreApe = nombreApe;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }

    public Bombero(int dni, String nombreApe, LocalDate fechaNac, int celular, Brigada codBrigada,boolean estado) {
        this.dni = dni;
        this.nombreApe = nombreApe;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }

  

    public int getIdBombero() {
        return idBombero;
    }

    public void setIdBombero(int idBombero) {
        this.idBombero = idBombero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApe() {
        return nombreApe;
    }

    public void setNombreApe(String nombreApe) {
        this.nombreApe = nombreApe;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public Brigada getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(Brigada codBrigada) {
        this.codBrigada = codBrigada;
    }
      public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  " dni= " + dni + " nombreApe=" + nombreApe + ", fechaNac=" + fechaNac + ", celular=" + celular + ", codBrigada=" + codBrigada + ", estado=" + estado ;
    }

   
    
    
    
}
