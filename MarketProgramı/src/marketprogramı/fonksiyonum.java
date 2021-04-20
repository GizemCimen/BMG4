
package marketprogramı;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author gizem
 */
public class fonksiyonum {
    public ImageIcon resizeResim (String path, int genislik, int yukseklik){
        ImageIcon icon =null;
        if(path != null){
            icon = new ImageIcon(path);
         
        }
        Image i= icon.getImage().getScaledInstance(genislik, yukseklik, Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(i);
        
        return icon1;
                
    }
    public String resimUzanti (JLabel label ){
        String path = "";
        JFileChooser fileChooser;
        fileChooser = new JFileChooser("C:\\Users\\90545\\Desktop\\marketresimler");
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Resim","jpg","png","gif");
        fileChooser.addChoosableFileFilter(filter);
        
        int a = fileChooser.showSaveDialog(null);
        if (a == JFileChooser.APPROVE_OPTION){
            File secilen = fileChooser.getSelectedFile();
            path = secilen.getAbsolutePath();
            
            label.setIcon(resizeResim(path, label.getWidth(), label.getHeight()));
            
        }
        return path;
    }

   
    
}
