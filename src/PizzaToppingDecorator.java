abstract class PizzaToppingDecorator implements Pizza{

    protected Pizza tempPizza;

    public PizzaToppingDecorator(Pizza newPizza){

        tempPizza = newPizza;

    }

    public String getDescription() {

        return tempPizza.getDescription();
    }

    public Double getCost() {

        return tempPizza.getCost();

    }

}
