package algo_live6;

public class SinglyLinkedList {
	
	private Node head;
	
	private void addFirstNode(String data) {
		
		Node newNode = new Node(data,head);
		head = newNode;

	}
	
	public Node getLastNode() {
		for(Node currNode=head;currNode !=null;currNode = currNode.link){
			if(currNode.link == null) {
				return currNode;
			}
			
		}
		return null;
	}
	
	
	
	//마지막 노드로 삽입하기
	public void addLastNode(String data) {
		if(head == null) {
			addFirstNode(data);
			return;
		}
		Node lastNode = getLastNode();
		Node newNode = new Node(data);
		
		lastNode.link = newNode;
	}
	
	public void insertAfterNode(Node preNode, String data) {
		if(preNode == null) {
			System.out.println("선행노드가 없어 삽입 불가");
			return;
		}
		Node newNode = new Node(data, preNode.link);
		preNode.link = newNode;
		
	}
	
	public Node getNode(String data) {
		for(Node currNode=head;currNode !=null;currNode = currNode.link){
			if(currNode.data.equals(data)){
				return currNode;
			}
		}
		return null;
	}
	
	public Node getPreviousNode(Node target) {
		for(Node currNode=head;currNode !=null;currNode = currNode.link){
			if(currNode.link == target) {
				return currNode;
			}
		}
		return null;
	}
	public void deleteNode(String data) {
		Node targetNode = getNode(data);
		if(targetNode == null) {
			System.out.println("삭제할 노드가 없어서 불가");
			return;
		}
		
		Node preNode = getPreviousNode(targetNode);
		if(preNode == null) {
			head = targetNode.link;
		}else {
			preNode.link = targetNode.link;
		}
		targetNode.link = null;
	}
	public void printList() {
		System.out.print("ㄴ = ( ");
		for(Node currNode=head;currNode !=null;currNode = currNode.link){
			System.out.print(currNode.data+" ");
		}
		System.out.print(" ) ");
	}
	
	
}
