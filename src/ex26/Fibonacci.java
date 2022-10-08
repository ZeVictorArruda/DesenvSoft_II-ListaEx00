package ex26;

public class Fibonacci {
	
	public int fibo(int n) {
		return (n < 2) ? n : fibo(n-1) + fibo(n-2);
	}

}
