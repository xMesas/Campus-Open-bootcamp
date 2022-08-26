public class Main {

    public static void main(String[] args) {
        //1.2 Llamar a la funcion en el main y darle valores
        System.out.println("Funcion que suma 3 numeros; Resultado: "+myMethod(10,20,30)+".");
        //2.4 Crear un objecto en el  main y añadir las puertas del coche
        Coche miCoche = new Coche();
        miCoche.puertas = 3;
        //2.5 Mostrar el numero de puertas que tiene El objecto + Funcion que incrementa el numero de puertas
        System.out.println("El OBJ miCoche tiene "+miCoche.puertas+" puertas.");
        System.out.println("Funcion incrementar el numero de puertas "+miCoche.agregarPuertas()+".");

    }
    //1.1 Crear una funcion con tres parametros que sean números que se suman entre sí.
    static int myMethod(int a, int b, int c) {
        return a + b + c;
    }
}
//2.1 Crear una clase que tiene C
class Coche{
    //2.2 Dentro de la clase coche, una variable que almacene el numero de puertas que tiene;
    public int puertas;

    //2.3 Una funcion que incremente el numero de puertas que tiene el coche ++ int;
    public int agregarPuertas(){
        return ++puertas ;
    }

}
