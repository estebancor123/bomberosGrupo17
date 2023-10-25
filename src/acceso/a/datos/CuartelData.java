/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso.a.datos;

import entidades.Brigada;
import entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
            ps.setString(5,cuartel.getTelefono());
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
        String sql = "SELECT nombre_cuartel, direccion, coord_X, coord_Y,telefono,correo,estado FROM cuartel WHERE  cod_Cuartel = ?" ;
        
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
                cuartel.setTelefono(rs.getString("telefono"));
               cuartel.setCorreo(rs.getString("correo"));
               cuartel.setEstado(rs.getBoolean("estado"));
            } else {
                            
                JOptionPane.showMessageDialog(null, "Cuartel no encontrado con ese ID");
                
            }
                ps.close();   
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel");
        }
    
            return cuartel;
}
public ArrayList<Cuartel> listarcuartel() {

        String sql = "SELECT * FROM cuartel WHERE estado = 1";

        ArrayList<Cuartel> Cuarteles = new ArrayList();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {

                Cuartel cuartel = new Cuartel();
                cuartel.setCodCuartel(rs.getInt("cod_Cuartel"));
                cuartel.setNombCuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoorX(rs.getInt("coord_X"));
                cuartel.setCoorY(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
                cuartel.setEstado(true);
               
                
                
                Cuarteles.add(cuartel);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuarteles"+ex);
        }

        return Cuarteles;
    }
    
    public void modificarCuartel(Cuartel cuartel){
//    `cod_Cuartel``nombre_cuartel``direccion``coord_X``coord_Y``telefono``correo``estado`
        String sql="UPDATE cuartel SET nombre_cuartel=?, direccion=?, coord_X=?, coord_Y=?,telefono=?,correo=?,estado=? WHERE cod_Cuartel=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, cuartel.getNombCuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3,cuartel.getCoorX());
            ps.setInt(4,cuartel.getCoorY());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.setBoolean(7, cuartel.isEstado());
            ps.setInt(8,cuartel.getCodCuartel());
            int e= ps.executeUpdate();
            
            if (e==1) {
                JOptionPane.showMessageDialog(null,"Cuartel modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al modificar Cuartel"+ex);
        }
    
    
    }
    public void eliminarCuartel(int id) {

        BrigadaData cargar = new BrigadaData();

        ArrayList<Brigada> brig= cargar.buscarBrigadaPorCuartel(id);
        if (brig == null || brig.size() == 0) {
            String sql = "UPDATE cuartel SET estado = 0 WHERE cod_Cuartel = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            int exito =ps.executeUpdate();
            if(exito==1){
            
            JOptionPane.showMessageDialog(null, "cuartel eliminado");

        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel");


        }
        }else{
        JOptionPane.showMessageDialog(null, "Cuartel no se puede eliminar porque tiene brigadas asignadas");
        }
        
        

    }
}        