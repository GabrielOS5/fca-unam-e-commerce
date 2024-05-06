package mx.com.fca.unam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mx.com.fca.unam.model.Product;
import mx.com.fca.unam.view.ECommerceView1;

public class Application {

    
    public static void main(String[] args) {
        ECommerceView1 view = new ECommerceView1();
        view.setVisible(true);
        //printProducts();
    }
    
    private static void printProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(3, "1234567890123", "Refresco", 32.00, "Pieza"));
        products.add(new Product(1, "1234567890124", "Arroz", 9.99, "Kilogramo"));
        products.add(new Product(2, "1234567890126", "Suavitel", 14.99, "Pieza"));
        products.add(new Product(4, "1234567890129", "Zote", 25.99, "Pieza"));
        products.add(new Product(9, "1234567890121", "Frijol", 12.50, "Kilogramo"));
        
        System.out.println("Lista ANTES de ser ordenada");
        products.stream().forEach(System.out::println);
        
        Collections.sort(products);
        
        System.out.println("\nLista DESPUES de ser ordenada");
        products.stream().forEach(System.out::println);
        
        products.stream().sorted().forEach(System.out::println);
        
        System.out.println("\nLista ordenada por PRECIO de manera ASCENDENTE");
        products.stream()
                .sorted((productA, productB) -> productA.getPrice().compareTo(productB.getPrice()))
                .forEach(System.out::println);
        
        System.out.println("\nLista ordenada por PRECIO de manera DESCENDENTE");
        products.stream()
                .sorted((productA, productB) -> productB.getPrice().compareTo(productA.getPrice()))
                .forEach(System.out::println);
    }
    
}
