package abstractFactory;

public class DarkTheme implements Theme {
    @Override
    public void applyTheme() {
        System.out.println("Applying dark theme.");
    }
}