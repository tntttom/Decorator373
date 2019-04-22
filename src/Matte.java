public class Matte extends  PaintingDecorator{

    public Matte(Painting newPainting){

        super(newPainting);
        System.out.println("Adding Matte");


    }

    public String hang(){

        return tempPainting.hang() + " matte,";
    }
}
