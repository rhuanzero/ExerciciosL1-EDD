public class metodosPilhaGenerica {
    protected static <T> void inverterPilha(PilhaGenerica<T> pilha1) {
        PilhaGenerica<T> aux = new PilhaGenerica<>();
        PilhaGenerica<T> aux2 = new PilhaGenerica<>();

        while (!pilha1.vazia()) {
            aux.push(pilha1.pop());
        }
        while (!aux.vazia()) {
            aux2.push(aux.pop());
        }
        while (!aux2.vazia()) {
            pilha1.push(aux2.pop());
        }
    }

    protected static <T> int pilhaTam(PilhaGenerica<T> pilha1) {
        int tam = 0;
        PilhaGenerica<T> aux = new PilhaGenerica<>(100);
        PilhaGenerica<T> aux2 = new PilhaGenerica<>(100);
        while (!pilha1.vazia()) {
            aux.push(pilha1.pop());
            tam++;
        }
        while (!aux.vazia()) {
            aux2.push(aux.pop());
        }
        while (!aux2.vazia()) {
            pilha1.push(aux2.pop());
        }
        return tam;
    }

    protected static <T> void copiarPilha(PilhaGenerica<T> p1, PilhaGenerica<T> p2) { // p1 == pilhaoriginal, p2 == pilha copia
        int i = pilhaTam(p1);
        PilhaGenerica<T> aux = new PilhaGenerica<>(i);
        PilhaGenerica<T> aux2 = new PilhaGenerica<>(i);

        while (!p2.vazia()) {
            p2.pop();
        }

        while (!p1.vazia()) {
            aux.push(p1.pop());
        }

        while (!aux.vazia()) {
            aux2.push(aux.pop());
        }


        while (!aux2.vazia()) {
            T c = aux2.pop();
            p2.push(c);
            p1.push(c);
        }
    }


    /*for (int j = 1; j <= n; j++) {
                int b = 1;

                    while (b <= j){
                        p1.push(b);
                        b++;
                    }


                inverterPilha(p1);


                while (!p1.vazia()) {
                    System.out.print(p1.pop());
                }

                System.out.println();
               }*/
}
