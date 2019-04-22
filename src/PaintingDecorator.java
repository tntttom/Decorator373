abstract class PaintingDecorator implements Painting{

    protected Painting tempPainting;

    public PaintingDecorator(Painting newPainting){

        tempPainting = newPainting;

    }

    public String hang() {

        return tempPainting.hang();
    }
}
