import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many characters would you like to type?");

		int size = scan.nextInt();
		MyQueue queue = new MyQueue(size);

		System.out.println("Enter a String:");
		String word = scan.next();

		for (int i = 0; i < word.length(); i++) {
		queue.enqueue(word.charAt(i));
		}
		queue.print();
	}

}