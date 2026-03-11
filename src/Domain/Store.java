package Domain;

import java.util.ArrayList;

public class Store {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct (Product product){
        products.add(product);
    }

    public void listAllProducts (){
            for (Product product : products){
                product.showInfo();
            }
        }
    }
