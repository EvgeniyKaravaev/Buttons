
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random random = new Random();
        Color color = new Color(random.nextInt(125),
                random.nextInt(125),
                random.nextInt(125));
        Color color2 = new Color(random.nextInt(125),
                random.nextInt(125),
                random.nextInt(125));
        Color color3 = new Color(random.nextInt(125),
                random.nextInt(125),
                random.nextInt(125));

        JFrame fr = new JFrame("Buttons");
        fr.setSize(1000,600);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setLocation(150,50);
        fr.setLayout(new BorderLayout());

        JPanel pnTop = new JPanel();
        pnTop.setBorder(new EmptyBorder(20,0,0,0));
        JLabel lbTop = new JLabel("Нажмите на любую кнопку");
        lbTop.setFont(new Font("Arial",Font.BOLD,24));
        pnTop.add(lbTop);

        JPanel pnCentr = new JPanel();
        pnCentr.setBorder(new EmptyBorder(150,0,0,0));
        JButton bt1 = new JButton(" Click! ");
        JButton bt2 = new JButton(" Click! ");
        JButton bt3 = new JButton(" Click! ");
        bt1.addActionListener((e)->bt1.setVisible(false));
        bt2.addActionListener((e)->bt2.setVisible(false));
        bt3.addActionListener((e)->bt3.setVisible(false));
        bt1.setBackground(Color.RED);
        bt2.setBackground(Color.BLUE);
        bt3.setBackground(Color.GREEN);
        bt1.setFont(new Font("Arial",Font.BOLD,20));
        bt2.setFont(new Font("Arial",Font.BOLD,20));
        bt3.setFont(new Font("Arial",Font.BOLD,20));
        pnCentr.add(bt1);
        pnCentr.add(bt2);
        pnCentr.add(bt3);

        JPanel pnBottom = new JPanel();
        pnBottom.setBorder(new EmptyBorder(0,0,10,0));
        JButton bt4 = new JButton(" Click! ");
        JButton bt5 = new JButton(" Click! ");
        JButton bt6 = new JButton(" Click! ");

        bt4.setVisible(false);
        bt5.setVisible(false);
        bt6.setVisible(false);
        bt4.setBackground(color);
        bt5.setBackground(color2);
        bt6.setBackground(color3);
        bt4.setFont(new Font("Arial",Font.BOLD,20));
        bt5.setFont(new Font("Arial",Font.BOLD,20));
        bt6.setFont(new Font("Arial",Font.BOLD,20));
        bt1.addActionListener((e)->bt4.setVisible(true));
        bt2.addActionListener((e)->bt5.setVisible(true));
        bt3.addActionListener((e)->bt6.setVisible(true));
        bt4.addActionListener((e)->bt4.setVisible(false));
        bt5.addActionListener((e)->bt5.setVisible(false));
        bt6.addActionListener((e)->bt6.setVisible(false));
        bt4.addActionListener((e)->bt1.setVisible(true));
        bt5.addActionListener((e)->bt2.setVisible(true));
        bt6.addActionListener((e)->bt3.setVisible(true));
        pnBottom.add(bt4);
        pnBottom.add(bt5);
        pnBottom.add(bt6);

        fr.add(pnTop,BorderLayout.NORTH);
        fr.add(pnCentr,BorderLayout.CENTER);
        fr.add(pnBottom,BorderLayout.SOUTH);

        fr.setVisible(true);
    }
}