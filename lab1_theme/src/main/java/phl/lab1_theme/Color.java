package phl.lab1_theme;

public class Color {
    private String frontColor;
    private String backgroundColor;
    private Long id;

    public Color(String frontColor, String backgroundColor, Long id) {
        this.frontColor = frontColor;
        this.backgroundColor = backgroundColor;
        this.id = id;
    }

    public String getFrontColor() {
        return frontColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public Long getId() {
        return id;
    }
}
