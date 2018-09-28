/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

//Carpeta
/**
 *
 * @author Kevin flores miranda
 */
public class Mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//inicio de metodo main
        // TODO code application logic here
        Pais p1 = new Pais("Francia");//Nuevo objeto p1
        Pais p2 = new Pais("China",1234567);//Nuevo objeto p2
        Pais p3 = new Pais("Holanda",76543,12345612);//Nuevo objeto p3
       
        String n ;
        int a;
        long np;
        
        
        
     //Peticiones
       
     p1.getNombre();
     p2.getNombre();
     p2.getExt_ter();
     p3.getNombre();
     p3.getExt_ter();
     p3.getPoblacion();
     System.out.println(p1.toString()); //mostrar valor
     System.out.println(p2.toString());//mostrar valor
     System.out.println(p3.toString());//mostrar valor
    
    
    
    
    
    }//fin de metodo main

    
    }
    

