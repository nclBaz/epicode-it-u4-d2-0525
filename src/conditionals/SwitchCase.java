package conditionals;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		System.out.println("Ciao dammi un voto");
//
//		int score = Integer.parseInt(scanner.nextLine());
//
//		switch (score) {
//
//			case 100: {
//				System.out.println("Complimenti hai preso il voto massimo!");
//				// break;
//			}
//			case 90: {
//				System.out.println("Il voto è eccellente");
//				// break;
//			}
//			case 80: {
//				System.out.println("Il voto è buono");
//				// break;
//			}
//			default: {
//				System.out.println("Puoi fare di meglio");
//				// break; // Se DEFAULT è messo per ultimo il break non serve perché siamo già in fondo
//			}
//		}

//		System.out.println("Dammi il primo numero");
//		int num1 = Integer.parseInt(scanner.nextLine());
//
//		System.out.println("Dammi il secondo numero");
//		int num2 = Integer.parseInt(scanner.nextLine());
//
//		int num3 = num1 > num2 ? --num1 : num2; //
//
//		switch (num3) { // 9
//			case 10: {
//				System.out.println("è 10");
//				num1++; //
//			}
//			case 100: {
//				System.out.println("è 100");
//				num1--; //
//			}
//			case 1000: {
//				System.out.println("è 1000");
//				num1++; //
//				break;
//			}
//			default:
//				System.out.println("Nessuno dei precdenti");
//				num1--; // 8
//		}
//
//		System.out.println("num1? " + ++num1); // Pre-incremento, cioè prima incrementa e poi legge il valore, quindi 9
//		System.out.println("num1? " + num1++); // Post-incremento, cioè prima legge il valore poi incrementa, quindi stampa 9 ma num1 diventa 10
//		System.out.println(num1); // 10

		// ************************************ ENHANCED SWITCH-CASE *****************************************
		// E' una versione moderna di switch-case che permette di assegnare un valore ad una variabile basandoci sulla valutazione
		// di una condizione tramite switch-case
		System.out.println("Dammi un numero da 1 a 4");
		int num = Integer.parseInt(scanner.nextLine());

		String stagione = switch (num) {
			case 1 -> "Inverno"; // I Break sono impliciti quindi per codice così compatto non servono proprio
			case 2 -> "Primavera";
			case 3 -> "Estate";
			case 4 -> "Autunno";
			default -> "Stagione non valida";
		};

		System.out.println(stagione);
	}
}
