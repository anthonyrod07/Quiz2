/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author rodri
 */
class Iglesia {
    String nombre;
    String nombrePastor;
    int cantidadFeligreses;
    Feligres[] feligreses;

    public Iglesia(String nombre, String nombrePastor, int cantidadFeligreses) {
        this.nombre = nombre;
        this.nombrePastor = nombrePastor;
        this.cantidadFeligreses = cantidadFeligreses;
        this.feligreses = new Feligres[cantidadFeligreses];
    }

    public void agregarFeligres(int indice, String nombre, String cedula, double diezmo) {
        this.feligreses[indice] = new Feligres(nombre, cedula, diezmo);
    }

    public double calcularGananciasIglesia() {
        double total = 0;
        for (Feligres feligre : feligreses) {
            if (feligre != null) {
                total += feligre.diezmo;
            }
        }
        return total;
    }

    public double calcularImpuestoMunicipal() {
        return calcularGananciasIglesia() * 0.09; 
    }

    public double calcularImpuestoComedor() {
        return calcularGananciasIglesia() * 0.21; 
    }

    public double calcularGananciaPastor() {
        return calcularGananciasIglesia() * 0.7; 
    }

    public List<Feligres> obtenerFeligresConDiezmoMayor(double valorDiezmo) {
        List<Feligres> feligresesConDiezmoMayor = new ArrayList<>();
        for (Feligres feligre : feligreses) {
            if (feligre != null && feligre.diezmo > valorDiezmo) {
                feligresesConDiezmoMayor.add(feligre);
            }
        }
        return feligresesConDiezmoMayor;
    }
}
