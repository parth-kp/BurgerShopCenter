import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;

class BillClass {
    static  File myFile = new File("Bill.txt");
    static{
        myFile.delete();
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("File Opening Error");
        }
    }

    static FileWriter fileWriter1;
    static FileWriter fileWriter2;


    static void Bill(ArrayList<Integer> listBurgers,ArrayList<Integer> listAdditionals){
        try {
            Date date = new Date();
            fileWriter1 = new FileWriter("Bill.txt");
            System.out.println("  *+------------------------------------------+*");
            fileWriter1.write("  *+------------------------------------------+*\n");
            System.out.println("                     YOUR BILL");
            fileWriter1.write("                     YOUR BILL\n");
            System.out.println("                 SUPER BURGER KING");
            fileWriter1.write("                 SUPER BURGER KING\n");
            System.out.println("  *+------------------------------------------+*");
            fileWriter1.write("  *+------------------------------------------+*\n");
            double total=0.0;
            System.out.println("\n DATE : " + date.toString());
            fileWriter1.write("\n DATE : " + date.toString());
            System.out.printf("\n %-6s| %-24s |%-5s","ID NO.","Item Name","Price");
            fileWriter1.write("\n ID NO.| Item Name                |Price");
            System.out.printf("\n --------------------------------------");
            fileWriter1.write("\n --------------------------------------");

            for (int i=0; i<listBurgers.size();i++)
            {
                total += getBill(listBurgers.get(i));
            }
            for (int i=0; i<listAdditionals.size();i++)
            {
                total += getBill(listAdditionals.get(i));
            }
            System.out.printf("\n --------------------------------------");
            fileWriter1.write("\n --------------------------------------");
            System.out.printf("\n TOTAL------------------------------> Rs."+ String.format("%.2f",total));
            fileWriter1.write("\n TOTAL------------------------------> Rs."+ String.format("%.2f",total));
            fileWriter1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static double getBill(int id){
        try {
            fileWriter2 = new FileWriter("Bill.txt");
            switch (id){
                case 101:
                    System.out.printf("\n %-6s| %-24s |%-5s","101","Aloo Tikki Burger","60.00");
                    fileWriter1.write("\n  101  | Aaloo Tikki Burger       |60");
                    fileWriter2.close();
                    return 60.00;
                case 102:
                    System.out.printf("\n %-6s| %-24s |%-5s","102","Spicy Mayo Burger","85.00");
                    fileWriter1.write("\n  102  | Spicy Mayo Burger        |85");
                    fileWriter2.close();
                    return 85.00;
                case 103:
                    System.out.printf("\n %-6s| %-24s |%-5s","103","Chessy Burger","85.00");
                    fileWriter1.write("\n  103  | Chessy Burger            |85");
                    fileWriter2.close();
                    return 85.00;
                case 104:
                    System.out.printf("\n %-6s| %-24s |%-5s","104","Cheese Paneer Burger","100.00");
                    fileWriter1.write("\n  104  | Cheese Paneer Burger     |100");
                    fileWriter2.close();
                    return 100.00;
                case 105:
                    System.out.printf("\n %-6s| %-24s |%-5s","105","Bada Combo","140.00");
                    fileWriter1.write("\n  105  | Bada Combo               |140");
                    fileWriter2.close();
                    return 140.00;
                case 106:
                    System.out.printf("\n %-6s| %-24s |%-5s","106","Mega Combo","160.00");
                    fileWriter1.write("\n  106  | Mega Combo               |160");
                    fileWriter2.close();
                    return 160.00;

                case 201:
                    System.out.printf("\n %-6s| %-24s |%-5s","201","Extra Cheese","30.00");
                    fileWriter1.write("\n  201  | Extra Cheese             |30");
                    fileWriter2.close();
                    return 30.00;
                case 202:
                    System.out.printf("\n %-6s| %-24s |%-5s","202","Extra Tikki","35.00");
                    fileWriter1.write("\n  202  | Extra Tikki              |35");
                    fileWriter2.close();
                    return 35.00;
                case 203:
                    System.out.printf("\n %-6s| %-24s |%-5s","203","Extra Veggies","30.00");
                    fileWriter1.write("\n  203  | Extra Veggies            |30");
                    fileWriter2.close();
                    return 30.00;
                case 204:
                    System.out.printf("\n %-6s| %-24s |%-5s","204","Extra Mayonnaise","25.00");
                    fileWriter1.write("\n  204  | Extra Mayonnaise         |25");
                    fileWriter2.close();
                    return 25.00;
                case 205:
                    System.out.printf("\n %-6s| %-24s |%-5s","205","Extra Peri-Peri","25.00");
                    fileWriter1.write("\n  205  | Extra Periperi           |25");
                    fileWriter2.close();
                    return 25.00;

                case 301:
                    System.out.printf("\n %-6s| %-24s |%-5s","301","Coke","70.00");
                    fileWriter1.write("\n  301  | Coke                     |70");
                    fileWriter2.close();
                    return 70.00;
                case 302:
                    System.out.printf("\n %-6s| %-24s |%-5s","302","Cold Coffee","65.00");
                    fileWriter1.write("\n  302  | Cold Coffee              |65");
                    fileWriter2.close();
                    return 65.00;
                case 303:
                    System.out.printf("\n %-6s| %-24s |%-5s","303","Water","25.00");
                    fileWriter1.write("\n  303  | Water                    |25");
                    fileWriter2.close();
                    return 25.00;
                case 304:
                    System.out.printf("\n %-6s| %-24s |%-5s","04","Ice Cream","55.00");
                    fileWriter1.write("\n  304  | Ice-Cream                |55");
                    fileWriter2.close();
                    return 55.00;
                case 305:
                    System.out.printf("\n %-6s| %-24s |%-5s","305","Shake","80.00");
                    fileWriter1.write("\n  305  | Shake                    |80 ");
                    fileWriter2.close();
                    return 80.00;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0.0;
    }
}



