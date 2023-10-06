/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosgrupo17;

import acceso.a.datos.BomberoData;
import acceso.a.datos.BrigadaData;
import acceso.a.datos.Conexion;
import acceso.a.datos.CuartelData;
import acceso.a.datos.SiniestroData;
import entidades.Bombero;
import entidades.Brigada;
import entidades.Cuartel;
import entidades.Siniestro;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author pc2
 */
public class BomberosGrupo17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Connection con=Conexion.getConexion();
//  private int codBrigada;
//    private String nombreBr;
//    private String especialidad;
//    private boolean libre;
//    private Cuartel codCuartel;

//    Alumno cornejo=ad.buscarAlumno(1);
//    Materia mate=md.buscarMateria(4);
//    Inscripcion insc=new Inscripcion(cornejo, mate, 7);
         
  Cuartel cuartel= new Cuartel("cuartelNumero3","San martin 6666",3,4,7777777,"correo3");    
  CuartelData cuartelData= new CuartelData();
 //cuartelData.guardarCuartel(cuartel);
  Brigada cola=new Brigada("uuuu","mofuego",true,cuartel);
 //Brigada santafe=new Brigada("qqqq","masfuego",true,cuartel);
BrigadaData bd =new BrigadaData();
//bd.guardarBrigada(cola);
//bd.guardarBrigada(santafe);
Bombero bom = new Bombero(2,"Esteban Cornejo",LocalDate.of(1980,04,20),12454,cola,true);
  BomberoData databom=new BomberoData();
  //databom.guardarBombero(bom);
  // databom.modificarBombero(bom);
  //databom.eliminarBombero(5);
//        Bombero bomberoEncontrado= databom.buscarBombero(5);
//         
//      System.out.println("nombre_ape"+bomberoEncontrado.getNombreApe());
//      System.out.println(bomberoEncontrado.toString());
//       
//Siniestro siniestro1=new Siniestro(") incendios en viviendas", LocalDate.of(1980,04,20), 2, 3, "se que el rancho", LocalDate.of(2023,10,5), 8, santafe);
    SiniestroData siniestrodata = new SiniestroData();
//    siniestrodata.guardarSiniestro(siniestro1);

 
//      ArrayList<Brigada> list= bd.listarBrigadas();
//           for (Brigada brigada : list) {
//          System.out.println(brigada.toString());
//           } 
      
          ArrayList<Bombero> list= databom.listarBomberos();
           for (Bombero bombero : list) {
          System.out.println(bombero.toString());
           } 
//            Brigada list= bd.buscarBrigadaPorEspecialidad("fuego");
//           
//          System.out.println(list.getNombreBr()+" "+list.getEspecialidad()+" "+list.isLibre());
//            
      

         }
         
    
}
