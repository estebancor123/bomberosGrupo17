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
public class Cuartel {
    private int codCuartel;
    private String nombCuartel;
    private String direccion;
    private int coorX;
    private int coorY;
    private String telefono;
    private String correo;
    private boolean estado;
    public Cuartel() {
    }

    public Cuartel(int codCuartel, String nombCuartel, String direccion, int coorX, int coorY, String telefono, String correo, boolean estado) {
        this.codCuartel = codCuartel;
        this.nombCuartel = nombCuartel;
        this.direccion = direccion;
        this.coorX = coorX;
        this.coorY = coorY;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public Cuartel(String nombCuartel, String direccion, int coorX, int coorY, String telefono, String correo, boolean estado) {
        this.nombCuartel = nombCuartel;
        this.direccion = direccion;
        this.coorX = coorX;
        this.coorY = coorY;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public int getCodCuartel() {
        return codCuartel;
    }

    public void setCodCuartel(int codCuartel) {
        this.codCuartel = codCuartel;
    }

    public String getNombCuartel() {
        return nombCuartel;
    }

    public void setNombCuartel(String nombCuartel) {
        this.nombCuartel = nombCuartel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCoorX() {
        return coorX;
    }

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public int getCoorY() {
        return coorY;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
    
}
