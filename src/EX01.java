import java.util.Scanner;
/* 1) Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: x C
y onde x e y são cadeias de caracteres compostas por letras ‘A’ e/ou ‘B’, e y é o inverso de
x. Isto é, se x = “ABABBA”, y deve equivaler a “ABBABA”. Em cada ponto, você só poderá ler
o próximo caractere da cadeia.  */

public class EX01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entrada = "ACA";
        int tam = (entrada.length()-1)/2;
        boolean verificaChar = false;
        Pilha x = new Pilha(tam);
        Pilha y = new Pilha(tam);

        for (int i = 0; i < entrada.length(); i++) {
            verificaChar = (entrada.charAt(i) == (int) 'A' || entrada.charAt(i) == (int) 'B' || entrada.charAt(i) == (int) 'C');
        }
        if ((entrada.charAt(tam) == 'C') && verificaChar){// Verifica se o C está na posiçao certa e se contem apenas A e B
            for (int i = 0; !(entrada.charAt(i) == 'C'); i++) {
                if (!(entrada.charAt(i) == (int) 'C')) {
                    System.out.print(entrada.charAt(i));
                    x.push(entrada.charAt(i));
                }
            }
            System.out.println();
            for (int i = entrada.length()-1; i != tam; i--) {
                if (!(entrada.charAt(i) == (int) 'C')) {
                    System.out.print(entrada.charAt(i));
                    y.push(entrada.charAt(i));
                }
            }
           // return true;
        }
        else {
            System.out.println("Errado!");
            //return false;
        }
        System.out.println();
        for (int i = 0; i < tam; i++) {
            if (x.pop() != y.pop()) {
                System.out.println("Errado!");
                //return false;
            }
            else {
                System.out.print("certo!");
            }
        }
    }

}
