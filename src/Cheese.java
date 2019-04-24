public class Cheese extends PizzaToppingDecorator{

    public Cheese(Pizza newPizza){

        super(newPizza);
        System.out.println("Adding some cheese");


    }

    public String getDescription() {

        return tempPizza.getDescription() + ", cheese";

    }

    public Double getCost() {

        System.out.println("Cost of cheese is " + 0.50);

        return tempPizza.getCost() + 0.50;

    }

}
