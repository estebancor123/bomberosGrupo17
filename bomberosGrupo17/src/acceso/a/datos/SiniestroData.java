/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso.a.datos;
import entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SiniestroData {
    private Connection con = null;

    public SiniestroData() {
        con = Conexion.getConexion();
}

public void guardarSiniestro (Siniestro siniestro){
   String sql = "INSERT INTO siniestro(tipo, fecha_siniestro, coord_X, coord_Y, detalle, fecha_resol, puntuacion, codBrigada) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
       
   try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString (1,siniestro.getTipo());
            ps.setDate(2,Date.valueOf(siniestro.getFechaSiniestro()));
            ps.setInt(3,siniestro.getCoord_X());
            ps.setInt(4,siniestro.getCoord_Y());
            ps.setString(5,siniestro.getDetalles());
            ps.setDate(6,Date.valueOf(siniestro.getFechaResolucion()));
            ps.setInt(7,siniestro.getPuntuacion());
            ps.setInt(8,siniestro.getCodBrigada().getCodBrigada());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                siniestro.setCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "SINIESTRO GUARDADO");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla SINIESTROS");
        }
    
    
}
public ArrayList <Siniestro> ListarSiniestrosEntreFechas (){
   
    ArrayList<Siniestro> siniestro = new ArrayList<>();
    
    String sql = "SELECT * FROM `siniestro` WHERE fecha_siniestro BETWEEN CURRENT_DATE -1 AND CURRENT_DATE";
           
        try {
            PreparedStatement ps = con.prepareStatement(sql);
          
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Siniestro sini = new Siniestro ();
            
                sini.setCodigo(rs.getInt("codigo"));
                sini.setTipo(rs.getString("tipo"));
                sini.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
                sini.setCoord_X(rs.getInt("coord_X"));
                sini.setCoord_Y(rs.getInt("coord_Y"));
                sini.setDetalles(rs.getString("detalle"));
                
                siniestro.add(sini);
                
            JOptionPane.showMessageDialog(null, "");
            
            }
            
            ps.close();

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla SINIESTRO");
        
        }
      return siniestro;

}
}
///* public ArrayList <Siniestro> ListarSiniestrosEntreFechas (){
//   
//    ArrayList<Siniestro> siniestro = new ArrayList<>();
//    
//    String sql = "SELECT * FROM `siniestro` WHERE fecha_siniestro BETWEEN CURRENT_DATE -1 AND CURRENT_DATE";
//           
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//          
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//
//                Siniestro sini = new Siniestro ();
//            
//                sini.setCodigo(rs.getInt("codigo"));
//                sini.setTipo(rs.getString("tipo"));
//                sini.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
//                sini.setCoord_X(rs.getInt("coord_X"));
//                sini.setCoord_Y(rs.getInt("coord_Y"));
//                sini.setDetalles(rs.getString("detalle"));
//                
//                siniestro.add(sini);
//                
//            JOptionPane.showMessageDialog(null, "");
//            
//            }
//            
//            ps.close();
//
//        } catch (SQLException ex) {
//            
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla SINIESTRO");
//        
//        }
//      return siniestro;
//}
