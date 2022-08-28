public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Trabajador Trabajador = new Trabajador();
        cliente1.edad=29;
        cliente1.nombre="Xavier ";
        cliente1.telefono=688888886;
        cliente1.credito=18.5;
        System.out.println( "Edad: "+ cliente1.edad+"\n"+
                "Nombre: "+ cliente1.nombre+"\n"+
                "telefono: "+ cliente1.telefono+"\n"+
                "credito: "+ cliente1.credito+"\n");
    }
}

class Persona {
    int edad ;
    String nombre;
    int telefono;

}
class Cliente extends Persona{
    double credito;

    public Cliente() {
    }
}

class Trabajador extends Persona {
    double salario;
}