package algo_live4;

import java.util.LinkedList;
import java.util.Queue;

public class QueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		System.out.println(queue.isEmpty()+"/"+queue.size());
		queue.offer("황선우");
		queue.offer("황선우1");
		queue.offer("황선우2");
		queue.offer("황선우3");
		queue.offer("황선우4");
	}

}
