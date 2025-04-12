/*6) Elabore um método que retorne as letras invertidas das palavras de uma frase recebida
por parâmetro, preservando a ordem das palavras na frase. Por exemplo “a maçã está podre”,
deve ter como saída: “a ãçam átse erdop”. As operações básicas de uma pilha, push e pop,
devem ser usadas.*/

public class EX06 {
    public static void inverteFrase(String str) {
        Pilha pilha = new Pilha();

        char c;
        int i = 0;
        while ( i < str.length() )
        {
            c = str.charAt(i);
            pilha.push(c);
            i++;
        }

        System.out.println("Frase invertida: ");

        while (!pilha.vazia()) {
            c = pilha.pop();
            System.out.print(c);
        }

    }
}

