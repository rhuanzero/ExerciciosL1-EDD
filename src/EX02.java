/*2) Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: a D
b D c D ... D z onde cada cadeia de caracteres, a, b, ..., z, é da forma do exercício descrito
acima. Portanto, uma cadeia de caracteres estará no formato correto se consistir em qualquer
número de cadeias deste tipo ( x C y ), separadas pelo caractere ‘D’. Em cada ponto, você só
poderá ler o próximo caractere da cadeia (é mandatório o uso de pilha).*/

import java.util.Scanner;

public class EX02 extends EX01 {
    public static boolean verificarStr(String str) {
        Pilha p1 = new Pilha(str.length());
        Pilha Dcontador = new Pilha(13);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != 'D') {
                p1.push(c);
            }

            if (c == 'D' || i == str.length() - 1) {
                if (!EX01.verificarxcyPilha(p1)) {
                    System.out.println("Nao está no formato aDbDc...Dz");
                    return false;
                }
                Dcontador.push(c);
            }
        }
        if (Dcontador.vazia()){
            System.out.println("Nenhum D foi encontrado");
            return false;
        }
        System.out.println("Está no formato aDbDc...Dz");
        return true;
    }

}








