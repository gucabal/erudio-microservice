package br.com.erudio.foo;

public class Math {

    private final long id;
    private final String content;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Math(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
