public class Main {

    public static void main(String[] args) {

        int numeroIf = 0;
        int numeroWhile = 0;
        String estaciones ="verano";

        while (numeroWhile < 3) {
            System.out.println("Imprimiendo DOWHILE While"+numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println("Imprimiendo DOWHILE " + numeroWhile);
        }while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println("Imprimiendo FOR  " + numeroFor);
        }

        if (numeroIf > 0) {
            System.out.println("El numero es positivo ");
        }
        if (numeroIf < 0) {
            System.out.println("El numero es negativo ");
        } else {
            System.out.println("el numero es igual ha 0");
        }

        switch (estaciones){

            case "verano":
                System.out.println("CASE: verano");
                break;
            case "invierno":
                System.out.println("CASE: invierno");
                break;
            case "primavera":
                System.out.println("CASE: primavera");
                break;
            case "otono":
                System.out.println("CASE: otoño");
                break;
            default:
                System.out.println("CASE: default no hay valor ");

        }

    }

}