import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;

public class WriterInfo extends Product {
    //อ่านไฟล์
    private File[] listBill;

    public void setListBill(File[] listBill) {
        this.listBill = listBill;
    }

    public File[] getListBill() {
        return listBill;
    }

    public void calListBill() {
        File folder = new File("Bill\\");
        listBill = folder.listFiles();
    }
//อ่านไฟล์

//เขียนไฟล์
    public void calSaveBill() throws IOException {
        File folder = new File("Bill\\");
        File[] listFile = folder.listFiles();
        FileWriter writer = new FileWriter("Bill\\Bill" + (listFile.length + 1) + ".txt");
        writer.append("-----------------------------------------------------");
        writer.append("\n");
        writer.append("                 Blue Eye IT               ");
        writer.append("\n");
        writer.append("-----------------------------------------------------");
        writer.append("\n");
        writer.append(String.valueOf(formattedDate));
        writer.append("\n");
        writer.append(Brand);
        writer.append("\n");
        writer.append(Name);
        writer.append("\n");
        writer.append(Type);
        writer.append("\n");
        writer.append(color);
        writer.append("\n");
        writer.append(String.valueOf(Price));
        writer.append("\n");
        writer.append(String.valueOf(inputPriceToCustomer));
        writer.append("\n");
        writer.append(String.valueOf(inputPriceToCustomer - Price));
        writer.append("\n");
        writer.append("-----------------------------------------------------");
        writer.flush();
        writer.close();
    }
//เขียนไฟล์

    public void readBill(String array) throws IOException {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(new FileInputStream("Bill\\"+array), "UTF8"));
        System.out.println(inputStream.readLine());
        System.out.println(inputStream.readLine());
        System.out.println(inputStream.readLine());
        System.out.println("วันที่ : " + inputStream.readLine());
        System.out.println("ยี่ห้อ : " + inputStream.readLine());
        System.out.println("ชื่อสินค้า : " + inputStream.readLine());
        System.out.println("ประเภทสินค้า : " + inputStream.readLine());
        System.out.println("สี : " + inputStream.readLine());
        System.out.println("ราคา : $" +inputStream.readLine());
        System.out.println("เงินที่ได้รับ : $" +inputStream.readLine());
        System.out.println("เงินทอน : $" +inputStream.readLine());
        System.out.println(inputStream.readLine());
    }
}