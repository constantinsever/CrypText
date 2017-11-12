
package cryptext;

import java.awt.Dimension;
import java.awt.Toolkit;


public class Cryptext {

  
    public static void main(String[] args) {
        main_window mw = new main_window();
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
         int x = (int) ((dimension.getWidth() - mw.getWidth()) / 2);
         int y = (int) ((dimension.getHeight() - mw.getHeight()) / 2);
         mw.setLocation(x, y);
        mw.setVisible(true);
    }
    
}
