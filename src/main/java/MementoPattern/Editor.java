package MementoPattern;

import java.util.List;

public class Editor {
    private String content;
    private List<String> previousContents;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void undo() {

    }
}
