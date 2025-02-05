import java.util.InputMismatchException;
import java.util.Scanner;

public class BookstoreApp {
    public static void main(String[] args) {
        //Declare Constructor
        Scanner scanner = new Scanner(System.in);
        Book[] book = new Book[5];
        BookstoreCompute compute = new BookstoreCompute();
        int option = 0;

        do{
            try{
                //Show Menu
                System.out.println("Menu\n" +
                        "1) Add new book\n" +
                        "2) Print Book list\n" +
                        "3) Highest book price\n" +
                        "4) Lowest book price\n" +
                        "5) Display books average price\n" +
                        "6) Exit");

                //Input
                option = scanner.nextInt();
                scanner.nextLine();


                if (option >=1 && option<=6){
                    //Process and Output
                    switch (option){
                        case 1:
                            compute.addNewBook(scanner);
                            break;
                        case 2:
                            compute.getAllBooks(scanner);
                            break;
                        case 3:
                            compute.highest(scanner);
                            break;
                        case 4:
                            compute.lowest(scanner);
                            break;
                        case 5:
                            compute.average(scanner);
                            break;
                        case 6:
                            System.out.println("Existing app");
                            break;
                    }//switch
                }else {
                    System.out.println("Invalid option, enter a number between 1 and 6!");
                }

            }catch (InputMismatchException e){
                System.out.println("Invalid option, enter a number between 1 and 6!");
                scanner.nextLine();
            }



        } while(option != 6);
        scanner.close();
    }//main
}//class
