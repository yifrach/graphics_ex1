import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class MyCanvas extends Canvas implements KeyListener, MouseListener, MouseMotionListener{
	private Scene scene;
//	private View view;
	
	public MyCanvas() {
		this.scene = new Scene();
//		this.view = new View();
		this.scene.load("example3d.scn");
//		this.view.load("example3d.viw");
		
		setSize(420, 420);
//		setSize(view.getViewPort()[0] + 40, view.getViewPort()[1] + 40);

        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
	}
	
//	 @Override
//    public void paint(Graphics g) {
//        List<Point> newVL = new ArrayList<>();
//        newVL = t.mult(this.scene.getVL);
//    }

	@Override
    public void keyTyped(KeyEvent e) {
        char key = Character.toLowerCase(e.getKeyChar());

        switch (key) {
            case 'c':
                break;
            case 'l':
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                String path = chooser.getSelectedFile().getAbsolutePath();
                String extension = path.substring(path.lastIndexOf('.') + 1);
                if (extension.equals("scn")) {
                    this.scene.load(path);
                } else if (extension.equals("viw")) {
                    //this.view.load(path);
                }
                break;
            case 'r':
                break;
            case 'x':
                break;
            case 'y':
                break;
            case 'z':
                break;
            case 'q':
                exit(1);
                break;
            default:
                break;
        }
    }
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
