package quiz02;

public class Answer03 {
	public static void main(String[] args) {
		
		System.out.println(-8 >> 1);
		
		/*
		
		1.	0000 1000	= 8				= 8
			1111 0111	= 8의 1의 보수	= ~8
			1111 1000	= 8의 2의 보수	= ~8 +1		= -8의 2진수 표현
		
		2.	메모리 오른쪽 한칸 이동 + 음수는 맨앞을 1로 채움
			1111 1000 -> 1111 1100
		
		3.	1111 1100	= a
			0000 0011	= a의 1의 보수	= ~a
			0000 0100	= a의 2의 보수	= ~a +1		= 10진수 4
					
		4.	1111 1100 은 10진수 -4
	
		*/
		
		
		/* 2의 보수법
		
		~ (비트연산자) : 0 -> 1 / 1 -> 0
		
		~a		= a의 1의 보수
		~a + 1	= a의 2의 보수
		
		a + ~a		= (메모리 상) 1111 1111
		a + ~a + 1	= (메모리 상) 0000 0000 = 0
		
		a가 양수일 때 : a의 음의 정수 = ~a + 1
		a가 음수일 때 : a의 양의 정수 = ~a + 1
		
		*/
		
	}
}