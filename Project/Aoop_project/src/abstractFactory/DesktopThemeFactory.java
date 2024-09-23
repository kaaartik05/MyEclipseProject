package abstractFactory;

public class DesktopThemeFactory implements AbstractThemeFactory {
    @Override
    public Theme createLightTheme() {
        return new LightTheme();
    }

    @Override
    public Theme createDarkTheme() {
        return new DarkTheme();
    }
}
