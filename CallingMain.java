import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CallingMain {
    public static void main(String[] args) throws IOException {
        WriterInfo p1 = new WriterInfo();
        Scanner SM1 = new Scanner(System.in);
        int M1 = 0;
        int MenuB = 0;
        boolean c = true;
        double money;
        while (true) {
        System.out.println("----- รายการ -----");
        System.out.println("[1]  เคสคอมพิวเตอร์");
        System.out.println("[2]  ดูบิล");
        System.out.println("[0]  ออก");
        do  {
            try  {
                System.out.print("Enter Menu : ");
                Scanner kb1 = new Scanner(System.in);
                M1 = kb1.nextInt();
                c = false;
            } catch (Exception e) {
                System.out.println("");
                System.out.println("กรุณาระบุใหม่อีกครั้ง");
                System.out.println("");
            }
        } while (c);

        boolean c1 = true;
        if (M1 == 1) {
            System.out.println();
            System.out.println("----------------------------------------------------------------");
            System.out.println("     เลือกยี่ห้อของสินค้า     ");
            System.out.println("[1]  NZXT");
            System.out.println("[2]  CORSAIR");
            System.out.println("[0]  ออก");
            System.out.println("----------------------------------------------------------------");

            do {
                try {
                    System.out.print("Enter Menu : ");
                    Scanner kb2 = new Scanner(System.in);
                    MenuB = kb2.nextInt();
                    c1 = false;
                } catch (Exception e) {
                    System.out.println("");
                    System.out.println("กรุณาระบุใหม่อีกครั้ง");
                    System.out.println("");
                }
            } while (c1);

            boolean c2 = true;
            int menuPro = 0 ;
            if (MenuB == 1) {
                p1.setBrand("NZXT");
                p1.addPrice(1500);
                System.out.println();
                System.out.println("----------------------------------------------------------------");
                System.out.println("     รุ่นของสินค้า     ");
                System.out.println("[1]  NZXT H510 Matte");
                System.out.println("[2]  NZXT H5101 ");
                System.out.println("[3]  NZXT H710 Matte");
                System.out.println("[0]  ออก");
                System.out.println("----------------------------------------------------------------");
                do  {
                    try  {
                        System.out.print("Enter Menu : ");
                        Scanner kb3 = new Scanner(System.in);
                        menuPro = kb3.nextInt();
                        c2 = false;
                    } catch (Exception e) {
                        System.out.println("");
                        System.out.println("กรุณาระบุใหม่อีกครั้ง");
                        System.out.println("");
                    }
                } while (c2);

                if (menuPro == 1) {
                    p1.setName("NZXT H510 Matte");
                    p1.addPrice(500);
                } else if (menuPro == 2) {
                    p1.setName("NZXT H5101 ");
                    p1.addPrice(600);
                } else if (menuPro == 3) {
                    p1.setName("NZXT H710 Matte");
                    p1.addPrice(800);
                }

            }
            

            else if(MenuB == 2){
                p1.setBrand("CORSAIR");
                p1.addPrice(2200);
                System.out.println();
                System.out.println("----------------------------------------------------------------");
                System.out.println("     สินค้า     ");
                System.out.println("[1]  CORSAIR 175R RGB ");
                System.out.println("[2]  CORSAIR CARBIDE SERIES 678C ");
                System.out.println("[3]  CORSAIR 1000D ");
                System.out.println("[0]  ออก");
                System.out.println("----------------------------------------------------------------");
                if (menuPro == 1) {
                    p1.setName("CORSAIR 175R RGB");
                    p1.addPrice(500);
                } else if (menuPro == 2) {
                    p1.setName("CORSAIR CARBIDE SERIES 678C");
                    p1.addPrice(600);
                } else if (menuPro == 3) {
                    p1.setName("CORSAIR 1000D");
                    p1.addPrice(800);
                }
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------");
            System.out.println("     Type     ");
            System.out.println("[1]  Mini Tower");
            System.out.println("[2]  Full Tower");
            System.out.println("[0]  ออก");
            System.out.println("----------------------------------------------------------------");
            System.out.print("Enter Menu : ");
            int menuType = SM1.nextInt();
            if (menuType == 1) {
                p1.setType("MiniTower");
            } else if (menuType == 2) {
                p1.setType("FullTower");
                p1.addPrice(1000);
            }

            System.out.println();
            System.out.println("----------------------------------------------------------------");
            System.out.println("     Color     ");
            System.out.println("[1]  Black");
            System.out.println("[2]  While");
            System.out.println("[0]  ออก");
            System.out.println("----------------------------------------------------------------");
            System.out.print("Enter Menu : ");
            int menucolor = SM1.nextInt();
            if (menucolor == 1) {
                p1.setcolor("black");
            } else if (menucolor == 2) {
                p1.setcolor("While");
            }
            
                p1.shownzxt();
                System.out.print("รับเงิน : ");
                money=SM1.nextDouble();
                while (money< p1.Price) {
                    System.out.print("ระบุจำนวนเงินใหม่ : ");
                    money=SM1.nextDouble();
                }

                p1.setInputPriceToCustomer(money);
                p1.calSaveBill();
                p1.showbill();

            } 
            
        else if(M1 == 2){
            System.out.println(" ประวัติการซื้อ ");
            p1.calListBill();
            File[] array = p1.getListBill();
            for(int i = 0 ; i<array.length;i++){
                System.out.println("["+i+"] : "+array[i].getName());
            }
            System.out.print("Enter Menu : ");
            int menuBill = SM1.nextInt();
            String save = String.valueOf(array[menuBill].getName());
            p1.readBill(save);
        }

        else if(M1 == 0){
            System.out.println("End of Program"); 
            System.exit(0); 
        }

        }
    }
}
