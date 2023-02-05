public class Hanger1 {
    private String Buttons;
    public String Tie ;
    private Collar cloth;
    public static enum Structure {Size, Shape, Color}
   private Structure model;

    public Hanger1(){

    }
    public void setButtons(Structure r){
      model = r;
    }
    public void setCloth(String e){ Buttons =e;}

    public Structure getButtons(){
        return model;
    }
}
