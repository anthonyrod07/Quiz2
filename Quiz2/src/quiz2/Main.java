/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la iglesia:");
        String nombreIglesia = scanner.nextLine();

        System.out.println("Ingrese el nombre del pastor:");
        String nombrePastor = scanner.nextLine();

        System.out.println("Ingrese la cantidad de feligreses:");
        int cantidadFeligreses = scanner.nextInt();
        scanner.nextLine(); 
        
        Iglesia iglesia = new Iglesia(nombreIglesia, nombrePastor, cantidadFeligreses);

        for (int i = 0; i < cantidadFeligreses; i++) {
            System.out.println("Ingrese el nombre de la persona feligrés " + (i + 1) + ":");
            String nombreFeligres = scanner.nextLine();

            System.out.println("Ingrese la cédula de la persona feligrés " + (i + 1) + ":");
            String cedulaFeligres = scanner.nextLine();

            System.out.println("Ingrese el diezmo del feligrés " + (i + 1) + ":");
            double diezmoFeligres = scanner.nextDouble();
            scanner.nextLine(); 

            iglesia.agregarFeligres(i, nombreFeligres, cedulaFeligres, diezmoFeligres);
        }

        double gananciasIglesia = iglesia.calcularGananciasIglesia();
        double impuestoMunicipal = iglesia.calcularImpuestoMunicipal();
        double impuestoComedor = iglesia.calcularImpuestoComedor();
        double gananciaPastor = iglesia.calcularGananciaPastor();

        System.out.println("Monto total de ganancias de la iglesia: " + gananciasIglesia);
        System.out.println("Monto para la municipalidad (infraestructura): " + impuestoMunicipal);
        System.out.println("Monto para el comedor municipal: " + impuestoComedor);
        System.out.println("Monto de ganancia para el pastor: " + gananciaPastor);

        List<Feligres> diezmoMayor100000 = iglesia.obtenerFeligresConDiezmoMayor(100000);

        System.out.println("\nFeligreses con diezmo mayor a 100000:");
        imprimirListaFeligres(diezmoMayor100000);
    }

    private static void imprimirListaFeligres(List<Feligres> lista) {
        for (Feligres feligre : lista) {
            System.out.println("Nombre: " + feligre.nombre + ", Cédula: " + feligre.cedula);
        }
    }
}
