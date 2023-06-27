package exepciones;

import java.util.Scanner;

public class MainExcepciones {

	public MainExcepciones() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce numero");
		try {
			int numeroEntero = teclado.nextInt();

			System.out.println("numero * 2 = " + numeroEntero * 2);
		} catch (Exception e) {
			System.out.println("no se pudo leer un numero");
			
		}finally{
			teclado.close();
		}
		try {
			int suma = PruebaExepciones.sumarPositivos(0,0);
			System.out.println("resultado" + suma);
		}cath(Exception e){
			e.printStackTrace();
		}
		
	}

}
