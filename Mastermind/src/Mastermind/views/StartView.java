package views;

/**
 * StartView
 */
public class StartView extends View {


    public boolean isResumed() {
        console.out("Resume? (y/n):");
        if (console.inChar() == 'y') {
            return true;
        }
        return false;
    }
}
