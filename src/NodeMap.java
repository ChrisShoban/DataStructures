import java.util.HashMap;
import java.util.Map;

public class NodeMap<E> {

	E value;
	Map<E, NodeMap<E>> neighbors = new HashMap<E, NodeMap<E>>();
	
	public NodeMap(E value) {
		this.value = value;
	}
	
	public Map<E, NodeMap<E>> getNeighbors() {
		return neighbors;
	}
	public void setNeighbors(HashMap<E, NodeMap<E>> neighbors) {
		this.neighbors = neighbors;
	}
	public E getValue() {
		return value;
	}
	public void setValue(E value) {
		this.value = value;
	}
}