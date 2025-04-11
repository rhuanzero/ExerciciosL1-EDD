/*3) Desenvolva um método para manter duas pilhas dentro de um único vetor (array) de modo
que nenhuma das pilhas incorra em estouro até que toda a memória seja usada, e toda uma
pilha nunca seja deslocada para outro local dentro do vetor. */

public class EX03 {
    public static void main(String[] args) {
        int tam1 = 5;
        int tam2 = 5;
        Pilha pilha1 = new Pilha(tam1);
        Pilha pilha2 = new Pilha(tam2);

        char[] vetor = new char[20];

        for (char i = 'a'; !pilha1.cheia(); i++) {
            for (char j = 'a'; !pilha2.cheia(); j++) {
                pilha2.push(j);
            }
            pilha1.push(i);
        }

        int tam1v = 0;
        int tam2v = 0;
        while (!pilha1.vazia()){
            while (!pilha2.vazia()){
                System.out.print(pilha2.pop());
                tam2v++;
            }
            System.out.print(pilha1.pop());
            tam1v++;
        }




    }

}
