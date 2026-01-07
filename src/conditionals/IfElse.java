package conditionals;

public class IfElse {
	public static void main(String[] args) {
		String input = "";

		// if (input) System.out.println("La stringa non è vuota"); // <-- Non siamo in JavaScript, pertanto non esiste il concetto di Truthy/Falsy
		if (input.isEmpty()) System.out.println("La stringa è vuota");

		int x = 1, y = 2, z = 3;

		if (x > y) System.out.println("X è più grande di Y");
		else System.out.println("Y è più grande di X");

		// ---------------------------------------- TERNARY ---------------------------------------------------------------
		String t = x > y ? "X è più grande di Y" : "Y è più grande di X";

		String t2 = "";
		if (x > y) t2 = "X è più grande di Y";
		else t2 = "Y è più grande di X";

		int a = x > y ? (Math.max(x, z)) : (y > z ? y : z);
		System.out.println(a);
		
	}
}
