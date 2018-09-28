/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author kevin
 */
class Pais {//inicio de clase pais
    //Declaracion de atributos
    
        String nombre;
        int ext_ter;
        long poblacion;
    private String nom;

    Pais(String nom) {
        nombre = nom;
    
    }

    Pais(String nom, int ex) {
      
        nombre = nom;
        ext_ter = ex;
    
    
    }

    Pais(String nom, int ex, long np) {
        
        nombre = nom;
        ext_ter = ex;
        poblacion = np;
    }

 
        
      
    
     public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", ext_ter=" + ext_ter + ", poblacion=" + poblacion + '}';
    }
        
        //Metodos

    public String getNombre() {//Regresar Nombre
        return nombre;
    }

    public void setNombre(String n) {//Ingresar Nombre
        nombre = n;
    }

    public int getExt_ter() {//Regresar Ext_ter
        return ext_ter;
    }

    public void setExt_ter(int a) {//Ingresar Ext_ter
        ext_ter = a;
    }

   
    

}
    
    
    
    

