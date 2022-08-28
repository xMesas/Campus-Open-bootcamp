

public class Main {

    public static void main(String[] args) {
        Persona personaPrueba = new Persona();
        personaPrueba.setEdad(29);
        System.out.println("Edad: " + personaPrueba.getEdad());
        personaPrueba.setNombre("Xavier Mesas Garcia");
        System.out.println("Nombre: " + personaPrueba.getNombre());
        personaPrueba.setTelefono(666666666);
        System.out.println("Telefono:  " + personaPrueba.getTelefono());
    }
}
        class Persona {

            private int edad;
            private String nombre;
            private int telefono;


            public int getEdad() {
                return edad;
            }

            public void setEdad(int edad) {
                this.edad = edad;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public int getTelefono() {
                return telefono;
            }

            public void setTelefono(int telefono) {
                this.telefono = telefono;
            }


        }

