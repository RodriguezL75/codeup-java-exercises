public class BurgerTester {


    public static void main(String[] args) {
    BurgerTools Tools = new BurgerTools();

    Tools.mostPopularTopping = "cheese";
    Tools.averageDaysBeforeExpiration = 5;
    Tools.temperatureWhenCooked = 180;

        System.out.println(Tools.mostPopularTopping);
        System.out.println(Tools.averageDaysBeforeExpiration);
        System.out.println(Tools.temperatureWhenCooked);

        System.out.println("grilling");


    }

}
