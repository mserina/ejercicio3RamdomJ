package edu.ejercicio3Ramdon.controladores;

import edu.ejercicio3Ramdon.servicios.OperacionImplementacion;
import edu.ejercicio3Ramdon.servicios.OperacionInterfaz;
import java.util.Scanner;

public class inicio {

	public static void main (String[] args) {
		
		//Objetos
		OperacionInterfaz op = new OperacionImplementacion();
		Scanner sc = new Scanner(System.in);
		
		//variable
		int numeroIntroducido;
		int numeroGenerado;

		numeroGenerado = op.generarNumero();
		
		/*
		 * METODO DO WHILE
		do {
			System.out.println("Introduzca un numero entero");
			numeroIntroducido = sc.nextInt();	
			
			if(numeroIntroducido > numeroGenerado) {
				System.out.println("Tu numero es mayor que el numero Generado");
			}
			else
			{
				System.out.println("Tu numero es menor que el numero introducido");
			}
			
			System.out.println("Te quedan " + intentos-- + " intentos");
			
			if(intentos == 0) { 
				
			}
		}while(numeroIntroducido != numeroGenerado | );
		*/
		
		System.out.println(numeroGenerado);
		
		for (int intentos=9; intentos > -1; intentos --) {
			System.out.println("Introduzca un numero entero");
			numeroIntroducido = sc.nextInt();	
			
			if(numeroIntroducido > numeroGenerado) {
				System.out.println("Tu numero es mayor que el numero Generado");
			}
			else if (numeroIntroducido < numeroGenerado)
			{
				System.out.println("Tu numero es menor que el numero introducido");
			}
			
			else
			{
				System.out.println("FELICIDADES");
				System.out.println("Numero de intentos: " + (10-intentos));
				return;

			}
			
			System.out.println("Te quedan " + intentos + " intentos");
			
		}
		System.out.println("Te quedaste sin intentos el numero a adivinar era " + numeroGenerado);
		
	}

}