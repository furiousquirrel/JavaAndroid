package lesson3.bears;
import lesson3.Status;

public class WhiteBear extends Bear {
    public WhiteBear( String name) {
        super("Белый медвед", name);
    }

    @Override
    public void talk() {
        if(getState()!= Status.DIE) {
            System.out.println("Мяу");
        }
    }
}
