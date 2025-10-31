import java.util.Scanner;

public class View {
    private final Scanner scanner;

    public View(){
        System.out.println("Metodos Ordenamiento");
        scanner = new Scanner(System.in);

    }

    public void showMenu(){

        System.out.println("\n --Menu Metodos");
        System.out.println("1. -> Selection");
        System.out.println("2. -> Insertion");
        System.out.println("3. -> Bubble");
        System.out.println("4. -> Salir");
        System.err.print("Seleccione la opcion:");

    }

    public int inputOption(int max){

        int option = -1;
        while(true){
            if(scanner.hasNextInt()){
                option = scanner.nextInt();
                if(option >= 1 && option <= max)
                break;
            }else{
                scanner.next();
            }
            System.out.println("Opcion invalida, Ingrese otra ves: ");
        }
        return option;

    }

    public void shortOrder(){
        System.out.println("\n --Seleccione el Orden");
        System.out.println("1. -> Ascendente");
        System.out.println("2. -> Descendente");
        System.err.print("Seleccione la opcion:");
    }

    public void showPasosMenu() {
        System.out.println("\n --Desea ver los pasos? ---");
        System.out.println("1. -> Si");
        System.out.println("2. -> No");
        System.err.print("Seleccione la opcion:");
    }
}