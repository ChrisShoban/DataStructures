public class NodeArray {

	NodeArray[] neighbors = new NodeArray[256];
	char value;

	public NodeArray(char value) {
		this.value = value;
	}
	
	public NodeArray[] getNeighbors() {
		return neighbors;
	}
	public void setNeighbors(NodeArray[] neighbors) {
		this.neighbors = neighbors;
	}
	public char getValue() {
		return value;
	}
	public void setValue(char value) {
		this.value = value;
	}
}
