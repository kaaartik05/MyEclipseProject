package abstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThemeFactory {

    @Test
    public void testWebLightTheme() {
        AbstractThemeFactory factory = new WebThemeFactory();
        Theme theme = factory.createLightTheme();
        assertTrue(theme instanceof LightTheme, "Web factory should produce LightTheme.");
    }

    @Test
    public void testWebDarkTheme() {
        AbstractThemeFactory factory = new WebThemeFactory();
        Theme theme = factory.createDarkTheme();
        assertTrue(theme instanceof DarkTheme, "Web factory should produce DarkTheme.");
    }

    @Test
    public void testDesktopLightTheme() {
        AbstractThemeFactory factory = new DesktopThemeFactory();
        Theme theme = factory.createLightTheme();
        assertTrue(theme instanceof LightTheme, "Desktop factory should produce LightTheme.");
    }

    @Test
    public void testDesktopDarkTheme() {
        AbstractThemeFactory factory = new DesktopThemeFactory();
        Theme theme = factory.createDarkTheme();
        assertTrue(theme instanceof DarkTheme, "Desktop factory should produce DarkTheme.");
    }
}
