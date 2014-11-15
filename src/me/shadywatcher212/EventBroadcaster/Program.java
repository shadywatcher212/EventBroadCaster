package me.shadywatcher212.EventBroadcaster;


public class Program {

	// Static Reference to a listener
	public static final GuiListener BROADCASTER = new GuiListener();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to shady's event broadcaster");
		
		// Create a new GUI
		Gui test = new Gui();
		Gui test2 = new Gui();
		
		// Add some cool handlers to *only* the listener
		BROADCASTER.addHandler(new GuiHandlers());
		BROADCASTER.addHandler(new GuiHandlers());
		BROADCASTER.addHandler(new NewGuiHandlers());
		BROADCASTER.addHandler(new NewGuiHandlers());
		
		
		test.invokeEvent();
		test2.invokeEvent();
	}

}
