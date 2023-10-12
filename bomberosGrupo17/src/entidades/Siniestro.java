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
public class Siniestro {
    private int codigo;
    private String tipo;
    private LocalDate fechaSiniestro;
    private int coord_X;
    private int coord_Y;
    private String detalles;
    private LocalDate fechaResolucion;
    private int puntuacion;
    private Brigada codBrigada;

    public Siniestro() {
    }

    public Siniestro(int codigo, String tipo, LocalDate fechaSiniestro, int coordX, int coorY, String detalles, LocalDate fechaResolucion, int puntuacion, Brigada codBrigada) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
    }

    public Siniestro(String tipo, LocalDate fechaSiniestro, int coordX, int coorY, String detalles, LocalDate fechaResolucion, int puntuacion, Brigada codBrigada) {
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(LocalDate fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public int getCoord_X() {
        return coord_X;
    }

    public void setCoord_X(int coord_X) {
        this.coord_X = coord_X;
    }

    public int getCoord_Y() {
        return coord_Y;
    }

    public void setCoord_Y(int coord_Y) {
        this.coord_Y = coord_Y;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Brigada getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(Brigada codBrigada) {
        this.codBrigada = codBrigada;
    }

    @Override
    public String toString() {
        return "Siniestro{" + "codigo=" + codigo + ", tipo=" + tipo + ", fechaSiniestro=" + fechaSiniestro + ", coord_X=" + coord_X + ", coord_Y=" + coord_Y + ", detalles=" + detalles + ", fechaResolucion=" + fechaResolucion + ", puntuacion=" + puntuacion + ", codBrigada=" + codBrigada + '}';
    }

   
    
}
