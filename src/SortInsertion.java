public class SortInsertion {
    public SortInsertion(){

    }
    public void sortAscendente(int[] numeros, boolean pasos){
        for ( int i = 1; i < numeros.length; i++) {
            int j = i-1;
            int aux  = numeros [i];
            if (pasos){
                 System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while(j>=0 && numeros[j]>aux){
                if(pasos)
                    System.out.println("Compara Aux: " + aux + "con numeros [" + j +  "]: " + numeros[j]);
                numeros[j+1] = numeros[j];
                if(pasos)
                    imprimirArreglo(numeros);
                j--;
                if(pasos)
                    System.out.println("Mueve numeros [" + (j+1) +"] a numeros [" + (j+2) + "]");
            }
            numeros[j+1] = aux;   
            if(pasos){
                System.out.println("Insert aux: " + aux + " en la posición " + (j+1));
                System.out.println("Estado Actual");
                imprimirArreglo(numeros);
            } 
        }
    }
    public void sortDescendente(int[]numeros, boolean pasos){
        for ( int i = 1; i < numeros.length; i++) {
            int j = i-1;
            int aux  = numeros [i];
            if (pasos){
                 System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while(j>=0 && numeros[j]<aux){
                if(pasos)
                    System.out.println("Compara Aux: " + aux + "con numeros [" + j +  "]: " + numeros[j]);
                numeros[j+1] = numeros[j];
                if(pasos)
                    imprimirArreglo(numeros);
                j--;
                if(pasos)
                    System.out.println("Mueve numeros [" + (j+1) +"] a numeros [" + (j+2) + "]");
            }
            numeros[j+1] = aux;   
            if(pasos){
                System.out.println("Insert aux: " + aux + " en la posición " + (j+1));
                System.out.println("Estado Actual");
                imprimirArreglo(numeros);
            } 
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
            sortAscendente(numeros,  pasos);
        }else{
            sortDescendente(numeros,  pasos);
        }
    }
}

