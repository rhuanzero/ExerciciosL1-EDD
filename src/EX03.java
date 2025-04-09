/*3) Desenvolva um método para manter duas pilhas dentro de um único vetor (array) de modo
que nenhuma das pilhas incorra em estouro até que toda a memória seja usada, e toda uma
pilha nunca seja deslocada para outro local dentro do vetor. */

public class EX03 {
    public static void main(String[] args) {

        Pilha pilha1 = new Pilha(5);
        Pilha pilha2 = new Pilha(5);

        char[] vetor1 = new char[5];
        char[] vetor2 = new char[5];

        for(int i = 0; !pilha1.vazia(); i++){
            vetor1[i] = pilha1.pop();

        }

        for(int i = 0; !pilha2.vazia(); i++){
            vetor2[i] = pilha1.pop();

        }

        char[] vetorfinal = new char[vetor1.length + vetor2.length];



    }

}
