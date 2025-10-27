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
            System.out.println("Opcion invalida");
        }
        return option;
        
    }
}