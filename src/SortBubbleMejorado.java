public class SortBubbleMejorado {

    public void sortAscedente(int[] numeros, boolean pasos) {
        if (pasos) {
            System.out.print("Arreglo original -> ");
            for (int n : numeros) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < numeros.length; i++) {
            boolean hayCambio = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    if (pasos) {
                        System.out.println("Comparando i: " + i + ", j: " + j + " -> numeros[" + j + "]:" + numeros[j] + " con numeros[" + (j+1) + "]:" + numeros[j+1]);
                        System.out.println("Intercambio: " + numeros[j] + " <-> " + numeros[j + 1]);
                    }
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    hayCambio = true;

                    if (pasos) {
                        System.out.print("Estado actual -> ");
                        printArray(numeros);
                    }
                }
            }
            if (!hayCambio) 
            break;
        }
    }

    public void sortDescendente(int[] numeros, boolean pasos) {
        if (pasos) {
            System.out.print("Arreglo original -> ");
            for (int n : numeros) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < numeros.length; i++) {
            boolean hayCambio = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    if (pasos) {
                        System.out.println("Comparando i: " + i + ", j: " + j + " -> numeros[" + j + "]:" + numeros[j] + " con numeros[" + (j+1) + "]:" + numeros[j+1]);
                        System.out.println("Intercambio: " + numeros[j] + " <-> " + numeros[j + 1]);
                    }
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    hayCambio = true;

                    if (pasos) {
                        System.out.print("Estado actual -> ");
                        printArray(numeros);
                    }
                }
            }
            if (!hayCambio) 
            break;
        }
    }

    public void printArray(int[] numeros) {
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
            sortAscedente(numeros, pasos);
        } else {
            sortDescendente(numeros, pasos);
        }
        printArray(numeros);
    }
}