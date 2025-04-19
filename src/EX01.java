import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
/* 1) Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: x C
y onde x e y são cadeias de caracteres compostas por letras ‘A’ e/ou ‘B’, e y é o inverso de
x. Isto é, se x = “ABABBA”, y deve equivaler a “ABBABA”. Em cada ponto, você só poderá ler
o próximo caractere da cadeia.  */

public class EX01{
    public static boolean verificarxcy(String entrada) {
        Scanner in = new Scanner(System.in);
        Pilha x = new Pilha(entrada.length());

        for (int i = 0; i < entrada.length(); i++) {
            x.push(entrada.charAt(i));
        }

        if (verificarxcyPilha(x)){
            return true;
        };
        return false;

    }

    protected static void inverterPilha(Pilha pilha1) {
        Pilha aux = new Pilha(pilhaTam(pilha1));
        Pilha aux2 = new Pilha(pilhaTam(pilha1));

        while (!pilha1.vazia()) {
            aux.push(pilha1.pop());
        }
        while (!aux.vazia()) {
            aux2.push(aux.pop());
        }
        while (!aux2.vazia()) {
            pilha1.push(aux2.pop());
        }
    }

    protected static int pilhaTam(Pilha pilha1) {
        int tam = 0;
        Pilha aux = new Pilha(pilhaTam(pilha1));
        Pilha aux2 = new Pilha(pilhaTam(pilha1));
        while (!pilha1.vazia()) {
            aux.push(pilha1.pop());
            tam++;
        }
        while (!aux.vazia()) {
            aux2.push(aux.pop());
        }
        while (!aux2.vazia()) {
            pilha1.push(aux2.pop());
        }
        return tam;
    }

    protected static void copiarPilha(Pilha p1, Pilha p2) {
        int i = pilhaTam(p1);
        Pilha aux = new Pilha(i);

        while (!p1.vazia()) {
            aux.push(p1.pop());
        }
        while (!p2.vazia()) {
            p2.pop();
        }

        while (!aux.vazia()) {
            char c = aux.pop();
            p2.push(c);
            p1.push(c);
        }
    }

    public static boolean verificarxcyPilha(Pilha p1) {
        int tam = pilhaTam(p1);
        int localC = tam/2;
        boolean verificaChar;
        boolean verificaC = false;

        Pilha aux = new Pilha(tam);
        copiarPilha(p1, aux);
        Pilha x = new Pilha((tam - 1) / 2);
        Pilha y = new Pilha((tam - 1) / 2);

        while (!p1.vazia()) {
            char c = p1.pop();
            verificaChar = (c == 'A' || c == 'B' || c == 'C');
            if (!verificaChar) {
                System.out.println("Caracteres inválidos!");
                return false;
            }
        }

        copiarPilha(aux, p1);


        for (int i = 0; i != tam; i++) { // Verificar C na posição correta
            char c = p1.pop();
            if (c == 'C') {
                if (i == localC) {
                    verificaC = true;
                }
            }
            ;
        }

        copiarPilha(aux, p1);


        boolean verificaPilhaInvertida = false;
        if (verificaC) { // Verifica se o C está na posiçao certa
            while (!p1.vazia()) {
                char c = p1.pop();
                if (!verificaPilhaInvertida && c != 'C') {
                    x.push(c);
                } else {
                    verificaPilhaInvertida = true;
                }

                if (verificaPilhaInvertida && c != 'C') {
                    y.push(c);
                }
                }



        } else {
            System.out.println("O caracter C está na posição errada!");
            return false;
        }

        if (pilhaTam(x) != pilhaTam(y)){
            System.out.println("Tamanhos desproporcionais!");
            return false;

        }

        System.out.println();
        inverterPilha(y);



        while (!x.vazia()) {
            if (x.pop() != y.pop()) {
                System.out.println("Não são simetricos!");
                return false;
            }
        }


        System.out.print("Está no formato XCY!");
        return true;


    }}

