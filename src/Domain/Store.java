package Domain;

import java.util.ArrayList;

public class Store {

    private ArrayList<ProductVariations> products = new ArrayList<>();

    public void listAllProducts (){
        for (ProductVariations p : products){
            System.out.println("Color : " + p.getColor());
            System.out.println("Size : " + p.getSize());
            System.out.println("Price : " + p.getPrice());
            System.out.println("Avaliable : " + p.getStockQuantity());
            System.out.println("--------------");
        }
    }

}
