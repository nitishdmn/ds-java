import java.util.Scanner;

class BinaryTreeNode<T> {
	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;
	public BinaryTreeNode<T> next;

	public BinaryTreeNode(T data) {
		this.data = data;
		left = null;
		right = null;
		next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}

}

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
	}

}

class QueueUnderFlowException extends Exception {

}

class QueueUsingLinkedList<T> {
	Node<T> front;
	Node<T> rear;
	int size;

	public QueueUsingLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}

	public void enqueue(T data) {
		Node<T> nyaNode = new Node<>(data);
		if (front == null) {
			front = nyaNode;
			rear = nyaNode;
		} else {
			rear.next = nyaNode;
			rear = rear.next;
		}
		size++;
	}

	public T dequeue() throws QueueUnderFlowException {
		if (front == null) {
			throw new QueueUnderFlowException();
		}
		Node<T> temp = front;
		front = front.next;
		size--;
		return temp.data;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public void printQueue() {
		Node<T> temp = front;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
	}
}

public class runner {
	static Scanner s = new Scanner(System.in);

	static BinaryTreeNode<Integer> prepareTree() throws QueueUnderFlowException {

		int data = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		QueueUsingLinkedList<BinaryTreeNode<Integer>> queue = new QueueUsingLinkedList();
		queue.enqueue(root);

		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = queue.dequeue();

			int leftData = s.nextInt();
			if (leftData != -1) {
				BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(
						leftData);
				currentNode.setLeft(leftNode);
				queue.enqueue(currentNode.getLeft());

			}

			int rightData = s.nextInt();
			if (rightData != -1) {
				currentNode.setRight(new BinaryTreeNode<>(rightData));
				queue.enqueue(currentNode.getRight());
			}
		}
		return root;
	}

	public static void main(String[] args) throws QueueUnderFlowException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = prepareTree();

		leftView(root);

	}
  static void leftView(BinaryTreeNode<Integer> root)
    {
		Queue<BinaryTreeNode<Integer>> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int a=q.size();
            int count=0;
            BinaryTreeNode<Integer> temp=null;
            for(int i=0;i<a;i++)
            {
                try{temp=q.remove();}
                catch(Exception e){}

                if(count==0)
                    System.out.print(" "+temp.data);

                count++;
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);

            }
        }
	}

}
