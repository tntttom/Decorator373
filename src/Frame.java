public class Frame extends  PaintingDecorator{

    public Frame(Painting newPainting){

        super(newPainting);
        System.out.println("Adding a frame");


    }

    public String hang(){

        return tempPainting.hang() + " a frame,";
    }
}
