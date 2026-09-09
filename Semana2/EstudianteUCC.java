publicS class EstudianteUCC {

    //Atributos
    private int id;
    private int cedula;
    private String nombres;
    private String apellidos;
    private int edad;
    private double estatura;

    //Constructor el metodo constructor de la clase reconoce
    //Porque tiene el mismo nombre de la clase y permite daerle vida 
    //al objeto 


    public EstudianteUCC(int id, int cedula, String nombres, 
                         String apellidos, int edad, double estatura){
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String toString(){
        return "EstudianteUCC { id: " + id + ", cedula: " + cedula + ", nombres: " + nombres + 
               ", apellidos: " + apellidos + ", edad: " + edad + 
               ", estatura: " + estatura + '}';
    }

}