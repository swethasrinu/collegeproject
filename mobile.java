package Interfaces;

public interface mobile {
	
	public void screen();
	public void volume();
	public void memory();
	
	default void speaker() {
		System.out.println("speaker code");
	}
		
	static void camcapacity() {
		System.out.println("cam capacity is added ");
	}
	
	
	
}
