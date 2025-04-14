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

    for (int i = 0; i < str.length(); i++) {

    }

    }

    public boolean ehValido(char num) {
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

