package com.exam.exceptions;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = Integer.parseInt(s.nextLine());
		
		try {
			if (num < 0 )
				throw new NumberTooSmallException();
			else if (num > 1000)
				throw new NumberTooLargeException();
			else if (num == 0)
				throw new ZeroNumberException();
			else
				System.out.println("Allocated Memory");
		}
		catch (Exception e) {
			System.out.println("Caught");
			System.err.println(e.getMessage());
		}
	}

}
