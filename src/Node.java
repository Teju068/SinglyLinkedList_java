
public class Node {
	int data;
	Node node;

	Node() {

	}

	Node(int data, Node node) {
		this.data = data;
		this.node = node;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNode() {
		return this.node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

}
