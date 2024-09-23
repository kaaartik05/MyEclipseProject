package abstractFactory;

public class WebThemeFactory implements AbstractThemeFactory {
    @Override
    public Theme createLightTheme() {
        return new LightTheme();
    }

    @Override
    public Theme createDarkTheme() {
        return new DarkTheme();
    }
}

