package Actividad;

public class Vendedor {
    //Atributos
    private double comision;
    
    //Constructor
    public Operario(int cedula, String nombre, double salario, double comision){
        super(cedula, nombre, salario);
        this.comision = comision;
    }
    
    public double pagar(){
        return salario * (1 + (comision / 100));
    }
}
}
