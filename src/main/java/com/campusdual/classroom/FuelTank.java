package com.campusdual.classroom;

public class FuelTank {

    // Encapsulado: no se puede acceder directamente desde fuera
    private int actualFuel = 10;

    // Getter
    public int getActualFuel() {
        return this.actualFuel;
    }

    // Setter con validación
    public void setActualFuel(int actualFuel) {
        if (actualFuel >= 0) {
            this.actualFuel = actualFuel;
        } else {
            System.out.println("No se puede asignar un valor negativo al combustible.");
        }
    }

    // Mostrar información con acceso indirecto
    public void showDetails() {
        System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");
    }
}
