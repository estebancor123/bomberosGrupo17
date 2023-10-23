/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso.a.datos;

import entidades.Bombero;
import entidades.Brigada;
import entidades.Cuartel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import acceso.a.datos.BrigadaData;
import java.util.ArrayList;
        
/**
 *
 * @author pc2
 */
public class BomberoData {
     private Connection con = null;
     private BrigadaData bd=new BrigadaData();
   
     public BomberoData() {
    con = Conexion.getConexion();
     
    
    }
     
//    INSERT INTO `bombrero`(`id_bombrero`, `nombre_ape`, `fecha_nac`, `codBrigada`, `dni`, `celular`)
    public void guardarBombero(Bombero bombero){
     String sql = "INSERT INTO bombero (nombre,fecha_nac,codBrigada,dni,celular,estado,apellido,grupo_sanguineo)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1,bombero.getNombre());
            ps.setDate(2, Date.valueOf(bombero.getFechaNac()));
            ps.setInt(3, bombero.getCodBrigada().getCodBrigada());
            ps.setInt(4, bombero.getDni());
            ps.setString(5,bombero.getCelular());
            ps.setBoolean(6, bombero.isEstado());
            ps.setString(7,bombero.getApellido());
            ps.setString(8,bombero.getGrupoSanguineo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                bombero.setIdBombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "bombero guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero 02222"+ex);
        }
    
    
}
   public void modificarBombero(Bombero bombero) {
//        UPDATE `bombero` SET `id_bombrero`='[value-1]',`nombre_ape`='[value-2]',`fecha_nac`='[value-3]',`codBrigada`='[value-4]',
//                          `dni`='[value-5]',`celular`='[value-6]' WHERE 1
       
       String sql = "UPDATE bombero SET nombre=?, fecha_nac=?, codBrigada=?,celular=?,estado=?,apellido=?,grupo_sanguineo=? "
                + "WHERE dni = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, bombero.getNombre());
            
            ps.setDate(2, Date.valueOf(bombero.getFechaNac()));
            ps.setInt(3, bombero.getCodBrigada().getCodBrigada());
             ps.setString(4, bombero.getCelular());
             ps.setBoolean(5, bombero.isEstado());
             ps.setString(6, bombero.getApellido());
             ps.setString(7, bombero.getGrupoSanguineo());
              ps.setInt(8, bombero.getDni());
            //ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "bombero Modificado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero 0111"+ex);
        } catch  (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "no sean boludos"); 
        } 
    }  
     public void eliminarBombero(int id) {
        String sql = "UPDATE bombero SET estado = 0 WHERE id_bombrero = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            int exito =ps.executeUpdate();
            if(exito==1){
            
            JOptionPane.showMessageDialog(null, "Bombero eliminado");

        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero");


        }

    }
        public Bombero buscarBombero (int dni){

        String sql = "SELECT nombre, fecha_nac, codBrigada,celular,estado,apellido,grupo_sanguineo FROM bombero WHERE  dni = ? ";
        
        Bombero bombero=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                
                bombero=new Bombero();
               bombero.setDni(dni);
                bombero.setNombre(rs.getString("nombre"));
                bombero.setFechaNac(rs.getDate("fecha_nac").toLocalDate());
              //  bombero.setCodBrigada(rs.getInt("codBrigada"));
              Brigada brigada=bd.buscarBrigada(rs.getInt("codBrigada"));
              bombero.setCodBrigada(brigada);
               
                bombero.setCelular(rs.getString("celular"));
                bombero.setEstado(rs.getBoolean("estado"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setGrupoSanguineo(rs.getString("grupo_sanguineo"));
            } else {
                            
                JOptionPane.showMessageDialog(null, "Bombero no encontrado con ese Documento");
                
            }
                ps.close();   
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero");
        }
    
            return bombero;
} 
   public ArrayList<Bombero> listarBomberos() {

        String sql = "SELECT * FROM bombero WHERE estado = 1";

        ArrayList<Bombero> bomberos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
          
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Bombero bombero = new Bombero();

                bombero.setIdBombero(rs.getInt("id_bombrero"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setCelular(rs.getString("celular"));
                bombero.setFechaNac(rs.getDate("fecha_nac").toLocalDate());

                Brigada brigada = bd.buscarBrigada(rs.getInt("codBrigada"));
                bombero.setCodBrigada(brigada);

                bombero.setEstado(true);
                bombero.setApellido(rs.getString("apellido"));
                bombero.setGrupoSanguineo(rs.getString("grupo_sanguineo"));
                bomberos.add(bombero);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero "+ex);
        }

        
        return bomberos;
    }   
}

// private int idBombero;
//    private int dni; 
//    private String nombreApe;
//    private LocalDate fechaNac;
//    private int celular;
//    private Brigada codBrigada;
//    private boolean estado;