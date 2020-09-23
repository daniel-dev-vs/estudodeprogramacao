package tipodados;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

	}

	public static void exibeMedia(int[] array) {
		int media = 0;
		int total = 0;
		for (int numero : array) {
			total += numero;
		}

		media = total / array.length;

		System.out.println("A média dos números do array é de: " + media);

	}

	public static void exibeTotal(int[] array) {

		int total = 0;
		for (int numero : array) {
			total += numero;
		}

		System.out.println("A média dos números do array é de: " + total);

	}

	public static void exibeCincoPrimeiroESomaCincoUltimos(int[] array) {

		int somaDosUltimos5Numeros = 0;
		for (int i = 0; i < array.length; i++) {
			if (i > 4) {
				somaDosUltimos5Numeros += i;
			} else {
				System.out.println("Posicao " + i + 1 + " Valor:" + i);
			}

		}
		
		System.out.println("soma dos últimos cinco números: "+ somaDosUltimos5Numeros);

	}
	
	public static void nomesComAsteriscos(String [] nomes) {
		
		for (String nome : nomes) {
			System.out.println("**" + nome + "**");
		}
	}
	
	public static void nomesEmOrdemAlfabetica(String [] nomes) {
		Arrays.sort(nomes);
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
	}

	public static void ArrayComLoops() {
		// Exemplos de array muntimensional;
		double[][] matrix = { { 1.2, 4.3, 4.0 }, { 4.1, -1.1 } };

		String[] arrayDeString = new String[2];
		String[] arrayDeSTringOutraForma = { "Daniel", "DAyana", "MArcinha" };

		int[] arrayDeInteiros = new int[2];

		arrayDeString[0] = "Daniel é burrinho hein kkkk";
		arrayDeString[1] = "Mas isso não importa";

		arrayDeInteiros[0] = 1;
		arrayDeInteiros[1] = 2;

		System.out.println("Array for");
		for (int i = 0; i < arrayDeString.length; i++) {

			System.out.println(arrayDeString[i]);
		}

		System.out.println("Array foreach");
		for (String nome : arrayDeString) {

			System.out.println(nome);
		}

		int i = 0;
		while (i < arrayDeString.length) {
			System.out.println(arrayDeString[i]);
			i++;
		}

		int indice = 0;
		do {
			System.out.println(arrayDeString[i]);
			indice++;
		} while (indice < arrayDeString.length);

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
