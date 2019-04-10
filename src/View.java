import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class View {
	private Point position;
	private Point lookAt;
	private Point up;
	private int[] window;
	private int[] viewPort;
	
	public View() {
		this.position = new Point();
		this.lookAt = new Point();
		this.up = new Point();
		this.viewPort = new int[2];
		this.window = new int[4];
	}
	
	public void load(String path) {
		BufferedReader br = null;
        FileReader fr = null;
		try {
			fr = new FileReader(path);
            br = new BufferedReader(fr);

            // TODO - read the file: example3d.viw and put the data to the parameters.   
		} catch (IOException e) {
	        System.err.format("IOException: %s%n", e);
	    } finally {
	        try {
	            if (br != null)
	                br.close();
	
	            if (fr != null)
	                fr.close();
	        } catch (IOException ex) {
	            System.err.format("IOException: %s%n", ex);
	        }
	    }
	}
	
	public Point getPosition() {
		return this.position;
	}
	
	public Point getLookAt() {
		return this.lookAt;
	}
	
	public Point getUP() {
		return this.up;
	}
	
	public int[] getWindow() {
		return this.window;
	}
	
	public int[] getViewPort() {
		return this.viewPort;
	}
}
