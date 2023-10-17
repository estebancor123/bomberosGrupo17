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
import javax.swing.JOptionPane;
import acceso.a.datos.CuartelData;
import java.util.ArrayList;
/**
 *
 * @author pc2
 */
public class BrigadaData {
 private Connection con = null;
 private CuartelData cuartelData=new CuartelData();
  private CuartelData cd=new CuartelData();


    public BrigadaData() {
    con = Conexion.getConexion();
    }

    public void guardarBrigada(Brigada brigada){
   // INSERT INTO `brigada`(`codBrigada`, `nombre_br`, `especialidad`, `libre`, `nro_cuartel`)

    String sql = "INSERT INTO brigada (nombre_br, especialidad, libre,nro_cuartel)"
                + "VALUES(?,?,?,?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1,brigada.getNombreBr());
            ps.setString(2,brigada.getEspecialidad());
            ps.setBoolean(3,brigada.isLibre());
            ps.setInt(4, brigada.getCodCuartel().getCodCuartel());
            
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "brigada guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada");
        }
    
    
}
  
public Brigada buscarBrigada (int id){
//`brigada`(`codBrigada`, `nombre_br`, `especialidad`, `libre`, `nro_cuartel`) 
        String sql = "SELECT nombre_br, especialidad, libre, nro_cuartel,estado FROM brigada WHERE  codBrigada = ? AND estado = 1  " ;
        
        Brigada brigada=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                
                brigada=new Brigada();
               brigada.setCodBrigada(id);
                brigada.setNombreBr(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
               Cuartel cuartel=cd.buscarCuartel(rs.getInt("nro_cuartel"));
               brigada.setEstado(true);
               brigada.setCodCuartel(cuartel);

            } else {
                            
                JOptionPane.showMessageDialog(null, "Brigada no encontrado con ese ID");
                
            }
                ps.close();   
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada");
        }
    
            return brigada;
}
    
     public void modificarBrigada(Brigada brigada) {
        String sql = "UPDATE brigada SET nombre_br = ?, especialidad = ?, libre = ?, nro_cuartel = ? WHERE codBrigada = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, brigada.getNombreBr());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCodCuartel().getCodCuartel());
            ps.setInt(5, brigada.getCodBrigada());
            //ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Brigada Modificada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada");
        }
    }
     
      public void eliminarBrigada(int id) {
        String sql = "UPDATE brigada SET estado = 0 WHERE codBrigada = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            int exito =ps.executeUpdate();
            if(exito==1){
            
            JOptionPane.showMessageDialog(null, "Brigada eliminada");

        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada");
        }
    }
     
       public Brigada buscarBrigadaPorEspecialidad (String especialidad){

        String sql = "SELECT codBrigada, nombre_br, especialidad, libre, nro_cuartel FROM brigada WHERE especialidad = ? AND estado = 1";

        Brigada brigada=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, especialidad);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){

                brigada=new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombreBr(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
                Cuartel cuartel=cd.buscarCuartel(rs.getInt("nro_cuartel"));
                brigada.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "Bombero no encontrado con esa Especialidad");

            }
                ps.close();   

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada");
        }
            return brigada;
    } 
      
      public ArrayList<Brigada> listarBrigadas() {

        String sql = "SELECT * FROM brigada WHERE estado = 1";

        ArrayList<Brigada> brigadas = new ArrayList();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
          
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombreBr(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
                Cuartel cuartel=cd.buscarCuartel(rs.getInt("nro_cuartel"));
                brigada.setCodCuartel(cuartel);
                brigada.setEstado(true);

                brigadas.add(brigada);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada");
        }

        return brigadas;
    }
      public ArrayList<Brigada> buscarBrigadaPorCuartel (int id){
//SELECT `NombreBr``Especialidad``Libre``NroCuartel` FROM `brigada` WHERE `CodBrigada`

//    SELECT `codBrigada`, `nombre_br`, `especialidad`, `libre`, `nro_cuartel`, `estado` FROM `brigada` WHERE 1
        String sql = "SELECT codBrigada, nombre_br, especialidad, libre, nro_cuartel FROM brigada WHERE  nro_cuartel = ?" ;
        
        
        ArrayList<Brigada> brig = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                Brigada brigada=new Brigada();
               
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombreBr(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
               Cuartel cuartel=cuartelData.buscarCuartel(rs.getInt("nro_cuartel"));
               brigada.setCodCuartel(cuartel);
               brig.add(brigada);

            }
                ps.close();   
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada");
        }
    
            return brig;

}
}