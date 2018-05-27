
package Chat;

/**
 *
 * @author sithara
 * 2016372
 * w1654468
 */
public class Chat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
}
