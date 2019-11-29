import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MyWindow extends JFrame implements MouseListener {
    ArrayList<Student> myShapes;

    public MyWindow() {
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // create the new arraylist
        this.myShapes = new ArrayList<Student>();
        addMouseListener(this);
    }

    /**
     * In the event that the mouse is clicked.
     * @param me = MouseEvent object
     * */
    public void mouseClicked(MouseEvent me) {
        System.out.println("Mouse clicked");

        // x coordinate
        double x = me.getX();

        // y coordinate
        double y = me.getY();

        // note: create a constructor
        //this.myShapes.add(new Student(x,y));
    }

    /**
     *
     * */
    @Override
    public void mouseReleased(MouseEvent me) {

    }

    /**
     *
     * */
    @Override
    public void mousePressed(MouseEvent me) {

    }

    /**
     *
     * */
    @Override
    public void mouseExited(MouseEvent me) {

    }

    /**
     *
     * */
    @Override
    public void mouseEntered(MouseEvent me) {

    }

    /**
     *
     * */
    public static void main(String[] args) {
        new MyWindow();
    }
}
