/*4) Utilizando as operações de manipulação de pilhas vistas em aula, assim como o código de
PilhaGenerica visto, use uma pilha auxiliar e uma variável do tipo T, para desenvolver um
procedimento que remova um dado objeto do tipo T de uma posição qualquer de uma pilha.
Para saber se dois objetos do tipo T são iguais, você deve usar o método equals (ou
compareTo). Note que você não pode acessar diretamente a estrutura interna da pilha
(atributos), devendo usar apenas as operações (métodos) de manipulação.*/

public class EX06 {
    public static void verificaBalanceamento(String str) {
        Pilha pilha = new Pilha();

        char c;
        int i = 0;
        while ( i < str.length() )
        {
            c = str.charAt(i);
            pilha.push(c);
            i++;
        }

        System.out.println("Frase invertida: ");

        while (!pilha.vazia()) {
            c = pilha.pop();
            System.out.print(c);
        }

    }
}

