import Web.Handler;

/**
 * Created by snake on 14-11-24.
 */
public class IndexHandler extends Handler {
    public void get() {
        this.writer("Hello World!");
    }
}
