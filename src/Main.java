import studentList.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "Laptop", "Electronics", "10000"));
        productList.add(new Product(2, "Cellphone", "Electronics", "5000"));
        productList.add(new Product(3, "Tshirt", "Clothes", "100"));
        productList.add(new Product(4, "AirJordan", "BSIT4B", "200"));



        for(int i=0; i < productList.size(); i++){
            productList.get(i).getAll();
        }

    }
}
