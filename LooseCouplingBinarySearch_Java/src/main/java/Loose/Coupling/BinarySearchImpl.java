package Loose.Coupling;

public class BinarySearchImpl {
	
	SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//Step 3:
		//Java way of loose coupling - Create an interface cuz it gives us way for polymorphism
		//Search array
		numbers = sortAlgorithm.sort(numbers);
		return 3; // index where the element is found in an array
	}
	
	
	
}
