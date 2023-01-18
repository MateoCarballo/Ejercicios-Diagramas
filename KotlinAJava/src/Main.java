public class Main {


    static char caracter = '=';
    static int longitud =15;

    public static void main(String[] args) {
       displayBorder('*',15);
       System.out.println("\n");
       displayBorder(5);
       System.out.println("\n");
       displayBorder('A');
       System.out.println("\n");
       displayBorder();

    }

    public static void displayBorder ( int lenght){
        for (int i = 0; i <lenght ; i++) {
            System.out.print(caracter);
        }
    }
    public static void displayBorder (char entrada){
        for (int i = 0; i <longitud ; i++) {
            System.out.print(entrada);
        }
    }

    public static void displayBorder (char entrada, int lenght){
        for (int i = 0; i <lenght ; i++) {
            System.out.print(entrada);
        }
    }
    public static void displayBorder (){
        for (int i = 0; i <longitud ; i++) {
            System.out.print(caracter);
        }
    }


}