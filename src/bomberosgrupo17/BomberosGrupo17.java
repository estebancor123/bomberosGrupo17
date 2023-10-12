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
         
 // Cuartel cuartel= new Cuartel("cuartelNumero4","9  de julio 1019",5,9,888888,"correo4");    
  CuartelData cuartelData= new CuartelData();
// cuartelData.guardarCuartel(cuartel);
 // Brigada brigada1=new Brigada("netbean","operativos de prevención",true,cuartel);
 //Brigada santafe=new Brigada("qqqq","masfuego",true,cuartel);
BrigadaData bd =new BrigadaData();
Brigada brigada1= bd.buscarBrigada(1);
//bd.guardarBrigada(santafe);
//('12','pepe','10/10/200','1','8888','789456123','true','argento','a+')
Bombero bom1 = new Bombero(12,"Cordoba",LocalDate.of(1980, 04, 25),brigada1,7777,5555,true,"Martinez","a+");
  BomberoData databom=new BomberoData();
  databom.guardarBombero(bom1);
  // databom.modificarBombero(bom);
  //databom.eliminarBombero(5);
//        Bombero bomberoEncontrado= databom.buscarBombero(5);
//         
//      System.out.println("nombre_ape"+bomberoEncontrado.getNombreApe());
//      System.out.println(bomberoEncontrado.toString());
//       
//Siniestro siniestro2=new Siniestro(") incendios", LocalDate.of(2023,10,04), 2, 3, "incedio de casa 2 pisos", LocalDate.of(2023,10,5), 8, brigada1);
//    SiniestroData siniestrodata = new SiniestroData();
//    siniestrodata.guardarSiniestro(siniestro2);

 
//      ArrayList<Brigada> list= bd.listarBrigadas();
//           for (Brigada brigada : list) {
//          System.out.println(brigada.toString());
//           } 
      
//          ArrayList<Bombero> list= databom.listarBomberos();
//           for (Bombero bombero : list) {
//          System.out.println(bombero.toString());
//           } 
//            Brigada list= bd.buscarBrigadaPorEspecialidad("fuego");
//           
//          System.out.println(list.getNombreBr()+" "+list.getEspecialidad()+" "+list.isLibre());
//            
      

         }
         
    
}
