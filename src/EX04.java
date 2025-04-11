/*4) Utilizando as operações de manipulação de pilhas vistas em aula, assim como o código de
PilhaGenerica visto, use uma pilha auxiliar e uma variável do tipo T, para desenvolver um
procedimento que remova um dado objeto do tipo T de uma posição qualquer de uma pilha.
Para saber se dois objetos do tipo T são iguais, você deve usar o método equals (ou
compareTo). Note que você não pode acessar diretamente a estrutura interna da pilha
(atributos), devendo usar apenas as operações (métodos) de manipulação.*/

import java.util.Scanner;

public class EX04 {
    public static <T> void removerElemento(PilhaGenerica<T> pilha, T tipo) {
        PilhaGenerica<T> pilhaAux = new PilhaGenerica<T>(100);
        T topo;

        while (!pilha.vazia()){
            topo = pilha.pop();
            if (topo != null && !topo.equals(tipo)){
                pilhaAux.push(topo);
            }
        }
        while (!pilhaAux.vazia()){
            pilha.push(pilhaAux.pop());
        }
    }
}
