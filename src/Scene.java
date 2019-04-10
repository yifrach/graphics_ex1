import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Scene {
	private List<Point> points;
	private List<Edge> edges;
	
	public Scene() {
		this.points = new ArrayList<>();
		this.edges = new ArrayList<>();
	}
	
	public void load(String path) {
        BufferedReader br = null;
        FileReader fr = null;
		try {
			fr = new FileReader(path);
            br = new BufferedReader(fr);

            int vertexNum = Integer.valueOf(br.readLine());
            for(int i = 0; i < vertexNum; i++) {
            	String[] points = br.readLine().split(" ");
            	double x = Double.valueOf(points[0]);
            	double y = Double.valueOf(points[1]);
            	double z = Double.valueOf(points[2]);
            	this.points.add(new Point(x, y, z));
            }
            
            int edgesNum = Integer.valueOf(br.readLine());
            for(int i = 0; i < edgesNum; i++) {
            	String[] edges = br.readLine().split(" ");
            	int e1 = Integer.valueOf(edges[0]);
            	int e2 = Integer.valueOf(edges[1]);
            	this.edges.add(new Edge(this.points.get(e1), this.points.get(e2)));
            }
            for (int i=0; i<this.points.size(); i++) {
            	System.out.println(this.points.get(i));
            }
            for (int i=0; i<this.edges.size(); i++) {
            	System.out.println(this.edges.get(i));
            }
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
	
	public List<Point> getPoints() {
		return this.points;
	}
	
	public List<Edge> getEdges() {
		return this.edges;
	}

}
