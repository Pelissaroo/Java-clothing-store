package Domain;

import java.util.ArrayList;

public class Product {
        private static int nextID = 1;
        private String name;
        private int id;
        private Category category;
        private ArrayList<ProductVariations> productVariations = new ArrayList<>();

        public Product (String name, Category category){
        this.id = nextID;
        nextID++;

        this.name = name;
        this.category = category;
    }

        public int getId (){
            return id;
        }

        public String getName(){
            return name;
        }

        public void addVariation(ProductVariations variations) {
            productVariations.add(variations);
        }

        public void showInfo (){
            System.out.println("Name : " + this.name);

            for (ProductVariations variation : productVariations) {
                System.out.println("Color : " + variation.getColor());
                System.out.println("Size : " + variation.getSize());
                System.out.println("Price : " + variation.getPrice());
                System.out.println("Avaliable : " + variation.getStockQuantity());
                System.out.println("--------------");
            }
        }



}
