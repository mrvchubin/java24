package Elements;

public class Main {
    public static void identifyElement(IElement element) {
        System.out.println(element.getElementName());
    }
    public static void main(String[] args) {
        River nil = new River();
        Wind elNinjo = new Wind();
        Main.identifyElement(nil);
        Main.identifyElement(elNinjo);
    }
}
