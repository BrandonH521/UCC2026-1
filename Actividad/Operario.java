package Actividad;

public class Operario {
    //Atributos
    private double horas;
    
    //Constructor
    public Operario(int cedula, String nombre, double salario, double horas){
        super(cedula, nombre, salario);
        this.horas = horas;
    }
    
    public double pagar(){
        return salario * horas;
    }
}