import java.util.*;
public class BJ27866 {

	public static void main(String[] args) 
	{
        System.out.print("�ܾ �Է��Ͻÿ�: ");
        Scanner scan = new Scanner(System.in);
        String S[] = scan.next().split("");
        System.out.print("�� ��°?: ");
        int i = scan.nextInt();
        
        System.out.println(S[i-1]);
        
        scan.close();
	}

}
