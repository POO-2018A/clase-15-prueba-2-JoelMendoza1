
package datos;
import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       //Declarar materias
       
       String materia1="M1";
         String nivel="2 nivel";
         
         Materias m1= new Materias(materia1,nivel);
         
         String materia2="M2";
        Materias m2= new Materias(materia2 , nivel);
        
        
       //E1
         Datos e1 =new Datos();
         System.out.println("Igrese los datos del primer alumno");
         
         System.out.print("Nombre: ");
         String nombre1=scan.nextLine();
         e1.setNombre(nombre1);
         
         System.out.print("Edad: ");
         int edad1=scan.nextInt();
         e1.setEdad(edad1);
         
         System.out.println("Materias:");
         
        boolean esc1=false;//bucle do while;
         do{ 
         esc1=false;
         System.out.println("Escoga una de las dos materias");
        
         System.out.println("1."+ m1);
         System.out.println("2."+ m2);
         
         int escogerMateria1=scan.nextInt();
         
         
         if(escogerMateria1==1){
             e1.setMaterias(m1);
         }else if(escogerMateria1==2){
             e1.setMaterias(m2);
         }else {
             System.out.println("Opcion Incorrecta");
             esc1=true;
         }
         
         }while( esc1);
         //E2
         
         Datos e2 =new Datos();
         System.out.println("Igrese los datos del segundo alumno");
         
         scan.nextLine();
         System.out.print("Nombre: ");
         String nombre2=scan.nextLine();
         e2.setNombre(nombre2);
         
         
         System.out.print("Edad: ");
         
         int edad2=scan.nextInt();
         e2.setEdad(edad2);
         
         
         do{
         System.out.println("Escoga una de las dos materias");
        
         System.out.println("1."+ m1);
         System.out.println("2."+ m2);
         
         int escogerMateria2=scan.nextInt();
         
          
          
          esc1=false;    
          
         if(escogerMateria2==1){
             e2.setMaterias(m1);
         }else if(escogerMateria2==2){
             e2.setMaterias(m2);
         }else {
             System.out.println("Opcion Incorrecta");
             esc1=true;
         }
         
          }while(esc1);
         
         
         //E3
         
         Datos e3 =new Datos();
         System.out.println("Igrese los datos del tercer alumno");
         scan.nextLine();
         
         System.out.print("Nombre: ");
         String nombre3=scan.nextLine();
         e3.setNombre(nombre3);
         
         System.out.print("Edad: ");
         int edad3=scan.nextInt();
         e3.setEdad(edad3);
         
         
          do{
         System.out.println("Escoga una de las dos materias");
        
         System.out.println("1."+ m1);
         System.out.println("2."+ m2);
         
         int escogerMateria3=scan.nextInt();
          
         
              
          esc1=false;
         if(escogerMateria3==1){
             e3.setMaterias(m1);
         }else if(escogerMateria3==2){
             e3.setMaterias(m2);
         }else {
             System.out.println("Opcion Incorrecta");
             esc1=true;
         }
          }while(esc1);
         
          //E4
          
         Datos e4 =new Datos();
         System.out.println("Igrese los datos del cuarto alumno");
         scan.nextLine();
         
         System.out.print("Nombre: ");
         String nombre4=scan.nextLine();
         e4.setNombre(nombre4);
         
         System.out.print("Edad: ");
         int edad4=scan.nextInt();
         e4.setEdad(edad4);
         
         System.out.println("Materias:");
        
         do{
         System.out.println("Escoga una de las dos materias");
        
         System.out.println("1."+ m1);
         System.out.println("2."+ m2);
         
         int escogerMateria4=scan.nextInt();
          
          
         
          esc1=false;
          if(escogerMateria4==1){
             e4.setMaterias(m1);
         }else if(escogerMateria4==2){
             e4.setMaterias(m2);
         }else {
             System.out.println("Opcion Incorrecta");
             esc1=true;
         }
         }while(esc1);
         
         //E5
          
         Datos e5 =new Datos();
         System.out.println("Igrese los datos del quinto alumno");
         scan.nextLine();
         
         System.out.print("Nombre: ");
         String nombre5=scan.nextLine();
         e5.setNombre(nombre5);
         
         System.out.print("Edad: ");
         int edad5=scan.nextInt();
         e5.setEdad(edad5);
         
         System.out.println("Materias:");
         
         do{
         System.out.println("Escoga una de las dos materias");
        
         System.out.println("1."+ m1);
         System.out.println("2."+ m2);
         
         int escogerMateria5=scan.nextInt();
         
          
              
          esc1=false;
         if(escogerMateria5==1){
             e5.setMaterias(m1);
         }else if(escogerMateria5==2){
             e5.setMaterias(m2);
         }else {
             System.out.println("Opcion Incorrecta");
             esc1=true;
         }
          }while(esc1);
          
         
         
          if(e1.equals(e2)||e1.equals(e3)||e1.equals(e4)||e1.equals(e5)){
              System.out.println("Existen dublicados en las posiciones: 1, 3 y 5");
             
          }else if(e2.equals(e3)||e2.equals(e4)||e2.equals(e5)){
              System.out.println("Existen dublicadosen las posiciones: 1, 3 y 5");
              
          }else if(e3.equals(e4)||e3.equals(e5)){
              System.out.println("Existen dublicadosen las posiciones: 1, 3 y 5");
              
          }else if(e4.equals(e5)){
              System.out.println("Existen dublicadosen las posiciones: 1, 3 y 5");
              
          }else {
              
              //imprimir
         System.out.println("E1: "+e1);
         System.out.println("E2: "+e2);
         System.out.println("E3: "+e3);
         System.out.println("E4: "+e4);
         System.out.println("E5: "+e5);
          }
          
         
    }
}
