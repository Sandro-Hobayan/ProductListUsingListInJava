

public class Product {

    private int id;
    private String product;
    private String category;
    private String prize;

    public Product(int id, String name, String section, String course){
        this.id = id;
        this.product = name;
        this.category = section;
        this.prize = course;
    }

    public Product(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProduct(){
        return product;
    }

    public void setProduct(String name) { this.product = name; }

    public String getCategory(){
        return category;
    }

    public void setCategory(String section){
        this.category = section;
    }


    public String getPrize(){
        return prize;
    }

    public void setPrize(String course) { this.prize = course; }


    public  void  getAll(){
        System.out.println("Product:" + product + ", Category: " + category + ", Prize: " + prize);
    }


}
