public class Notice extends Prototype{

    @Override
    public Prototype clone() {
        return new Notice();
    }

    @Override
    public void information() {
        System.out.println("Notice");
    }

}
