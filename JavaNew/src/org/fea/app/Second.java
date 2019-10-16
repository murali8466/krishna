package org.fea.app;

 interface NumberOne {
	public void add();
	

}
public class Second {
	public static void murali() {
		System.out.println(" india");
		
	}
	public static void main(String[] args) {
		
		
		NumberOne numberOne= Second::murali;
		
		numberOne.add();
		
		}
		 
		

}
