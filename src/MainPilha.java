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
		//EX01.verificarxcy(in.nextLine());

		// EX02

		//EX02.verificarStr("ABCBA");


		// EX03
		/*EX03 duasPilhas = new EX03();
		while (!duasPilhas.cheia()){
			duasPilhas.push('r');
		}
		System.out.println("A pilha está cheia!");

		while (!duasPilhas.vazia()){
			duasPilhas.pop();
		}*/

		// EX04
		/*PilhaGenerica<Integer> teste = new PilhaGenerica<Integer>(5);

		while (!teste.cheia()){
			teste.push(in.nextInt());
		}

		EX04.removerElemento(teste,5);

		while (!teste.vazia()){
			System.out.println(teste.pop());
		}*/

		// EX05
		/*if (EX05.verificaBalanceamento(in.nextLine())){
			System.out.println("Está balanceado com sucesso!");
		}
		else{
			System.out.println("Não está balanceado!");
		}*/

		//EX06.inverteFrase("o orrohc erroc odáirp");

		//EX07.verificarInfixa(in.nextLine());
		EX08.paresUnicos(5);
		in.close();
	}
}
