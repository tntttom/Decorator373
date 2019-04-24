public class PlainPizza implements Pizza {

    public String getDescription(){

        return "Normal Dough";
    }

    public Double getCost() {


        System.out.println("Cost of normal dough is " + 4.00);
        return 4.00;

    }
}
