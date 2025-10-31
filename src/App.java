public class App {
    public static void main(String[] args) throws Exception {
        
        View view = new View();
        // view.showMenu();
        // view.inputOption(4);

        int [] numeros = new int [] {12,45,8,6,7}; 
        

        while (true) {
            view.showMenu();
            int option = view.inputOption(4);
            view.shortOrder();
            int orden = view.inputOption(2);
            view.showPasosMenu();
            int pasos = view.inputOption(2);

            switch (option) {
                case 1:
                System.out.println("\n Metodo Seleccion");
                SortSelection sortSelection = new SortSelection();
                sortSelection.sort(numeros, orden ==1, pasos == 1);
                
                    break;
                
                case 2:
                System.out.println("\n Metodo Insercion");
                SortInsertion sortInsertion = new SortInsertion();
                sortInsertion.sort(numeros,orden ==  1, pasos == 1);
                    break;

                case 3:
                System.out.println("\n Metodo Burbuja");
                SortBubble sortBubble = new SortBubble();
                sortBubble.sort(numeros, orden == 1, pasos == 1);
                    break;
                
                case 4:
                System.out.println("\n Metodo Burbuja Mejorado");
                SortBubbleMejorado sortBubbleMejorado = new SortBubbleMejorado();
                sortBubbleMejorado.sort(numeros, orden == 1, pasos == 1);

                case 5:
                System.out.println("\n Adios");
                System.exit(option);
                    break;
            
                default:
                    break;
            }
        }
    }
}