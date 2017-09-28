/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

/**
 *
 * @author Alumno
 */
public abstract class empanadas {
    String relleno="";
    String sabor = "";
    int precio =0;
    int tamaño =0;
    
    public empanadas(String r, String s, int p, int t){
        this.relleno=r;
        this.sabor=s;
        this.tamaño=t;
        this.precio=p;
    }
    
    public abstract void comprar();
    public abstract void crear();
    public abstract void rellenar();
    public abstract void venden();
}
