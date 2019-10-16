package org.fea.app;

interface Ready
{
	void jump();
}
public class MethodReference {
	public static void jump()
	{
		System.out.println("murali jump");
	}
	
	public static void main(String[] args) {
		
	
	 Ready ready=MethodReference::jump;
	 ready.jump();
	}

}
