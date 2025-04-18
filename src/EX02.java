/*2) Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: a D
b D c D ... D z onde cada cadeia de caracteres, a, b, ..., z, é da forma do exercício descrito
acima. Portanto, uma cadeia de caracteres estará no formato correto se consistir em qualquer
número de cadeias deste tipo ( x C y ), separadas pelo caractere ‘D’. Em cada ponto, você só
poderá ler o próximo caractere da cadeia (é mandatório o uso de pilha).*/

import java.util.Scanner;

public class EX02 {
    public static boolean verificarStr(String str) {
        Pilha p1 = new Pilha(str.length());

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != 'D') {
                p1.push(c);
            }

            if (c == 'D' || i == str.length() - 1) {
                if (!verificarxcyPilha(p1)) {
                    System.out.println("Nao está no formato aDbDc...Dz");
                    return false;
                }
            }

        }

        return true;
    }


    private static void inverterPilha(Pilha pilha1) {
        Pilha aux = new Pilha();
        Pilha aux2 = new Pilha();

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

    private static int pilhaTam(Pilha pilha1) {
        int tam = 0;
        Pilha aux = new Pilha(100);
        Pilha aux2 = new Pilha(100);
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

    private static void copiarPilha(Pilha p1, Pilha p2) {
        int i = pilhaTam(p1);
        Pilha aux = new Pilha(i);

        while (!p1.vazia()) {
            aux.push(p1.pop());
        }

        while (!aux.vazia()) {
            char c = aux.pop();
            p2.push(c);
            p1.push(c);
        }
    }

    public static boolean verificarxcyPilha(Pilha p1) {
        Scanner in = new Scanner(System.in);
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







