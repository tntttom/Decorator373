public class PizzaMaker {

    public static void main(String[] args) {

        Pizza sausagePizza = new Sausage(new Cheese(new PlainPizza()));

        System.out.println("The sausage pizza contains: " + sausagePizza.getDescription());
        System.out.println("The cost of this pizza is: " + sausagePizza.getCost());

    }
}
