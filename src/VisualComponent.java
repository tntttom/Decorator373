public class VisualComponent {

    public static void main(String[] args) {

        Painting monaLisa = new Frame(new Matte(new PlainPainting()));

        System.out.println(monaLisa.hang());

    }
}
