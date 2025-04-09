import java.util.Scanner;

public class MainPilha
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		Pilha pilha = new Pilha(20);
		String s;
		char c;

		/*System.out.println("Entre com uma frase: ");
		s = in.nextLine();
		
		int i = 0;
		
		while ( i < s.length() )
		{
			c = s.charAt(i);
			pilha.push(c);
			i++;
		}
		
		System.out.println("Frase invertida: ");
		
		while (!pilha.vazia()) {
			c = pilha.pop();
			System.out.print(c);
		}
		
		System.out.print("\n");*/

		// EX01
		EX01.verificarxcy(in.nextLine());
		
		in.close();
	}
}
