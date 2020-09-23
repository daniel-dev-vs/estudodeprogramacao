package tipodados;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String args []) {
		
		System.out.println("show me the lights");
	}
	
	public enum Daniel{
		
		
	}
	
	public static void ExibirTiposdeDados() {
		
		int numero = 1;
		boolean isItau = false;
		byte numeroByte = 2;
		short numeroShort = 3;
		int numeroInteiro = 4;
		long numeroLong = 5L;
		long numeroLong10 = 10;
		float numeroFlutuante = 42.66f;
		double numeroFlutuanteDouble = 42.3;
		char letra = 'a';
		String palavra = "word";
							
		System.out.println(numero);
		System.out.println(isItau);
		System.out.println(numeroByte);
		System.out.println(numeroShort);
		System.out.println(numeroInteiro);
		System.out.println(numeroLong);
		System.out.println(numeroLong10);
		System.out.println(numeroFlutuante);
		System.out.println(numeroFlutuanteDouble);
		System.out.println(letra);
		System.out.println(palavra);
		
	}
	
	public static void UsandoOperadoresAritmeticos() {
		
		double number1 = 12.5, number2 = 3.5, result;
    	
        // Using addition operator
        result = number1 + number2;
        System.out.println("number1 + number2 = " + result);
    	
        // Using subtraction operator
        result = number1 - number2;
        System.out.println("number1 - number2 = " + result);
    	
        // Using multiplication operator
        result = number1 * number2;
        System.out.println("number1 * number2 = " + result);

        // Using division operator
        result = number1 / number2;
        System.out.println("number1 / number2 = " + result);
    	
        // Using remainder operator
        result = number1 % number2;
        System.out.println("number1 % number2 = " + result);
		
	} 
	
	
	public static void Concatenacao() {
		 String start, middle, end, result;
	    	
	        start = "Talk is cheap. ";
	        middle = "Show me the code. ";
	        end = "- Linus Torvalds";
	    	
	        result = start + middle + end;
	        System.out.println(result);
		
	}
	
	
	 public static void OperadoresUnario() {
	    	
	        double number = 5.2, resultNumber;
	        boolean flag = false;
	    	
	        System.out.println("+number = " + +number);
	        // number is equal to 5.2 here.
	        
	        System.out.println("-number = " + -number);
	        // number is equal to 5.2 here.
	    	
	        // ++number is equivalent to number = number + 1
	        System.out.println("number = " + ++number);
	        // number is equal to 6.2 here.

	        // -- number is equivalent to number = number - 1
	        System.out.println("number = " + --number);
	        // number is equal to 5.2 here.

	        System.out.println("!flag = " + !flag);
	        // flag is still false.
	    }
	
	
}
