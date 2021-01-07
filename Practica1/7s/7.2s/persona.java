public class persona {
    
    private int dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public persona(int dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setEdad(int edad) {
        this.edad = edad;
        if(this.edad<18){
            System.out.Println("Menor de edad");
        }
        else{
            System.out.Println("Mayor de edad");
        }
    }
    public int getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public int getEdad() {
        return edad;
    }
        
}
