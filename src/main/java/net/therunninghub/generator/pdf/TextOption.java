package net.therunninghub.generator.pdf;

import java.awt.*;

public class TextOption {
    private final String fieldName;
    private final String text;
    private final Color textColor;
    private final String textAlign;

    public TextOption(String fieldName, String text, Color textColor, String textAlign) {
        this.fieldName = fieldName;
        this.text = text;
        this.textColor = textColor;
        this.textAlign = textAlign;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getText() {
        return text;
    }

    public Color getTextColor() {
        return textColor;
    }

    public String getTextAlign() {
        return textAlign;
    }
}
