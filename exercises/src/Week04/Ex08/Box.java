package Ex08;

public class Box {
    private String content;
    // Create the Box class that has a String called content .
    public Box(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Box{" +
                "content='" + content + '\'' +
                '}';
    }
}
