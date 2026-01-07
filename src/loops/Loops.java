package loops;

import java.util.Scanner;

public class Loops {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		// *************************************** WHILE *************************************
		// Nel while la prima cosa che avviene è che viene VALUTATA LA CONDIZIONE.
		// Se questa è falsa -> si salta l'intero loop
		// Se è vera --> si entra nel loop
		// Una volta che siamo all'interno del loop, si itera fino a che la condizione da vera non diventa falsa
		// Se la variabile che sto valutando nella condizione non cambia mai ----> CICLO INFINITO

//		System.out.println("Dammi il primo numero");
//		int num1 = Integer.parseInt(scanner.nextLine()); // 1
//
//		System.out.println("Dammi il secondo numero");
//		int num2 = Integer.parseInt(scanner.nextLine()); // 10

//		while (num2 <= num1 + 20) {
//			num1++;
//			num2 += 4;
//			System.out.println(num2);
//		}

//		int sum = 0;
//
//		while (true) {
//			System.out.println("Dammi un numero, premi 0 per uscire");
//			int num = Integer.parseInt(scanner.nextLine());
//			if (num == 0) break; // Con il break esco forzatamente dal loop al verificarsi della condizione nell'if
//			sum += num;
//		}
//
//		System.out.println("La somma è: " + sum);

		// ************************************** DO-WHILE ***************************************
		// Nei Do-While viene prima eseguito il blocco di codice nel do e solo alla fine, valutata la condizione
		// Anche se la condizione dovesse essere falsa dall'inizio, il blocco di codice verrà eseguito comunque

//		int sum = 0;
//		int num = 0;
//
//		do {
//			System.out.println("Dammi un numero, premi 0 per uscire");
//			num = Integer.parseInt(scanner.nextLine());
//			sum += num;
//		} while (num != 0);
//
//		System.out.println("La somma è: " + sum);

		// ****************************************** FOR ******************************************
		// I cicli FOR a differenza dei While vengono utilizzati quando sappiamo con anticipo quante iterazioni vogliamo fare
		// Ad es: voglio ripetere un blocco di istruzioni per 10 volte; oppure voglio ripetere un blocco di istruzioni per
		// un numero di volte pari alla lunghezza del numero degli elementi di un array/ numero di caratteri in una stringa, ecc ecc

//		int[] numbers = new int[5];
//
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println("Dammi un numero intero: ");
//			numbers[i] = Integer.parseInt(scanner.nextLine());
//		}

		// System.out.println(Arrays.toString(numbers));

		// Enhanced For, alternativa più compatta al for tradizionale, utile quando non abbiamo bisogno di accedere agli indici degli array
//		for (int currentElement : numbers) {
//			System.out.println(currentElement);
//		}

//		for (int i = 0; i < 20; i++) {
//
//			if (i == 10) break; // Break mi permette di uscire in maniera anticipata dal loop
//			System.out.println(i);
//		}

//		for (int i = 0; i < 20; i++) {
//
//			if (i == 10) continue; // Continue salta l'iterazione corrente e va alla prossima
//			System.out.println(i);
//		}

		for (int i = 0; i < 5; i++) {
			if (i == 3) continue;
			System.out.println("i: " + i);
			for (int j = 0; j < 5; j++) {
				if (j == 2) break;
				System.out.println("j: " + j);
			}
		}
	}
}
