
public class array2 {

	public static void main(String[] args) {
		
		int intArray[] = new int[5];
		intArray[0] = 2;
		int referenceArray[] = intArray; // 복사가 아니라 참조 //
		
		intArray[0] = 3;
		
		System.out.println(referenceArray[0]); //  system.arraycopy를 써야 복사 //
		
		char[] arr1 = {'1', '2', '3', '4', '5'}; // 1,2,3,4,5 X 같은 타입만 복사 //
		char[] arr2 = {'A', 'B', 'C', 'D', 'E'};
		 
		System.arraycopy(arr1, 1, arr2, 2, 3);    // arr1의 index 1에서부터 3개를, arr2의 index 2에서부터 copy
		// System.arraycopy(arr1, 0, arr2, 1, 5);    // 범위를 넘어서면 Error
		        
		for( int i = 0; i < arr2.length; i++ )
		{
		    System.out.print(arr2[i]);
		}
		System.out.println();
		arr1[0] = '7';
		System.out.println(arr1);
		System.out.println(arr2);   // 참조가 아니라 복사했기 때문에 원래의 값 바껴도 영향 x //

		

	}

}
