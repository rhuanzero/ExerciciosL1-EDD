/*3) Desenvolva um método para manter duas pilhas dentro de um único vetor (array) de modo
que nenhuma das pilhas incorra em estouro até que toda a memória seja usada, e toda uma
pilha nunca seja deslocada para outro local dentro do vetor.*/

import java.util.Scanner;

public class EX03 extends Pilha{ //Trocando o "private" para "protected" na classe Pilha
    private Scanner sc = new Scanner(System.in);
    private int topo2;

    public EX03() {
        super();
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
                escolha = sc.nextInt();
            }while (escolha != 1 && escolha != 2);
            if (escolha == 1){
                if (topo != -1) {
                    c = vetor[topo--];
                }
                else {
                    //System.out.println("A pilha 1 está vazia!");
                }
            }
            else {
                if (topo2 != n) {
                    c = vetor[topo2++];
                }
                else {
                    //System.out.println("A pilha 2 está vazia!");
                }
            }

        }
        else{
            System.out.println("Pilhas vazias");
        }
        return c;
    }

    @Override
    public boolean push(char elemento)
    {
        if (!this.cheia())
        {
            int escolha;
            do {
                System.out.println("Pilha 1 ou 2?");
                escolha = sc.nextInt();
            }while(escolha!=1 && escolha!=2);
            if (escolha == 1){
                if (topo != -1) {
                    vetor[++topo] = elemento;
                    return true;
                }
                System.out.println("Pilha cheia: push não funcionou.\n");
            }
            else {
                if (topo2 != n) {
                    vetor[--topo2] = elemento;
                    return true;
                }
                System.out.println("Pilha cheia: push não funcionou.\n");
            }
        }
        else {
            System.out.println("Pilha cheia: push não funcionou.\n");
        }
        return false;
    }

    @Override
    public char retornaTopo(){
        char elemento = '\0';
        int escolha;
        if (!this.vazia()){
            do {
                System.out.println("Pilha 1 ou 2?");
                escolha = sc.nextInt();
            }while (escolha!=1 && escolha!=2);
            if (escolha == 1){
                elemento = vetor[topo];
            }
            else {
                elemento = vetor[topo2];
            }
        }
        else{
            System.out.println("Pilhas vazias");
            return elemento;
        }
        return elemento;
    }
}
