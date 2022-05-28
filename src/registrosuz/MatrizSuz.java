/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrosuz;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Suzzanne Acevedo
 */
public class MatrizSuz  {
protected String name,cod,ali,email,tel;
private String[] vector; private String[] vectorb; private String[] vectorc;
protected int contador, conta2, conta3,cnt;

MatrizSuz(){
    vector=new String[10];
    vectorb=new String[10];
    vectorc=new String[10];
    this.contador=0;
    this.conta2=0;
    this.conta3=0;
}

Scanner num=new Scanner(System.in);
Scanner num1=new Scanner(System.in);
//Reg Alumnos................
public void tabAlu (){
    System.out.println("Cuantos Alumnos deseas registrar?");
    cnt=num.nextInt();
    num.nextLine();//buffer
    for (int b = 0; b < 50; ++b){System.out.println();} 
    System.out.println("------Ingresar datos del Alumno------");
    for(int i=0;i<cnt;i++){
        System.out.print("\nREGISTRO #"+(i+1)+"\n"+"\n>> Codigo: "); cod = num.nextLine();
        System.out.print(">> Nombre: "); name = num.nextLine();
        System.out.print(">> Alias: "); ali = num.nextLine();
        System.out.print(">> Correo: "); email = num.nextLine();
        System.out.print(">> Telefono: "); tel = num.nextLine();
        System.out.print("_______________________________________");
        this.historial(cod, name, ali, email, tel);}
    for (int b = 0; b < 50; ++b){System.out.println();} 
}
//Reg Cursos.................
public void tabCur (){
    System.out.println("Cuantos Cursos deseas registrar?");
    cnt=num1.nextInt();
    System.out.println("------Ingresar datos del Curso------");
    for(int i=0;i<cnt;i++){
        System.out.print("\nREGISTRO #"+(i+1)+"\n"+"\n>> Codigo: ");
        cod = num.nextLine();
        System.out.print(">> Nombre: ");
        name = num.nextLine();
        System.out.print("_______________________________________");
        this.histo2(cod, name);}
    for (int b = 0; b < 50; ++b){System.out.println();}  
}
//Reg Grado.................
public void tabGr (){
    System.out.println("------Ingresar datos del Grado------");
    System.out.print(">> Codigo: ");
    cod = num.nextLine();
    System.out.print(">> Descripcion: ");
    name = num.nextLine();
    this.histo3(cod, name); 
    for (int b = 0; b < 50; ++b){System.out.println();}    
}
//Reg Vector 1//................
protected void historial(String n1,String n2,String n3, String n4,String n5){
contador=contador+1;
vector[contador]="--> Codigo: "+n1+" || Nombre: "+n2+" || Alias: "+n3+" || Correo: "+n4+" || Telefono: "+n5;
}

protected void mostrarHistorial(){

try{
    System.out.println(vector.length);
    for(int i=1; i<vector.length;i++){
        if (!vector[i].isEmpty()){
           System.out.println(vector[i]);
        }       
    }
}catch(Exception e){
    System.out.println(e.getMessage());
        }

    } 
//Reg Vector 2//.................
protected void histo2(String n1,String n2){
conta2=conta2+1;
vectorb[conta2]="--> Codigo: "+n1+" || Nombre: "+n2;
}

protected void mostrarHisto2(){

try{
    System.out.println(vectorb.length);
    for(int i=1; i<vectorb.length;i++){
        if (!vectorb[i].isEmpty()){
           System.out.println(vectorb[i]);
        }       
    }
}catch(Exception e){
    System.out.println(e.getMessage());
        }

    }   
//Reg Vector 3//.................
protected void histo3(String n1,String n2){
conta3=conta3+1;
vectorc[conta3]="--> Codigo: "+n1+"\n    Descripcion: "+n2;
}

protected void mostrarHisto3(){

try{
    System.out.println(vectorc.length);
    for(int i=1; i<vectorc.length;i++){
        if (!vectorc[i].isEmpty()){
           System.out.println(vectorc[i]);
        }       
    }
}catch(Exception e){
    System.out.println(e.getMessage());
        }

    }   



    

}

