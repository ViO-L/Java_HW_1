public class Icecream extends Product {



    private String taste;
    private double weight;

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public String getTaste() {
        return taste.toLowerCase();
    }

    public Icecream(String brand, String name, double price, String taste, double weight){
        super(brand, name, price);
        this.taste = taste;
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("Мороженое\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n" + //
                "\tНаименование: %s \n\tВес: %.2f]",
                brand, name, price, taste,weight);
    }




}