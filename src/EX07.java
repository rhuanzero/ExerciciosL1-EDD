/*7) Em sala de aula, aprendemos a avaliar uma expressão aritmética que estivesse em
notação pós-fixada, que não faz uso de parênteses por não possuir ambiguidade na sua
avaliação. Neste exercício, você deve utilizar o conceito de Pilha para realizar a avaliação de
expressões aritméticas em notação infixa, isto é, aquela que aprendemos e utilizamos ao
longo do Ensino Fundamental e do Ensino Médio. Nesse contexto, vamos usar a seguintedefinição recursiva: uma expressão aritmética é um número, ou um parêntese esquerdo
seguido de uma expressão aritmética seguida por um operador seguido por outra expressão
aritmética seguida de um parêntese direito. Por simplicidade, essa definição assume que a
expressão está completamente parentizada, especificando precisamente quais operadores
devem ser aplicados a quais operandos e removendo possíveis ambiguidades na avaliação.
Por exemplo, a expressão ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) segue essa definição.
Você deve então implementar um método que realize a avaliação de tais expressões
representadas em uma String usando o conceito de Pilha. Por fim, cabe citar que o código
que voces vão desenvolver corresponde a um exemplo simples de um interpretador: um
programa que interpreta uma computação especificada por uma string e realiza tal
computação para chegar ao resultado.*/

import java.util.Scanner;

public class EX07 {

    public static boolean verificarInfixa(String str) {
    Pilha p2 = new Pilha(str.length());
    int parenteses = 0;

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (ehValido(c)){
                p2.push(c);
        }
        else if(c == ' ') {}
        else {
            System.out.println("Caracter inválido!");
            return false;
        }
    }

        System.out.println();

    while (!p2.vazia()) {
        char c = p2.pop();
        if (c == ')') {
            parenteses++;
        } else if (c == '(') {
            parenteses--;
            if (parenteses < 0) {
                System.out.println("Não é infixa!");
                return false;
            }
        }
        if (p2.vazia()) break;
        char topo = p2.retornaTopo();
        //System.out.println(c);
        if (c == '(') {
            if (!(topo == ')'|| topo == '(' || ehOperando(topo) || ehOperador(topo))){
                System.out.println("Não é infixa!");
                return false;
            }
        }
        else if (c == ')'){
            if (!(topo == ')'|| topo == '(' || ehOperando(topo))){
                System.out.println("Não é infixa!");
                return false;
            }
        }

        else if (ehOperando(c)){
            if (!(topo == ')' || topo == '(' || ehOperador(topo))){
                System.out.println("Não é infixa!");
                return false;
            }
        }
        else if (ehOperador(c)) {
            if (!(ehOperando(topo) || topo == '(' || topo == ')')){
                System.out.println("Não é infixa!");
                return false;
            }
        }
        //System.out.print(c);

        else if (p2.vazia()) break;





    }

    if (parenteses !=0)
    {
        System.out.println("Parenteses não alinhados!");
        return false;
    }

        System.out.println("É infixa!");

    return true;


    }


    private static boolean ehValido(char num) {
        if (ehOperando(num)) {
            return true;
        }
        else if (num == '(' || num == ')') {
            return true;
        }
        else if (ehOperador(num)) {
            return true;
        }
        return false;
    }

    private static boolean ehOperador(char num){
        if (num == '*' || num == '/' || num == '+' || num == '-') return true;
        return false;
    }

    private static boolean ehOperando(char num){
        if (num >= '0' && num <='9') return true;
        return false;
    }

}

