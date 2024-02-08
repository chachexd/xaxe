package clases;

public class texto {
    int maximoCaractertes = 40;
    static String text;

    texto(String text) {
        setText(text);
    }
    public void setText(String text) {
        if(text.length() <= 40 ){
            this.text = text;
        }

    }
    public String getText(String text) {

        return this.text;
    }
}
