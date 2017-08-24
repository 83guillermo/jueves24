package jueves_24;

import java.util.Scanner;

public class Ejercicio_if {
	
	public static void ejercicio6(){
		
		
		String numero;
		int numeros;
		
		Scanner edad =new Scanner(System.in);
		
		System.out.println("tu edad es mayor a 18 años? ");
		numero=edad.nextLine();
		numeros=Integer.parseInt(numero); 
		if(numeros>=18){
			System.out.println("Eres mayor de edad");
			}
		if(numeros>=13 && numeros<18){
				System.out.println("tu edad es mayor a 13 años, eres un adolecente ");
				}
		else
			System.out.println("eres un niño/a");
			
		}
		
		
	
public static void ejercicio7(){
	String numero;
	int numeros;
	String estado = null;
	
	Scanner e =new Scanner(System.in);
	
	System.out.println("ingrese su edad ");
	numero=e.nextLine();
	
	
	numeros=Integer.parseInt(numero); 
	if(numeros<18 ){
		System.out.println("es muy pequeño para No ser soltero");
		
	}
	else {
		System.out.println("ahora ingrese su estado civil");
		estado=e.nextLine();
		switch(estado){
		case "casado":
			System.out.println("Felicidades uds esta casado");
			break;
		case "divorciado":
			System.out.println("felicidades Uds esta divorciado");
			break;
		default :
			System.out.println("uds esta soltero");
		}
		}
	

		
		
	
		
	}
 public static void ejercicio8(){
	 // la verdad este ejercicio todavia lo tengo que concretar
	 
	 
 }
}
