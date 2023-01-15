import javax.swing.*;
import java.awt.*;

public class Main {
    private JFrame mainframe;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;

    private JButton button9;
    private JButton button10;


    private JPanel borderCenter;
    private JLabel label;


    public static void main(String[] args){
        Main m = new Main();

    }

    public Main(){
        prepareGUI();
    }

    private void prepareGUI()
    {
        mainframe = new JFrame("Example with border inside grid layout");
        mainframe.setSize(700, 600);
        mainframe.setLayout(new GridLayout(3, 3));

        borderCenter = new JPanel();
        borderCenter.setLayout(new BorderLayout());



        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");
        button6 = new JButton("button 6");
        button7 = new JButton("button 7");
        button8 = new JButton("button 8");
        button9 = new JButton("button 9");
        button10 = new JButton("button 10");



        label = new JLabel("label", SwingConstants.CENTER);

        borderCenter.add(label, BorderLayout.CENTER);
        borderCenter.add(button9, BorderLayout.EAST);
        borderCenter.add(button10, BorderLayout.SOUTH);


        mainframe.add(button1);
        mainframe.add(button2);

        mainframe.add(button3);

        mainframe.add(button4);
        mainframe.add(borderCenter);
        mainframe.add(button5);
        mainframe.add(button6);
        mainframe.add(button7);
        mainframe.add(button8);

        mainframe.setVisible(true);



    }
}
