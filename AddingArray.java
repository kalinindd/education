import java.util.Scanner;

public class AddingArray {
	
	public static void main(String[] args) {
		
		double[] arr = new double[10];
		
		System.out.print("Создан массив: ");
		for (int i = 0; i < arr.length; i++){
			arr[i] = (double)Math.round(Math.random() * 1000) / 100;
			System.out.print(arr[i] + "; ");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Введите номер элемента для изменения (от 1 до 10):");
		int x = sc.nextInt() - 1;
		sc.close();
		
		arr = incr(arr, x);
		
		System.out.print("Изменённый массив: ");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "; ");
		}
	}
	
	static double[] incr (double[] arr, int x){
		arr[x] = (double)Math.round(arr[x] * 1.1 * 100) / 100;
		return arr;
	}
}