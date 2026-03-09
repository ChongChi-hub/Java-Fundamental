public class Main {
    static void main(String[] args) {
        Drink[] drinks = new Drink[3];

        drinks[0] = new Coffee("CF1", "Bac siu", 30000, true);
        drinks[1] = new FruitJuice("FJ1", "Nuoc cam", 40000, 10);
        drinks[2] = null;

        System.out.println("----- Hoa don quan ca phe -----");
        for (int i = 0; i < drinks.length; i++){
            if (drinks[i] != null) {
                System.out.println("Do uong thu " + (i + 1) );
                drinks[i].displayInfo();
                System.out.println("Thanh tien: " + drinks[i].calculatePrice() + " VND");
            } if (drinks[i] instanceof IMixable){
                IMixable mixableItem = (IMixable) drinks[i];
                mixableItem.mix();;
            }
        }
    }
}