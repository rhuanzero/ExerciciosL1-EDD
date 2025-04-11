/*3) Desenvolva um método para manter duas pilhas dentro de um único vetor (array) de modo
que nenhuma das pilhas incorra em estouro até que toda a memória seja usada, e toda uma
pilha nunca seja deslocada para outro local dentro do vetor.*/

import java.util.Scanner;

public class EX03 extends Pilha{ //Trocando o "private" para "protected" na classe Pilha
    Scanner in = new Scanner(System.in);
    private int topo2;

    public EX03() {
        topo2 = this.n;
    }

    public EX03(int tamanho) {
        super(tamanho);
        topo2 = tamanho;
    }

    @Override
    public boolean vazia(){
        return (topo == -1 && topo2 == n);
    }

    @Override
    public boolean cheia(){
        return (topo == (topo2 - 1));
    }

    @Override
    public char pop(){
        char c = '\0';
        int escolha;

        if (!this.vazia()){
            do {
                System.out.println("Pilha 1 ou 2?");
                escolha = in.nextInt();
            }while (escolha != 1 && escolha != 2);
            if (escolha == 1){
                c = vetor[topo--];
            }
            else {
                c = vetor[topo2--];
            }

        }
        else{
            System.out.println("Pilhas vazias");
        }
    }













}
