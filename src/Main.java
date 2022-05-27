/*

20BCE189  YASH PANCHAL
20BCE195  PARTH PATEL
20BCE211  NEEL PATEL

*/



import Burgers.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static ArrayList<Integer> listBurgers = new ArrayList<>();
    static ArrayList<Integer> listExtras = new ArrayList<>();
    static ArrayList<Integer> listAdditionals = new ArrayList<>();

    static Menu menu = new Menu();
    static Scanner Scan = new Scanner(System.in);
//--------------------------------------------------------------------------------------
    static ArrayList<Integer> takeOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        char ch = 'y';
        while (ch == 'y' || ch == 'Y') {
            System.out.print("Enter The Product Id: ");
            list.add(Scan.nextInt());
            System.out.print("\nMore Products to be Added? (y/n): ");
            ch = Scan.next().charAt(0);
        }
        return list;
    }
//--------------------------------------------------------------------------------------
   static void placeOrder(){
        char ch;
       ArrayList<Integer> list = new ArrayList<>(listBurgers);
       for (Integer listItem : list) {
           switch (listItem) {
               case 101:
                   AlooTikkiBurger B1 = new AlooTikkiBurger();
                   System.out.println("\nChoose Your Extras for Aloo Tikki Burger");
                   menu.Extra();
                   System.out.println("Would You like to choose Extra (y/n): ");
                   ch = Scan.next().charAt(0);
                   if (ch == 'y' || ch == 'Y') {
                       listExtras.clear();
                       listExtras = takeOrder();
                        listBurgers.addAll(listExtras);
                       if (listExtras.size() >= 1)
                           B1.setAdditional1(listExtras.get(0));
                       if (listExtras.size() >= 2)
                           B1.setAdditional2(listExtras.get(1));
                       if (listExtras.size() >= 3)
                           B1.setAdditional3(listExtras.get(2));
                       if (listExtras.size() >= 4)
                           B1.setAdditional4(listExtras.get(3));
                   }
                   break;

               case 102:
                   SpicyMayoBurger B2 = new SpicyMayoBurger();
                   System.out.println("\nChoose Your Extras for Spicy Mayo Burger");
                   menu.Extra();
                   System.out.println("Would You like to choose Extra (y/n): ");
                   ch = Scan.next().charAt(0);
                   if (ch == 'y' || ch == 'Y') {
                       listExtras.clear();
                       listExtras = takeOrder();
                        listBurgers.addAll(listExtras);
                       if (listExtras.size() >= 1)
                           B2.setAdditional3(listExtras.get(0));
                       if (listExtras.size() >= 2)
                           B2.setAdditional4(listExtras.get(1));
                   }
                   break;

               case 103:
                   CheesyBurger B3 = new CheesyBurger();
                   System.out.println("\nChoose Your Extras for Cheesy Burger");
                   menu.Extra();
                   System.out.println("Would You like to choose Extra (y/n): ");
                   ch = Scan.next().charAt(0);
                   if (ch == 'y' || ch == 'Y') {
                       listExtras.clear();
                       listExtras = takeOrder();
                        listBurgers.addAll(listExtras);
                       if (listExtras.size() >= 1)
                           B3.setAdditional2(listExtras.get(0));
                       if (listExtras.size() >= 2)
                           B3.setAdditional3(listExtras.get(1));
                       if (listExtras.size() >= 3)
                           B3.setAdditional4(listExtras.get(2));
                   }
                   break;

               case 104:
                   CheesePaneerBurger B4 = new CheesePaneerBurger();
                   System.out.println("\nChoose Your Extras for Cheese Paneer Burger");
                   menu.Extra();
                   System.out.println("Would You like to choose Extra (y/n): ");
                   ch = Scan.next().charAt(0);
                   if (ch == 'y' || ch == 'Y') {
                       listExtras.clear();
                       listExtras = takeOrder();
                        listBurgers.addAll(listExtras);
                       if (listExtras.size() >= 1)
                           B4.setAdditional3(listExtras.get(0));
                       if (listExtras.size() >= 2)
                           B4.setAdditional4(listExtras.get(1));
                   }
                   break;

               case 105:
                   BadaCombo B5 = new BadaCombo();
                   break;

               case 106:
                   MegaCombo B6 = new MegaCombo();
                   break;
           }
       }
       System.out.println("\n\n Drinks:-");
       menu.Additional();
       System.out.println("Would You like to choose Drinks/Fries (y/n): ");
       ch = Scan.next().charAt(0);
       if(ch=='y'||ch=='Y')
           listAdditionals = takeOrder();
   }
//--------------------------------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        while(true) {
            listBurgers.clear();
            menu.Burger();
            System.out.println("\n");
            listBurgers = takeOrder();
            placeOrder();
            BillClass.Bill(listBurgers, listAdditionals);

            System.out.print("\n\n\nNEXT ORDER-> (y/n):  ");
            char ch = Scan.next().charAt(0);
            if(ch!='y'&& ch!='Y')
                break;
        }
    }
}
//--------------------------------------------------------------------------------------
