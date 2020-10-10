package net.therunninghub.generator.pdf;

import java.util.List;

public class FileData {
    List<TextOption> textOptions;

    public FileData(List<TextOption> textOptions) {
        this.textOptions = textOptions;
    }

    public List<TextOption> getTextOptions() {
        return textOptions;
    }
}
