package Test.PrimeNumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(2,3,8,5,1,33,7,88);
		 List<Integer> primes = list.stream().filter(x -> {
			 if(x <= 1) return false;
			 else {
				 	for(int i = 2;i < Math.sqrt(x);i++)
				 		{	 if(x%i == 0) return false; } 
		     	  }
			 return true;
		 }).collect(Collectors.toList());
		 System.out.println(primes);

	}

}
