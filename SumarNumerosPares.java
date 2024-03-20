package AndreaMoreno;
//Add two even numbers 

import java.util.Scanner;

public class SumarNumerosPares {

	public static void main(String[] args) {
	
		int number1 = 0;
		int number2 = 0;
		int result = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrea primer número par:");
		number1 = teclado.nextInt();
		
		if (number1 % 2 == 0)
			{
		System.out.println("Ingrea segundo número par:");
		number2 = teclado.nextInt();	
			}
		
		else 
		{
			System.out.printf("Ingrese solo números pares.");
		}
		
		if (number2 % 2 == 0)
			{
		result = number1+number2;
			}
		
		else 
		{
			System.out.printf("Ingrese solo números pares.");
		}
		
		System.out.println("El resultado es: " + result);
	
	}
	

}


