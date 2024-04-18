import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 
public class Product {
    protected String Name;
    protected String Brand;
    protected String color;
    protected String Type;
    protected double Price; 
    protected double inputPriceToCustomer;
    protected double sum;

    // Method
    public void setsum(double sum){
        this.sum=sum;
    }
    
    public double getsum() {
        return inputPriceToCustomer-Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public double getPrice() {
        return Price;
    }
    public void setInputPriceToCustomer(double inputPriceToCustomer) {
        this.inputPriceToCustomer = inputPriceToCustomer;
    }
    public double getInputPriceToCustomer() {
        return inputPriceToCustomer;
    }


    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getBrand() {
        return Brand;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getcolor() {
        return color;
    }

    LocalDateTime myDateObj = LocalDateTime.now();  
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formattedDate = myDateObj.format(myFormatObj);  

    public void shownzxt() {
        System.out.println("-----------------------------------------------------");
        System.out.println("                   รายการบอกชำระลูกค้า                 ");
        System.out.println("-----------------------------------------------------");
        System.out.println("Brand : " + getBrand());
        System.out.println("Name : " + getName());
        System.out.println("Type : " + getType());
        System.out.println("Color : " + getcolor());
        System.out.println("Price : $" + getPrice());
        System.out.println("-----------------------------------------------------");
    }

    public void showbill() {
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("                          Bill                       ");
        System.out.println("-----------------------------------------------------");
        System.out.println("Date exchange: " + formattedDate); 
        System.out.println("ยี่ห้อ : " + getBrand());
        System.out.println("ชื่อ : " + getName());
        System.out.println("ประเภท : " + getType());
        System.out.println("สี : " + getcolor());
        System.out.println("ราคาสินค้า : $" + getPrice());
        System.out.println("รับเงินมา : $" + getInputPriceToCustomer());
        System.out.println("เงินทอน : $" + getsum());
        System.out.println("-----------------------------------------------------");
        System.out.println("");
    }

    public void addPrice(double Price) {
        this.Price += Price;
    }





}
