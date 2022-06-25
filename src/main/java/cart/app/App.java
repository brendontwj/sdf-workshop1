package cart.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static Scanner scan = new Scanner(System.in);
    static String input = null;
    static cart currCart = new cart();
    static boolean stop = false;
    public static void main( String[] args )
    {
        System.out.println("Welcome to your shopping cart!");

        while(!stop) {
            System.out.println("Please input a command: ");
            input = scan.nextLine();
            String[] terms = input.split(" ");

            switch(terms[0]) {
                case "list":
                    currCart.list(currCart);
                    break;
                case "add":
                    for(int i = 1; i < terms.length; i++) { 
                        currCart.add(terms[i]);
                    }
                    break;
                case "delete":
                    try {
                        currCart.delete(terms[1]);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Item does not exist in that index!git");
                    }
                    break;
                case "stop":
                    System.out.println("Thanks for using the cart, see you next time!");
                    stop = true;
                    break;
                default:
                    System.out.println("Input not recognized, try again!");
            }
        }
    }
}
