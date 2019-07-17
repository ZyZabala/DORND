package dornd;
public class money {
    int value;
    String label;
    boolean isOpen;
    boolean chosen;
    int container;
    public money() {
        value=0;
        label="";
        isOpen=false;
        container=0;
        chosen = false;
    }
    public void close() {
        isOpen = false;
    }
    public void open() {
        isOpen = true;
    }
}
