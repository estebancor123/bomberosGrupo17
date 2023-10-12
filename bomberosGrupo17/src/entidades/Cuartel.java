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
    private int telefono;
    private String correo;

    public Cuartel() {
    }

    public Cuartel(int codCuartel, String nombCuartel, String direccion, int coorX, int coorY, int telefono, String correo) {
        this.codCuartel = codCuartel;
        this.nombCuartel = nombCuartel;
        this.direccion = direccion;
        this.coorX = coorX;
        this.coorY = coorY;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Cuartel(String nombCuartel, String direccion, int coorX, int coorY, int telefono, String correo) {
        this.nombCuartel = nombCuartel;
        this.direccion = direccion;
        this.coorX = coorX;
        this.coorY = coorY;
        this.telefono = telefono;
        this.correo = correo;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
