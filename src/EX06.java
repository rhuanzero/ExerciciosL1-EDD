/*6) Elabore um método que retorne as letras invertidas das palavras de uma frase recebida
por parâmetro, preservando a ordem das palavras na frase. Por exemplo “a maçã está podre”,
deve ter como saída: “a ãçam átse erdop”. As operações básicas de uma pilha, push e pop,
devem ser usadas.*/

public class EX06 extends EX01{



    public static void inverteFrase(String frase) {
        Pilha p1 = new Pilha(frase.length());
        int i = 0;
        char c;
        while (frase.length() > i) {
            c = frase.charAt(i);
            if (c!= ' ') {
                p1.push(c);
            } else {
                invertePalavra(p1);
                System.out.print(' ');
            }
            if (i == frase.length() - 1) {
                invertePalavra(p1);
            }
            i++;
        }

    }
    public static void invertePalavra(Pilha p1) {


        char c;

        //System.out.println("Frase invertida: ");

        while (!p1.vazia()) {
            c = p1.pop();
            if (c != ' ') {
                System.out.print(c);
            }
        }

    }
}

