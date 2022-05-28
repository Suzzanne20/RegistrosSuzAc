/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrosuz;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**@author Suzzanne Acevedo Morales
*/

public class RegistroSuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatrizSuz matri=new MatrizSuz();
        ListaSuz list=new ListaSuz();
        int opc = 0;
        String menu = JOptionPane.showInputDialog("                    --- MENU ---   \nIngrese el # de opcion\n \n1: Matrices\n2: Listas");
        opc=Integer.parseInt(menu);

      switch (opc){
        case 1:
        JOptionPane.showMessageDialog(null,"Iniciando Registro por Matriz");
        System.out.println("_____ REGISTRO ESTUDIANTIL _____");
        matri.tabAlu();
        matri.tabCur();
        matri.tabGr();

        System.out.println("\n__________________________________");
        System.out.println("         DATOS REGISTRADOS     ");
        System.out.println("__________________________________");
        System.out.println("---ALUMNOS---");
        matri.mostrarHistorial();
        System.out.println("---CURSOS---");
        matri.mostrarHisto2();
        System.out.println("---GRADO---");
        matri.mostrarHisto3();
        JOptionPane.showMessageDialog(null,"Proceso Finalizado :)");
        break;
        case 2:
        JOptionPane.showMessageDialog(null,"Iniciando Registro por Lista");
        System.out.println("_____ REGISTRO ESTUDIANTIL _____");
        list.tabAlu();
        JOptionPane.showMessageDialog(null,"Proceso Finalizado :)");
        break;

    }


       
    }
    
}
