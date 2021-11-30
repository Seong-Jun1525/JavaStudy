package ch40;

import ch38.MyLinkedList;
import ch38.MyListNode;

interface Queue {
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements Queue {

	MyListNode front;
	MyListNode rear;
	
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {
			// 비어있는 큐에 맨 처읆으로 들어가는 경우
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			// 맨 뒤로 들어가는 경우
			newNode = addElement(data);
			rear = newNode;
		}
		
		System.out.println(newNode.getData() + " added");
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			return null;
		}
		String data = front.getData();
		front = front.next;
		
		if(front == null) { // 마지막 항목이라는 의미
			rear = null;
		}
		return data;
	}

	@Override
	public void printQueue() {
		printAll();
	}

}
