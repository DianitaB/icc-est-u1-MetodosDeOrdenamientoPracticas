public class SortBubble {

    public void ordenarAscendente(int[] numeros,boolean pasos) {
        if(pasos){
            System.out.println("Arreglo Original : ");
            imprimirArreglo(numeros); 
            System.out.println();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (pasos) {
                System.out.println("i: " + i + ", j inicial: " + 0); 
            }
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (pasos) {
                    System.out.println("Compara numeros [" + j + "]: " + numeros[j] + " con numeros [" + (j + 1) + "]: " + numeros[j + 1]);
                }
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    if (pasos) {
                        System.out.println("Intercambia numeros [" + j + "] y numeros [" + (j + 1) + "]");
                        System.out.println("Estado Actual");
                        imprimirArreglo(numeros);
                    }
                }
            }
        }  
    }

    public void ordenarDescendente(int[] numeros, boolean pasos) {
        for (int i = 0; i < numeros.length; i++) {
            boolean hayCambio = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    hayCambio = true;
                }
            }
            if (!hayCambio) break;
        }
    }

    public void imprimirArreglo(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        System.out.println("]");
    }

     public void sort(int[] numeros, boolean orden, boolean pasos) {
        if (orden) {
            ordenarAscendente(numeros, pasos);
        }else{
            ordenarDescendente(numeros, pasos);
        }
    }
}