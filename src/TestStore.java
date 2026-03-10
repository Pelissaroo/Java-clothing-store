import Domain.Category;
import Domain.Product;
import Domain.ProductVariations;

public class TestStore {
    public static void main(String[] args) {

        Product product1 = new Product("Oversized shirt", Category.SHIRT);
        Product product2 = new Product("Cargo pants", Category.PANTS);
        Product product3 = new Product("Hoodie", Category.HOODIE);
        Product product4 = new Product("Shorts", Category.SHORTS);

        ProductVariations variationShirt1 = new ProductVariations("White", 'M', 79.90, 2);
        ProductVariations variationShirt2 = new ProductVariations("Black", 'P', 79.90, 2);
        ProductVariations variationShirt3 = new ProductVariations("Gray", 'G', 79.90, 2);

        product1.addVariation(variationShirt1);
        product1.addVariation(variationShirt2);
        product1.addVariation(variationShirt3);

        ProductVariations variationPants1 = new ProductVariations("Black", 'P', 159.49, 2);
        ProductVariations variationPants2 = new ProductVariations("White", 'M', 159.49, 2);
        ProductVariations variationPants3 = new ProductVariations("Brown", 'G', 159.49, 2);

        product2.addVariation(variationPants1);
        product2.addVariation(variationPants2);
        product2.addVariation(variationPants3);
    }
}
