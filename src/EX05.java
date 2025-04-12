/*5) Escreva um programa que leia uma sequência de caracteres e determine se os parênteses,
colchetes e chaves estão balanceados. Se a sequência não possuir esses caracteres ele
deve ser considerado balanceado. Exemplo:
“{ab}[cde]” - Balanceado
“{ab[cd]efg}” - Balanceado
“[abcde{efg]}” - Não balanceado*/

public class EX05 {
    public static <T> boolean verificaBalanceamento(String str) {
    Pilha pilha1 = new Pilha();
    boolean res = true;


    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '(' || str.charAt(i) == ')'
                || str.charAt(i) == '{' || str.charAt(i) == '}'
                || str.charAt(i) == '[' || str.charAt(i) == ']') {
            pilha1.push(str.charAt(i));
        }
    }
    char topo2 = pilha1.retornaTopo();

    while (!pilha1.vazia()){
        char topo = pilha1.pop();
        if (!pilha1.vazia()) {
            topo2 = pilha1.retornaTopo();
        }
        if (topo == ')'){
            if (topo2 == '('){
                res = true;
            }
            else {
                res = false;
            }
        }
        else if (topo == ']'){
            if(topo2 == '['){
                res = true;
            }
            else {
                res = false;
            }
        }
        else if (topo == '}'){
            if (topo2 == '{'){
                res = true;
            }
            else {
                res = false;
            }
        }
    }

    return res;
    }
}



