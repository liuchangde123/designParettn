package designParettn.factory;

public class ColorFactory {
    public Color getColor(String colorType){
        if(colorType==null||colorType.trim().equals("")){
            return null;
        }else if ("red".equalsIgnoreCase(colorType)){
            return new RedColor();
        }else if ("green".equalsIgnoreCase(colorType)){
            return new GreenColor();
        }
        return null;
    }

    public static RedColor getRedColor(){
        return new RedColor();
    }
    public static GreenColor getGreenColor(){
        return new GreenColor();
    }
}
