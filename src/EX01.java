import java.util.Scanner;
/* 1) Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: x C
y onde x e y são cadeias de caracteres compostas por letras ‘A’ e/ou ‘B’, e y é o inverso de
x. Isto é, se x = “ABABBA”, y deve equivaler a “ABBABA”. Em cada ponto, você só poderá ler
o próximo caractere da cadeia.  */

public class EX01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entrada = "ABABBCBBABA";
        int tam = (entrada.length()-1)/2;
        System.out.println(tam);
        Pilha x = new Pilha(tam);
        Pilha y = new Pilha(tam);

        if ((entrada.charAt(tam) == 'C')) {// Verifica se o C está na posiçao certa
            for (int i = 0; i < entrada.length(); i++) {
                if (!(entrada.charAt(i) == (int) 'C')) {
                    System.out.print(entrada.charAt(i));
                    x.push(entrada.charAt(i));
                } else {
                    System.out.println("C encontrado!");
                }
            }
            for (int i = entrada.length(); i >= 0; i--) {
                System.out.println(i);
                if (!(entrada.charAt(i) == (int) 'C')) {
                    System.out.print(entrada.charAt(i));
                    y.push(entrada.charAt(i));
                } else {
                    System.out.println("C encontrado!");
                }
            }
        }
        else {
            System.out.println("o C está na posição errada!");
        }







    }

}
