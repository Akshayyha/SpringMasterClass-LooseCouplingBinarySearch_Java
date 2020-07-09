package Loose.Coupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LooseCouplingBinarySearchApplication {

	public static void main(String[] args) {
		
		//can pass any child of the SortAlgorithm interface and can implement loose coupling leveraging the polymorphism
		BinarySearchImpl binarySearchImpl1 = new BinarySearchImpl(new BubbLeSortAlgo());
		BinarySearchImpl binarySearchImpl2 = new BinarySearchImpl(new QuickSortAlgo());
		int result = binarySearchImpl1.binarySearch(new int[] {1,12,8,5}, 5);
		System.out.println(result);
		
//		SpringApplication.run(LooseCouplingBinarySearchApplication.class, args);
	}

}
