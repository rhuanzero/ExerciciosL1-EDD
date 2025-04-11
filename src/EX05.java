/*4) Utilizando as operações de manipulação de pilhas vistas em aula, assim como o código de
PilhaGenerica visto, use uma pilha auxiliar e uma variável do tipo T, para desenvolver um
procedimento que remova um dado objeto do tipo T de uma posição qualquer de uma pilha.
Para saber se dois objetos do tipo T são iguais, você deve usar o método equals (ou
compareTo). Note que você não pode acessar diretamente a estrutura interna da pilha
(atributos), devendo usar apenas as operações (métodos) de manipulação.*/

public class EX05 {
    public static <T> boolean verificaBalanceamento(String str) {
    Pilha pilha1 = new Pilha();
    boolean res = false;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '(' || str.charAt(i) == ')'
                || str.charAt(i) == '{' || str.charAt(i) == '}'
                || str.charAt(i) == '[' || str.charAt(i) == ']') {
            pilha1.push(str.charAt(i));
        }
    }

    while (!pilha1.vazia()){
        char topo = pilha1.pop();
        if (topo == '('){
            res = true;
        }
        else if (topo == ')'){

        }


    }

    return res;
    }
}

