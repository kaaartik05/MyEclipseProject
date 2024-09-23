package abstractFactory;

public class ThemeFactoryDemo {
    public static void main(String[] args) {
        // Web Application Theme Factory
        AbstractThemeFactory webFactory = new WebThemeFactory();
        Theme webLightTheme = webFactory.createLightTheme();
        Theme webDarkTheme = webFactory.createDarkTheme();

        // Apply Web Themes
        System.out.println("Web Application Themes:");
        webLightTheme.applyTheme();
        webDarkTheme.applyTheme();

        // Desktop Application Theme Factory
        AbstractThemeFactory desktopFactory = new DesktopThemeFactory();
        Theme desktopLightTheme = desktopFactory.createLightTheme();
        Theme desktopDarkTheme = desktopFactory.createDarkTheme();

        // Apply Desktop Themes
        System.out.println("\nDesktop Application Themes:");
        desktopLightTheme.applyTheme();
        desktopDarkTheme.applyTheme();
    }
}

