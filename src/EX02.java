public class EX02 {
    public static boolean verificarStr(String str) {
        //PilhaGenerica<String> pilha1 = new PilhaGenerica<>(26);
        boolean res = false;
        Pilha p1 = new Pilha();
        Pilha p2 = new Pilha();
        boolean passouC = false;
        boolean passouD = false;




        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!passouC && c != 'C' && c != 'D') {
                p1.push(c);
            } else if (passouC && c != 'C' && c!= 'D') {
                p2.push(c);
            }
            if (c == 'C'){
                passouC = true;
            }
            if (c == 'D' || i == str.length() - 1){
                int tam = 0;
                if (!passouC){
                    System.out.println("C na posição errada!");
                    return false;
                }
                Pilha aux = new Pilha();
                while (!p2.vazia()) {
                    aux.push(p2.pop());
                    tam++;
                }
                p2 = aux;
                if (!verificarXCYPilha(p1,p2, tam)){
                    System.out.println("Nao está no formato aDbDc...Dz");
                    return false;
                }
                while (!p1.vazia()){
                    p1.pop();
                    p2.pop();
                }
                passouC = false;
            }
        }

        return true;


    }

    private static int inverterPilha(Pilha pilha1) {
        int tam = 0;
        Pilha aux = new Pilha();
        while (!pilha1.vazia()) {
            aux.push(pilha1.pop());
            tam++;
        }
        pilha1 = aux;
        return tam;
    }

    private static int pilhaTam(Pilha pilha1) {
        int tam = 0;
        while (!pilha1.vazia()) {
            pilha1.pop();
            tam++;
        }
        return tam;
    }

    private static boolean verificarXCYPilha(Pilha pilhaum, Pilha pilhadois, int tam){



        for (int i = 0; i < tam; i++) {
            if (pilhaum.pop() != pilhadois.pop()) {
                System.out.println("Não são simetricos!");
                return false;
            }
        }
        System.out.print("Está no formato XCY!");
        return true;
    }
}




