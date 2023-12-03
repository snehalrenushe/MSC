import java.util.*;

public class IterEnum 
{

	public static void main(String[] args)
	{
		String[] wordArr = {"Book", "Number", "Place", "Lemon", "Apple", "Tree"};
		Vector<String> wordList = new Vector<>(Arrays.asList (wordArr)); 
		
		System.out.println("\nThe word list: \n"+wordList + "\n");
		
		Enumeration<String> vectorEnum = wordList.elements(); 
		
		while(vectorEnum.hasMoreElements()) 
		{ 
			System.out.println(vectorEnum.nextElement());
		}

		LinkedList<String> wordLinkedList = new LinkedList<>();
		wordLinkedList.addAll(wordList); 
		wordLinkedList.add("Ball");
		wordLinkedList.add("Mango");
		wordLinkedList.remove("Book");
		System.out.println("\nThe word list (LinkedList): \n" + wordLinkedList + "\n");

		Iterator<String> it =wordLinkedList.iterator(); 
		
		while(it.hasNext()) 
		{   
			System.out.println(it.next()); 
		}
	}
}
