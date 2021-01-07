public class articulo {
    
    int precio;
    int iva = 21;
    int cuantosquedan;
    String nombre;
    double iva1;
    double iva2;

    public articulo(String nombre, int precio, int iva, int cuantosquedan){

    this.nombre = nombre;
    this.iva = iva;
    this.precio = precio;
    this.cuantosquedan = cuantosquedan;
    
        if(nombre != "pedro"){
        Sistem.out.println("Error");
        }
        if(precio < 0){
        Sistem.out.println("Error");   
        }
        if(iva != 21){
        Sistem.out.println("Error");    
        }
        if(cuantosquedan < 0){
        Sistem.out.println("Error");    
        }
    }
}
