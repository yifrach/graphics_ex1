import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
	
//	public static void read_line(String[] str_array) {
//		switch(str_array[1]) {
//		case "Position":
//		case "LookAt":
//		case "Up":
//			double x = Double.valueOf(str_array[1]);
//			double y = Double.valueOf(str_array[2]);
//			double z = Double.valueOf(str_array[3]);
//			Point position_point = new Point(x, y, z);
//			break;
//		case "Window":
//			break;
//		case "Viewport":
//			break;
//		default: break;
//		}
//		
//	}
	
	public static void main(String[] args) {
		Frame myFrame = new Frame("Graphics");
        MyCanvas myCanvas = new MyCanvas();
        myFrame.add(myCanvas);

        WindowAdapter myWindowAdapter = new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        myFrame.addWindowListener(myWindowAdapter);
        myFrame.pack();
        myFrame.setVisible(true);
	}
}
