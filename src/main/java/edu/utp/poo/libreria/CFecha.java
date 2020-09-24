/*
   CLASE CFECHA
        MAIN 02
 */
package edu.utp.poo.libreria;

import java.util.*;

/**
 * @author Jhoel RN MH
 * jhoelrn@hotmail.com
 */
public class CFecha {
    //ATRIBUTOS
    private int dia, mes , año;
    
    //CONSTRUCTORES
    public CFecha() {  // Constructor sin argumentos
        asignarFecha(); // asigna la fecha actual
    }
    
    public CFecha(int dd){ // Constructor con un argumento
        this(); // invoca al constructor CFecha sin argumentos
        dia = dd;
        
        if (!fechaCorrecta()) {
            System.out.println("Fecha Incorrecta. Se asigna la fecha actual.");
            asignarFecha();
        }
    }
    
    public CFecha(int dd, int mm){
        this(); // invoca al constructor CFecha sin argumentos
        dia = dd;
        mes = mm;
        
        if (!fechaCorrecta()) {
            System.out.println("Fecha Incorrecta. Se asigna la fecha actual.");
            asignarFecha();
        }
    }
    
    public CFecha(int dd, int mm, int aaaa){
        this();
        dia = dd;
        mes = mm;
        año = aaaa;
        
        if(!fechaCorrecta()){
            System.out.println("Fecha Incorrecta. Se asigna la fecha actual.");
            asignarFecha();
        }
    }
    
    public CFecha(CFecha obj){ // Constructor copia
        dia = obj.dia;
        mes = obj.mes;
        año = obj.año;
    }
    
    //DESTRUCTOR
    protected void finalize() throws Throwable{ // Destructor
        System.out.println("Objeto destruido");
    }
    
    
    
        
    //METODOS PUBLICOS y PROTEGIDOS
    protected boolean bisiesto(){
        return ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0));
    }
    
    public void asignarFecha(){
        // Asignar por omisión la fecha actual.
        GregorianCalendar fechaActual = new GregorianCalendar();
        dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        mes=fechaActual.get(Calendar.MONTH)+1;
        año = fechaActual.get(Calendar.YEAR);
    }
    
    public void asignarFecha(int dd){
        asignarFecha();
        dia = dd;
    }
    
    public void asignarFecha(int dd, int mm){
        asignarFecha();
        dia = dd;
        mes = mm;
    }
    
    public void asignarFecha(int dd, int mm, int aaaa){
        dia = dd;
        mes = mm;
        año = aaaa;
    }
    
    public void obtenerFecha(int[ ] fecha){
        fecha[0] = dia;
        fecha[1] = mes;
        fecha[2] = año;        
    }
    
    public boolean fechaCorrecta()
    {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        //año correcto?
        añoCorrecto = (año >= 1582);
        //mes correcto?
        mesCorrecto = (mes >= 1) && (mes <= 12);
        
        switch(mes){
            case 2:
                if (bisiesto()) {
                    diaCorrecto = (dia >= 1 && dia <= 29);
                    
                } else {
                    diaCorrecto = (diaCorrecto = (dia >= 1 && dia <= 29));
                }
                break;
                
            case 4: case 6: case 9: case 11:
                diaCorrecto = (dia >= 1 && dia <=30);
            default:
                diaCorrecto = (dia >= 1 && dia <=31);
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }
    
    public CFecha copiar(CFecha obj){
        dia = obj.dia;
        mes = obj.mes;
        año = obj.año;
        return this;
    }
    
}
