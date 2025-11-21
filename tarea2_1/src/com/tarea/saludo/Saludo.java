package com.tarea.saludo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Saludo {

	public void iniciar() {
        Scanner sc = new Scanner(System.in);

        
        String nombre = "Luis Manuel Sanchez Fernandez";

        System.out.print("Introduce tu fecha de nacimiento (dd/MM/yyyy): ");
        String fechaStr = sc.nextLine();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNac = LocalDate.parse(fechaStr, formatter);
            LocalDate hoy = LocalDate.now();
            int edad = Period.between(fechaNac, hoy).getYears();

            System.out.println("\nHola " + nombre + ", tienes " + edad + " años.");
        } catch (Exception e) {
            System.out.println("Error: la fecha introducida no tiene el formato correcto.");
        }

        sc.close();
    }
	
}
