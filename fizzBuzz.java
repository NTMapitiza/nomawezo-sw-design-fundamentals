package com.example.fizzbuzz;

public class fizzBuzz {

	public static void main(String[] args) {
		
		fizzBuzz fb = new fizzBuzz();
		
		fb.go();
		
	}

	public void go() {
		for (int i = 1; i <= 100; i++) {
			boolean yes = false;
			if (i % 3 == 0) {
				System.out.print("Fizz");
				yes = true;
			}
			
			if (i % 5 == 0) {
				System.out.print("Buzz");
				yes = true;
			}
			
			if (!yes) {
				System.out.println(i);
			}else {
				System.out.println();
			}
		}
	}
}