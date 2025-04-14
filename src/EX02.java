/*2) Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: a D
b D c D ... D z onde cada cadeia de caracteres, a, b, ..., z, é da forma do exercício descrito
acima. Portanto, uma cadeia de caracteres estará no formato correto se consistir em qualquer
número de cadeias deste tipo ( x C y ), separadas pelo caractere ‘D’. Em cada ponto, você só
poderá ler o próximo caractere da cadeia (é mandatório o uso de pilha).*/

public class EX02 {
    public static boolean verificarStr(String str) {
        PilhaGenerica<String> pilha1 = new PilhaGenerica<>(26);
        boolean res = false;
        String[] strtrim = str.split("D");

        for (int i = 0; i < strtrim.length; i++) {
            pilha1.push(strtrim[i]);
        }

        while (!pilha1.vazia()){
            res = EX01.verificarxcy(pilha1.pop());
            if (!res){return false;}
        }

        return res;
        }

    }


