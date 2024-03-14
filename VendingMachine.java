import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume)
                    return bottleOfWater;
            }
        }
        return null;
    }
    public void MixIcecream(Icecream ice1, Icecream ice2)
    {
        String newtaste = ice1.getTaste()+"+"+ice2.getTaste();
        ice1.setTaste(newtaste);
        ice2.setTaste(newtaste);
    }

    public void ProductList(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.displayInfo());
        }
    }

    public Icecream getIcecream(String name, String taste){
        for (Product product : products){
            if (product instanceof Icecream){
                Icecream ice = (Icecream)product;
                if (ice.getName().equals(name) && ice.getTaste().equals(taste.toLowerCase()))
                    return ice;
            }
        }
        return null;
    }


}