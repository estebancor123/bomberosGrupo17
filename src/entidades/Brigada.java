/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author pc2
 */
public class Brigada {
    private int codBrigada;
    private String nombreBr;
    private String especialidad;
    private boolean libre;
    private Cuartel codCuartel;
    private boolean estado;
   
    public Brigada() {
    }

    public Brigada(int codBrigada, String nombreBr, String especialidad, boolean libre, Cuartel codCuartel,boolean estado) {
        this.codBrigada = codBrigada;
        this.nombreBr = nombreBr;
        this.especialidad = especialidad;
        this.libre = libre;
        this.codCuartel = codCuartel;
        this.estado = estado;
    }

    public Brigada(String nombreBr, String especialidad, boolean libre, Cuartel codCuartel,boolean estado) {
        this.nombreBr = nombreBr;
        this.especialidad = especialidad;
        this.libre = libre;
        this.codCuartel = codCuartel;
        this.estado = estado;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombreBr() {
        return nombreBr;
    }

    public void setNombreBr(String nombreBr) {
        this.nombreBr = nombreBr;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public Cuartel getCodCuartel() {
        return codCuartel;
    }

    public void setCodCuartel(Cuartel codCuartel) {
        this.codCuartel = codCuartel;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Brigada{" + "codBrigada=" + codBrigada + ", nombreBr=" + nombreBr + ", especialidad=" + especialidad + ", libre=" + libre + ", codCuartel=" + codCuartel + ", estado=" + estado + '}';
    }

  

    
    
}
