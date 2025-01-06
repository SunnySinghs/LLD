package Behavioral.Momento;

public class ConfigurationOriginator {
    private int height;
    private int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMomento createMomento() {
        return new ConfigurationMomento(height, width);
    }

    public void restoreMomento(ConfigurationMomento momentoToBeRestored) {
        this.height = momentoToBeRestored.getHeight();
        this.width = momentoToBeRestored.getWidth();
    }
}
