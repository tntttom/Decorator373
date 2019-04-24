public class Sausage extends PizzaToppingDecorator{

    public Sausage(Pizza newPizza){

        super(newPizza);
        System.out.println("Adding some sausage");


    }

    public String getDescription() {

        return tempPizza.getDescription() + ", sausage";

    }

    public Double getCost() {

        System.out.println("Cost of sausage is " + 1.50);

        return tempPizza.getCost() + 1.50;

    }

}
