package getput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> listaInt = Arrays.asList(5, 10, 9, 7);
		List<Double> listaDbl = Arrays.asList(5.55, 10.11, 9.99, 7.77);
		List<Object> objects = new ArrayList<>();
		
		copy(listaInt, objects);
		copy(listaDbl, objects);
		printList(objects);
	}

	private static void copy(List<? extends Number> src, List<? super Number> target) {
		for(int i = 0; i < src.size(); i++) {
			Number n = src.get(i);
			target.add(n);
		}
	}

	public static void printList(List<?> src) {
		for(int i = 0; i < src.size(); i++) {
			System.out.println(src.get(i));
		}
	}
}
