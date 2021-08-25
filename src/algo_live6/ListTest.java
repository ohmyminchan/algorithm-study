package algo_live6;

public class ListTest {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addLastNode("정산하");
		System.out.println(list.getLastNode());
		list.printList();
		
		list.addLastNode("박해준");
		list.printList();

		list.addLastNode("이현식");
		list.printList();
		
		list.insertAfterNode(list.getNode("정산하"), "임혁");
		list.printList();
		
		Node target = list.getNode("박혜준");
		System.out.println(list.getPreviousNode(target));
		
		list.deleteNode("박해준");
		list.printList();
	}

}
