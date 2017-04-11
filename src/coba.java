import javax.swing.*;

/**
 * Created by lenovo on 4/12/2017.
 */
public class coba {


    /**
     * Created by lenovo on 4/12/2017.
     */

        public static void main(String[] args){
            JFrame frame = new JFrame("HellloWorldSwing");
            final JLabel label = new JLabel("Hello World");
            frame.getContentPane().add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            Object[] opt = {"Yes","No","Cancel"};

            int n = JOptionPane.showOptionDialog(frame,"JAKI BEBAN ANJENG", "beban",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null,opt, opt[2]);
        }
    }

