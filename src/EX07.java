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

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Pilha p1 = new Pilha(str.length());
    Pilha p2 = new Pilha(str.length());
    int parentA = 0;
    int parentB = 0;

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (ehValido(c)){
            if (c >= (int) '0' && c <= (int) '9') {
                p1.push(c);
            }
            else {
                p2.push(c);
            }
        }
        else {
            System.out.println("Caracter inválido!");
            return;
        }
    }

    while (!p1.vazia()) {
        System.out.print(p1.pop());
    }
        System.out.println();
    while (!p2.vazia()) {
        char c = p2.pop();
        if (c == '(') {
            parentA++;
        }
        else if (c == ')'){
            parentB++;
        }
    }

    if (!(parentA == parentB))
    {
        System.out.println("Parenteses não alinhados!");
        return;
    }








    }


    private static boolean ehValido(char num) {
        if (num >= (int) '0' && num <= (int) '9') {
            return true;
        }
        else if (num >= (int) '(' && num <= (int) '+') {
            return true;
        }
        else if (num == (int) '-') {
            return true;
        }
        else if (num == (int) '/') {
            return true;
        }
        return false;
    }
}

