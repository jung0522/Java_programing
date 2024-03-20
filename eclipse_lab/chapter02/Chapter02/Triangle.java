import java.lang.System;
import java.util.Scanner;

public class Triangle
{
	// 프로그램 시작 
	public static void main( String[] args ) 
	{
		// 변수 초기화
		Scanner scan = new Scanner( System.in );
		int size=0;

		// 사용자에게 삼각형의 크기를 입력 받기 
		System.out.print("삼각형 크기를 입력하세요 : ");
		size=scan.nextInt(); 


		// 삼각형 크기만큼 한 줄씩 출력 
				for ( int line = 1; line <= size; line++ ) // line
				{
					// n번째 줄은 '삼각형크기-줄번호'만큼 공백 ' '을 출력 
					for ( int blank = size - line; blank > 0; blank-- ) //blank
					{
						System.out.print(" ");
					}
					// n번째 줄은 '2*줄번호-1'만큼 별모양 '*'를 출력 
					for ( int star = 2*line-1; star > 0; star-- )
					{
						System.out.print("*");
					}
					// 끝에 빈줄을 출력 
					System.out.print("\n");
					// n-1번째 줄
				}
				for (int line = size + 1; line <= size*2- 1; line++ ) // line
				{
					
					for ( int blank = line - size; blank > 0; blank-- ) //blank
					{
						System.out.print(" ");
					}
					// n번째 줄은 '2*줄번호-1'만큼 별모양 '*'를 출력 
					for ( int star = 2*(size-(line-size))-1; star > 0; star-- )
					{
						System.out.print("*");
					}
					// 끝에 빈줄을 출력 
					System.out.print("\n");
					// n-1번째 줄
				}

		return;
		
	}	
}
