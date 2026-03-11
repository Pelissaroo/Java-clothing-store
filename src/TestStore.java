import Domain.Category;
import Domain.Product;
import Domain.ProductVariation;
import Domain.Store;

public class TestStore {
    public static void main(String[] args) {

        Store store = new Store();

        Product shirt = new Product("Oversized shirt", Category.SHIRT);
        Product cargoPants = new Product("Cargo pants", Category.PANTS);
        Product hoodie = new Product("Hoodie", Category.HOODIE);
        Product shorts = new Product("Shorts", Category.SHORTS);

        ProductVariation shirtM = new ProductVariation("White", 'M', 79.90, 5);
        ProductVariation shirtP = new ProductVariation("Black", 'P', 79.90, 2);
        ProductVariation shirtG = new ProductVariation("Gray", 'G', 79.90, 4);

        shirt.addVariation(shirtM);
        shirt.addVariation(shirtP);
        shirt.addVariation(shirtG);

        ProductVariation pantsP = new ProductVariation("Black", 'P', 159.49, 2);
        ProductVariation pantsM = new ProductVariation("White", 'M', 159.49, 4);
        ProductVariation pantsG = new ProductVariation("Brown", 'G', 159.49, 1);

       cargoPants.addVariation(pantsP);
       cargoPants.addVariation(pantsM);
       cargoPants.addVariation(pantsG);

       ProductVariation hoodieP = new ProductVariation("Red", 'P', 179.99, 3);
       ProductVariation hoodieM = new ProductVariation("Blue", 'M', 179.99, 4);
       ProductVariation hoodieG = new ProductVariation("Black", 'G', 198.99, 7);

       hoodie.addVariation(hoodieP);
       hoodie.addVariation(hoodieM);
       hoodie.addVariation(hoodieG);

       ProductVariation shortsP = new ProductVariation("Black", 'P', 69.90, 6);
       ProductVariation shortsM = new ProductVariation("Blue", 'M', 69.90, 4);
       ProductVariation shortsG = new ProductVariation("Green", 'G', 69.90, 3);

       shorts.addVariation(shortsP);
       shorts.addVariation(shortsM);
       shorts.addVariation(shortsG);

       store.addProduct(shirt);
        store.addProduct(cargoPants);
        store.addProduct(hoodie);
        store.addProduct(shorts);

       store.listAllProducts();

    }
}
