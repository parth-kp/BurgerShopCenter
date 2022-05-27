import java.io.*;
import java.util.*;

class Menu{

    public void Burger(){
        Header();
        File myfile = new File("Burger.txt");
        try{
            Scanner sc = new Scanner(myfile);
            sc.useDelimiter("/");
            System.out.println("\nID NO. \t    Item Name\t       Price");
            System.out.println("--------------------------------------");

            while(sc.hasNext()){
                System.out.printf("%-6s| %-24s |%-5s \n",sc.next(),sc.next(),sc.next());
            }
            System.out.println();
            sc.close();
        }
        catch (Exception ignored) {
        }

    }

    public void Extra(){                             //Extra menu items print

        File myfile = new File("Extra.txt");
        try{
            Scanner sc = new Scanner(myfile);
            sc.useDelimiter("/");

            System.out.println("\nID NO. \t    Item Name\t       Price");
            System.out.println("--------------------------------------");

            while(sc.hasNext()){

                System.out.printf("%-6s| %-24s |%-5s \n",sc.next(),sc.next(),sc.next());
            }
            System.out.println();
            sc.close();
        }
        catch (Exception ignored) {
        }

    }

    public void Additional(){                    //Additional menu items print

        File myfile = new File("Additional.txt");
        try{
            Scanner sc = new Scanner(myfile);
            sc.useDelimiter("/");

            System.out.println("\nID NO. \t    Item Name\t       Price");
            System.out.println("--------------------------------------");

            while(sc.hasNext()){
                System.out.printf("%-6s| %-24s |%-5s \n",sc.next(),sc.next(),sc.next());
            }

            sc.close();
        }
        catch (Exception ignored) {
        }

    }

    public void Header(){

        System.out.println("\t\t\t\t   *+------------------------------------------+*");
        System.out.println("\t\t\t\t"+"                    WELCOME TO                    ");
        System.out.println("\t\t\t\t"+"                 SUPER BURGER KING                    ");
        System.out.println("\t\t\t\t   *+------------------------------------------+*");
    }
}

