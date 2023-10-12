/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso.a.datos;

import entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pc2
 */
public class CuartelData {
        private Connection con = null;

    public CuartelData() {
        con = Conexion.getConexion();
}

public void guardarCuartel(Cuartel cuartel){
     String sql = "INSERT INTO cuartel (nombre_cuartel, direccion, coord_X,coord_Y,telefono,correo)"
                + "VALUES(?,?,?,?,?,?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1,cuartel.getNombCuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoorX());
            ps.setInt(4, cuartel.getCoorY());
            ps.setInt(5,cuartel.getTelefono());
            ps.setString(6,cuartel.getCorreo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                cuartel.setCodCuartel(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "cuartel guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel");
        }
    
    
}
     public Cuartel buscarCuartel (int id){
//`cuartel`(`cod_Cuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`)
        String sql = "SELECT nombre_cuartel, direccion, coord_X, coord_Y,telefono,correo FROM cuartel WHERE  cod_Cuartel = ?" ;
        
        Cuartel cuartel=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                
                cuartel=new Cuartel();
               cuartel.setCodCuartel(id);
                cuartel.setNombCuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoorX(rs.getInt("coord_X"));
                cuartel.setCoorY(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getInt("telefono"));
               cuartel.setCorreo(rs.getString("correo"));

            } else {
                            
                JOptionPane.showMessageDialog(null, "Cuartel no encontrado con ese ID");
                
            }
                ps.close();   
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel");
        }
    
            return cuartel;
}
}