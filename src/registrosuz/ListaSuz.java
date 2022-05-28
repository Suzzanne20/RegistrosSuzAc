/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrosuz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Suzzanne Acevedo
 */
public class ListaSuz extends MatrizSuz{

int listreg[];
    
public void tabAlu (){
    System.out.println("Cuantos Alumnos deseas registrar?"); cnt=num.nextInt(); num.nextLine();//buffer
    System.out.println("-----Ingresar datos separados por espacios-----\n    CODIGO "+" NOMBRE "+" ALIAS "+" CORREO "+" TELEFONO");

    List<String>alum;
    alum=new ArrayList<>(cnt);
    for(int i=0;i<cnt;i++){System.out.print("> #"+(i+1)+":  "); alum.add(num.nextLine());}

    //CURSOS..........

    for (int b = 0; b < 50; ++b){System.out.println();} 
    System.out.println("Cuantos Cursos deseas registrar?"); cnt=num.nextInt(); num.nextLine();//buffer
    System.out.println("-----Ingresar datos separados por espacios-----\n    CODIGO "+" CURSO ");

    List<String>cur;
    cur=new ArrayList<>(cnt);
    for(int i=0;i<cnt;i++){System.out.print("> #"+(i+1)+":  "); cur.add(num.nextLine());}
    
    //GRADO..........

    for (int b = 0; b < 50; ++b){System.out.println();} 
    System.out.println("-----Ingresar datos del Grado-----\n    CODIGO "+" DESCRIPCION "); 

    List<String>gra;
    gra=new ArrayList<>(cnt);
    System.out.print("> CODIGO:"); gra.add(num.nextLine());
    System.out.print("> DESCRIPCION:"); gra.add(num.nextLine());
    for (int b = 0; b < 50; ++b){System.out.println();} 

    //MOSTRAR LISTAS ORDENADAS ........

        System.out.println("\n__________________________________");
        System.out.println("         DATOS REGISTRADOS     ");
        System.out.println("__________________________________");
        System.out.println("---ALUMNOS---"); for (int i = 0; i <= cnt - 1; i++) {System.out.println(alum.get(i));}
        System.out.println("---CURSOS---"); for (int i = 0; i <= cnt - 1; i++) {System.out.println(cur.get(i));}
        System.out.println("---GRADO---"); System.out.println(gra);
}


}
