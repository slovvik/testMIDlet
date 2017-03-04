import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class MyMIDlet extends MIDlet {

    private Display display;
    private TextBox textBox;

    public MyMIDlet() {
        this.display = Display.getDisplay(this);
        textBox = new TextBox("Dupa","dupa", 256, 0);
    }

    protected void destroyApp(boolean b) throws MIDletStateChangeException {

    }

    protected void pauseApp() {

    }

    protected void startApp() throws MIDletStateChangeException {
        display.setCurrent(textBox);
    }
}
