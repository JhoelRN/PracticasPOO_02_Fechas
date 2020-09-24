/*
 * CLASE PRINCIPAL MAIN01: POO_02_FECHAS
 */
package edu.utp.poo.fechas;
import edu.utp.poo.libreria.*;
/**
 * Programación Orientada a Objetos.
 * @author Jhoel RN MH
 * jhoelrn@hotmail.com
 */
public class Main02 {

    // VISUALIZAR UNA FECHA
    public static void visualizarFecha(CFecha fecha){
        int[] f = new int[3];
        
        fecha.obtenerFecha(f);
        System.out.println(f[0] + "/" +f[1]+ "/" +f[2]);
    }
    
    public static void main(String[] args) {
        
        CFecha fecha1 = new CFecha(); //
        CFecha fecha2 = new CFecha(3); // Constructor con 1 parámetro
        CFecha fecha3 = new CFecha(15,3); // Constructor con 2 parámetros
        CFecha fecha4 = new CFecha(1,3,2020); // Constructor con 3 parámetros
        
        //fecha1.copiar(fecha2.copiar(fecha3)); // LA FECHA 1 Y 2 ES IGUAL A LA FECHA 3
        CFecha fecha5 = new CFecha(fecha1); // Constructor recibe 1 objeto
        
        visualizarFecha(fecha1);
        visualizarFecha(fecha2);
        visualizarFecha(fecha3);
        visualizarFecha(fecha4);
        visualizarFecha(fecha5);
        
        //fecha invalida
        fecha2 = null;
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        runtime.runFinalization();
        
        
        
        
    }
    
}
