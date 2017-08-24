package jueves_24;

import java.util.Scanner;

public class Ejercicio {
	private static Scanner r;

	public static  void  ejercicio1(){
		System.out.println("este es el ejercicio1");
		}
	public static void ejercicio2(){
		System.out.println("este es el ejercicio2");
		}
	
	public static void Calculadora(){
		r = new Scanner(System.in);
		String num1;
		String num2;
		int numero1;
		int numero2;
		int resultado;
		System.out.println("ingrese un numero");
		num1 =r.nextLine();
		System.out.println("ingrese otro numero");
		num2=r.nextLine();
		numero1=Integer.parseInt(num1);
		numero2=Integer.parseInt(num2);
		if(numero2!=0){
			resultado = numero1/numero2;
			System.out.println("este es tu resultado : "+resultado);
			 
			}
		else
			System.out.println("no se puede dividir un numero por 0 ");
				
			
		}
		
	}
	
