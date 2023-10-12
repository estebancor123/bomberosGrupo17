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
    private String nombre;
    private LocalDate fechaNac;
    private Brigada codBrigada;
    private int dni; 
    private int celular;
    private boolean estado;
    private String apellido;
    private String grupoSanguineo;

    public Bombero() {
    }

    public Bombero(int idBombero, String nombre, LocalDate fechaNac, Brigada codBrigada, int dni, int celular, boolean estado, String apellido, String grupoSanguineo) {
        this.idBombero = idBombero;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.codBrigada = codBrigada;
        this.dni = dni;
        this.celular = celular;
        this.estado = estado;
        this.apellido = apellido;
        this.grupoSanguineo = grupoSanguineo;
    }

    public Bombero(String nombre, LocalDate fechaNac, Brigada codBrigada, int dni, int celular, boolean estado, String apellido, String grupoSanguineo) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.codBrigada = codBrigada;
        this.dni = dni;
        this.celular = celular;
        this.estado = estado;
        this.apellido = apellido;
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getIdBombero() {
        return idBombero;
    }

    public void setIdBombero(int idBombero) {
        this.idBombero = idBombero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Brigada getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(Brigada codBrigada) {
        this.codBrigada = codBrigada;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String toString() {
        return "Bombero{" + "idBombero=" + idBombero + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", codBrigada=" + codBrigada + ", dni=" + dni + ", celular=" + celular + ", estado=" + estado + ", apellido=" + apellido + ", grupoSanguineo=" + grupoSanguineo + '}';
    }
    
    
    
    
    

    
}
