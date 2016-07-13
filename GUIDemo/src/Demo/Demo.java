package Demo;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;

/**
 * Created by cerebro on 08/07/16.
 */
public class Demo implements ListModel<String> {

    public static void main(String[] args) {

        Abcd.randomFunction();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // start adding content

        SignUpFrom form = new SignUpFrom();

        frame.setContentPane(form.mainPanel);


        // content adding ended


        frame.pack();
        frame.setVisible(true);

        form.list1.setModel(new Demo());
    }

    @Override
    public int getSize() {
        return 500;
    }

    @Override
    public String getElementAt(int index) {
        return "codekamp";
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
}
