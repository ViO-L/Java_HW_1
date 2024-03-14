import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Product  product1 = new Product("Brand #1", "Name #1", 350);
        System.out.println(product1.displayInfo());

        // product1.setPrice(-1400);
        // product1.setName("~");
        // System.out.println(product1.displayInfo());



        Icecream ice1 = new Icecream("Brand #2", "Name #2", 150, "клубника",0.1);
        // System.out.println(ice1.displayInfo());
        Icecream ice2 = new Icecream("Brand #2", "Name #3", 150, "шоколад",0.1);
        // System.out.println(ice2.displayInfo());        


         Product bottleOfWater2 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        // System.out.println(bottleOfWater2.displayInfo());

        // BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        // System.out.println(bottleOfMilk1.displayInfo());

         Product bottleOfMilk2 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        //System.out.println(bottleOfMilk2 System.out.println("Вы купили: "););

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(ice1);
        list.add(ice2);       

        // list.add(bottleOfMilk2);
        // list.add(bottleOfWater2);
        list.add(new BottleOfMilk("Brand #4", "Name #5", 310, 0.33, 1));

        VendingMachine vendingMachine = new VendingMachine(list);
        System.out.println("-------------------Исходный список------------------- ");
        vendingMachine.ProductList(list);
        vendingMachine.MixIcecream(ice1, ice2);
        System.out.println("-------------------Новый список------------------- ");
        vendingMachine.ProductList(list);

        System.out.println("-------------------Покупка------------------- ");
        Icecream IceRes =  vendingMachine.getIcecream("Name #3", "клубника+шоколад");
        if (IceRes != null){
            System.out.println("Вы купили: ");
            System.out.println(IceRes.displayInfo());
        }
        else {
            System.out.println("Мороженного с таким названием и вкусом нет в автомате.");
        }

        // BottleOfWater bottleOfWaterRes =  vendingMachine.getBottleOfWater("Name #2", 1.5);
        // if (bottleOfWaterRes != null){
        //     System.out.println("Вы купили: ");
        //     System.out.println(bottleOfWaterRes.displayInfo());
        // }
        // else {
        //     System.out.println("Такой бутылки с водой нет в автомате.");
        // }



    }

}