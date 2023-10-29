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
    private BrigadaData bd = new BrigadaData();

    public SiniestroData() {
        con = Conexion.getConexion();
    }

public void guardarSiniestro (Siniestro siniestro){
   String sql = "INSERT INTO siniestro(tipo, fecha_siniestro, coord_X, coord_Y, detalle, fecha_resol, puntuacion, codBrigada,estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
       
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
            ps.setBoolean(9, true);
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
   public void guardarSinResolver(Siniestro siniestro){

    String sql="INSERT INTO siniestro (tipo,fecha_siniestro,coord_X, coord_Y, detalle,codBrigada,estado)"
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,siniestro.getTipo());
            ps.setDate(2,Date.valueOf(siniestro.getFechaSiniestro()));
            ps.setInt(3,siniestro.getCoord_X());
            ps.setInt(4,siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
//            ps.setDate(6,Date.valueOf(siniestro.getFechaResol()));
//            ps.setInt(7,siniestro.getPuntuacion());
            ps.setInt(6,siniestro.getCodBrigada().getCodBrigada());
            ps.setBoolean(7, true);
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                
                siniestro.setCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Siniestro agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al agregar Siniestro"+ex);
        }
        
    }
         public void modificarSinResolver(Siniestro siniestro){
//         UPDATE `siniestro` SET `Codigo`='[value-1]',`tipo`='[value-2]',`FechaSiniestro`='[value-3]',`CoordX`='[value-4]',`CoordY`='[value-5]',`Detalles`='[value-6]',`FechaResol`='[value-7]',`Puntuacion`='[value-8]',`CodBrigada`='[value-9]' WHERE 1
         
    String sql="UPDATE siniestro SET tipo=?,fecha_siniestro=?, coord_X=?, coord_Y=?,detalle=?,codBrigada=? WHERE codigo=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, siniestro.getTipo());
            ps.setDate(2,Date.valueOf(siniestro.getFechaSiniestro()));
            ps.setInt(3,siniestro.getCoord_X());
            ps.setInt(4,siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            ps.setInt(6,siniestro.getCodBrigada().getCodBrigada());
            ps.setInt(7,siniestro.getCodigo());
            int e= ps.executeUpdate();
            
            if (e==1) {
                JOptionPane.showMessageDialog(null,"Siniestro modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al modificar Siniestro"+ex);
        }
    }
public ArrayList <Siniestro> ListarSiniestrosEntreFechas (){
   
    ArrayList<Siniestro> siniestro = new ArrayList<>();
    
    String sql = "SELECT * FROM `siniestro` WHERE fecha_siniestro BETWEEN CURRENT_DATE -1 AND CURRENT_DATE AND estado=1";
           
        try {
            PreparedStatement ps = con.prepareStatement(sql);
          
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Siniestro sini = new Siniestro ();
            
                sini.setCodigo(rs.getInt("codigo"));
                sini.setTipo(rs.getString("tipo"));
                sini.setFechaSiniestro(rs.getDate("fecha_siniestro").toLocalDate());
                sini.setCoord_X(rs.getInt("coord_X"));
                sini.setCoord_Y(rs.getInt("coord_Y"));
                sini.setDetalles(rs.getString("detalle"));
                
                siniestro.add(sini);
                
            
            
            }
            
            ps.close();

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla SINIESTRO");
        
        }
      return siniestro;

}
    public ArrayList<Siniestro> obtenerSiniestro (){

    ArrayList<Siniestro> siniestros= new ArrayList();
    String sql="SELECT * FROM siniestro WHERE estado =1";

        try {
            PreparedStatement ps=con.prepareStatement(sql);
           ResultSet rs= ps.executeQuery();
            while (rs.next()) {
               Siniestro sinie= new Siniestro();
               sinie.setCodigo(rs.getInt("codigo"));
               sinie.setTipo(rs.getString("tipo"));
               
               sinie.setFechaSiniestro(rs.getDate("fecha_siniestro").toLocalDate());
               sinie.setCoord_X(rs.getInt("coord_X"));
               sinie.setCoord_Y(rs.getInt("coord_Y"));
               sinie.setDetalles(rs.getString("detalle"));
               sinie.setFechaResolucion(rs.getDate("fecha_resol").toLocalDate());
               
               sinie.setPuntuacion(rs.getInt("puntuacion"));
               Brigada bri =bd.buscarBrigada(rs.getInt("codBrigada"));
               
               sinie.setCodBrigada(bri);
               
               
               siniestros.add(sinie);
            }
            ps.close();

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
       return siniestros;
}
        public Siniestro buscarSiniestro(int codigo) {
//`Codigo``tipo``FechaSiniestro``CoordX``CoordY``Detalles``FechaResol``Puntuacion``CodBrigada`
        String sql = "SELECT codigo, tipo, fecha_siniestro, coord_X, coord_Y, detalle, fecha_resol, puntuacion, codBrigada FROM siniestro WHERE codigo = ? AND estado=1 ";

        Siniestro siniestro = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                siniestro = new Siniestro();

                siniestro.setCodigo(rs.getInt("codigo"));
                siniestro.setTipo(rs.getString("tipo"));
                siniestro.setFechaSiniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setCoord_X(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("Coord_Y"));
                siniestro.setDetalles(rs.getString("detalle"));
                if (rs.getDate("fecha_resol")!=null) {
                    siniestro.setFechaResolucion(rs.getDate("fecha_resol").toLocalDate());
                    siniestro.setPuntuacion(rs.getInt("puntuacion"));
                }
                
                Brigada brigada = bd.buscarBrigada(rs.getInt("codBrigada"));
                siniestro.setCodBrigada(brigada);
                

            } else {

                JOptionPane.showMessageDialog(null, "SINIESTRO no encontrado con ese CODIGO");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla SINIESTRO");
        }
        return siniestro;
    }
       public ArrayList<Siniestro> cargarSiniestro (){

    ArrayList<Siniestro> siniestros= new ArrayList();
    String sql="SELECT * FROM siniestro WHERE estado =1";

        try {
            PreparedStatement ps=con.prepareStatement(sql);
           ResultSet rs= ps.executeQuery();
            while (rs.next()) {
               Siniestro sinie= new Siniestro();
               sinie.setCodigo(rs.getInt("codigo"));
               sinie.setTipo(rs.getString("tipo"));
               
               sinie.setDetalles(rs.getString("detalle"));
               
               
              
               
               
               siniestros.add(sinie);
            }
            ps.close();

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
       return siniestros;
}
         public void modificarSiniestro(Siniestro siniestro){
//        
  //`codigo``tipo``fecha_siniestro``coord_X``coord_Y``detalle``fecha_resol``puntuacion``codBrigada`       
    String sql="UPDATE siniestro SET tipo=?,fecha_siniestro=?, coord_X=?, coord_Y=?,detalle=?,fecha_resol=?,puntuacion=?,codBrigada=? WHERE codigo=? AND estado =1";
        try {
            
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, siniestro.getTipo());
            ps.setDate(2,Date.valueOf(siniestro.getFechaSiniestro()));
            ps.setInt(3,siniestro.getCoord_X());
            ps.setInt(4,siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            ps.setDate(6, Date.valueOf(siniestro.getFechaResolucion()));
            ps.setInt(7, siniestro.getPuntuacion());
            ps.setInt(8,siniestro.getCodBrigada().getCodBrigada());
            ps.setInt(9, siniestro.getCodigo());
            int e= ps.executeUpdate();
            
            if (e==1) {
                JOptionPane.showMessageDialog(null,"siniestro modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al modificar siniestro"+ex);
        }
    }
public void totalEntreAyerYHoy(){
    SiniestroData sd=new SiniestroData();
    int d= sd.ListarSiniestrosEntreFechas().size();
    
}
  public ArrayList<String> cantidadDeSiniestros (){

    ArrayList<String> siniestros= new ArrayList();
    String sql="SELECT * FROM siniestro WHERE estado =1";

        try {
            PreparedStatement ps=con.prepareStatement(sql);
           ResultSet rs= ps.executeQuery();
            while (rs.next()) {
               Siniestro sinie= new Siniestro();
               sinie.setCodigo(rs.getInt("codigo"));
               String siniest=sinie.getCodigo()+"";
               
               
               
               
               siniestros.add(siniest);
            }
            ps.close();

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro");
        }
       return siniestros;
}
        public void eliminarSiniestro (int id) {
        String sql = "UPDATE siniestro  SET estado = 0 WHERE codigo = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            int exito =ps.executeUpdate();
            if(exito==1){
            
            JOptionPane.showMessageDialog(null, "siniestro eliminado");

        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro");
        }
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
