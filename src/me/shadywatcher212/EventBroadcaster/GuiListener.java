package me.shadywatcher212.EventBroadcaster;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuiListener implements ActionListener {

	// The actual handlers that will be called
	private static ArrayList<GuiHandlers> handlers = new ArrayList<GuiHandlers>();
	
	// Invoke every handler's action
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		for(GuiHandlers h : handlers) {
			h.onAction(arg0);
		}
	}
	
	// Add a handler to listen for GUI events
	public void addHandler(GuiHandlers h) {
		handlers.add(h);
	}

}
