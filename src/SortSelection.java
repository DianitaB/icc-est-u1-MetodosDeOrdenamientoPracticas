public class SortSelection {

    public SortSelection(){
    }

    public void ordenarAscendente (int [] arreglo, boolean pasos){
        if(pasos){
            System.out.println("Arreglo Original : ");
            for(int arre : arreglo){
                System.out.println(arre + "");
            }
            System.out.println();
        }
        for (int i = 0; i < arreglo.length; i++) {   
            int posMenor = i; 
            for(int j = i + 1 ; j < arreglo.length; j++){
                if(arreglo[posMenor] > arreglo[j]){
                    posMenor = j;
                }
            }
            if(posMenor !=i){
                if (pasos){
                    System.out.println("Comparacion: " + (i + 1) + " valeor mínimo encontrado " + arreglo[posMenor] + " en posicion " + posMenor);
                    System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[posMenor]);

                }
                int aux = arreglo[posMenor];
                arreglo[posMenor] =  arreglo[i];
                arreglo[i] = aux;
                if (pasos) {
                    System.out.print("Estado actual -> ");
                    imprimirArreglo(arreglo);
                }
            }   
        }
    }

    public void ordenarDescendente(int[] arreglo, boolean pasos){
        if(pasos){
            System.out.println("Arreglo Original : ");
            for(int arre : arreglo){
                System.out.println(arre + "");
            }
            System.out.println();
        }
       for (int i = 0; i < arreglo.length; i++) {   
            int posMenor = i; 
            for(int j = i + 1 ; j < arreglo.length; j++){
                if(arreglo[posMenor] < arreglo[j]){
                    posMenor = j;
                }
            }
            if(posMenor !=i){
                if (pasos){
                    System.out.println("Comparacion: " + (i + 1) + " valeor mínimo encontrado " + arreglo[posMenor] + " en posicion " + posMenor);
                    System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[posMenor]);

                }
                int aux = arreglo[posMenor];
                arreglo[posMenor] =  arreglo[i];
                arreglo[i] = aux;
                if (pasos) {
                    System.out.print("Estado actual -> ");
                    imprimirArreglo(arreglo);
                }
            }   
        }
    }
     public void imprimirArreglo(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            if (i == arreglo.length - 1) {
                System.out.print(arreglo[i]);
            } else {    
                System.out.print(arreglo[i] + ", ");
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