package org.cap.app;

public class ArmstrongNumBetween {
	public static void main(String[] args)
	{
		int n, b, sum = 0;
		System.out.println("Armstrong numbers from 100 to 999 are:");
		for (int i = 100; i <= 999; i++) 
		{
			n = i;
			while (n > 0)
			{
				b = n % 10;
				sum = sum + (b * b * b);
				n = n / 10;
			}
			if (sum == i)
			{
				System.out.println(i + " ");
			}
			sum = 0;
		}
	}

}
