public class Trouser1 {
    public static void main(String [] args){
       Hanger1 hanger = new Hanger1();
       hanger.setButtons(Hanger1.Structure.Color);
       Hanger1.Structure ty = hanger.getButtons();

       System.out.println("They are "+ ty);
    }
}
