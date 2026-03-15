package Application;

import Domain.Category;
import Domain.Product;
import Domain.ProductVariation;
import Domain.Store;

import java.util.Scanner;

public class StoreApp {
    Scanner read;
    Category selectedCategory;
    Store store;


    public StoreApp(Store store) {
        this.store = store;
    }

    public void start() {
        this.read = new Scanner(System.in);

        boolean running = true;

        while (running) {
            showCategoryMenu();
            break;
        }
    }

    public void showCategoryMenu() {
        System.out.println("Welcome to ShopClothes!");
        System.out.println("1 - Shirts");
        System.out.println("2 - Cargo Pants");
        System.out.println("3 - Hoodie");
        System.out.println("4 - Shorts");
        System.out.println("5 - List all Products");
        int choice = read.nextInt();


        switch (choice) {
            case 1:
                selectedCategory = Category.SHIRT;
                store.listByCategory(selectedCategory);
                break;
            case 2:
                selectedCategory = Category.PANTS;
                store.listByCategory(selectedCategory);
                break;
            case 3:
                selectedCategory = Category.HOODIE;
                store.listByCategory(selectedCategory);
                break;
            case 4:
                selectedCategory = Category.SHORTS;
                store.listByCategory(selectedCategory);
                break;
            case 5:
                store.listAllProducts();
        }
    }
}
