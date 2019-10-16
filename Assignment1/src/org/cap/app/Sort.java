package org.cap.app;

public class Sort {
	public static void main(String[] args) {
		
		for(int i=0;i<args.length-1;i++)
		{
			for(int j=0;j<args.length-1;j++)
			{
				if( Integer.parseInt(args[j]) > Integer.parseInt(args[j+1]))
				{
					String temp=args[j];
					args[j]=args[j+1];
					args[j+1]=temp;
					
				}
			}
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			
		}
	}

}
