
public class array2 {

	public static void main(String[] args) {
		
		int intArray[] = new int[5];
		intArray[0] = 2;
		int referenceArray[] = intArray; // ���簡 �ƴ϶� ���� //
		
		intArray[0] = 3;
		
		System.out.println(referenceArray[0]); //  system.arraycopy�� ��� ���� //
		
		char[] arr1 = {'1', '2', '3', '4', '5'}; // 1,2,3,4,5 X ���� Ÿ�Ը� ���� //
		char[] arr2 = {'A', 'B', 'C', 'D', 'E'};
		 
		System.arraycopy(arr1, 1, arr2, 2, 3);    // arr1�� index 1�������� 3����, arr2�� index 2�������� copy
		// System.arraycopy(arr1, 0, arr2, 1, 5);    // ������ �Ѿ�� Error
		        
		for( int i = 0; i < arr2.length; i++ )
		{
		    System.out.print(arr2[i]);
		}
		System.out.println();
		arr1[0] = '7';
		System.out.println(arr1);
		System.out.println(arr2);   // ������ �ƴ϶� �����߱� ������ ������ �� �ٲ��� ���� x //

		

	}

}
