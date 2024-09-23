package abstractFactory;

public class LightTheme implements Theme {
    @Override
    public void applyTheme() {
        System.out.println("Applying light theme.");
    }
}