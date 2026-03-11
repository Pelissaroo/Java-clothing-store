package Domain;


public class ProductVariation {

    private String color;
    private char size;
    private double price;
    private int stockQuantity;

    public ProductVariation(String color, char size, double price, int stockQuantity){
        this.color = color;
        this.size = size;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setSize (char size){
        this.size = size;
    }

    public void setStockQuantity (int stockQuantity){
        this.stockQuantity = stockQuantity;
    }

    public void setPrice (double price){
        this.price = price;
    }

    public String getColor (){
        return color;
    }

    public char getSize(){
        return size;
    }

    public double getPrice(){
        return price;
    }

    public int getStockQuantity(){
        return stockQuantity;
    }

}
