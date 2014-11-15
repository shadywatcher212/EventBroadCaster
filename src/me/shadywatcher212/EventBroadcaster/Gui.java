package me.shadywatcher212.EventBroadcaster;

import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
 * This is not an actual GUI, but represents a way for a static listener to hook
 * into a GUI and act as a static event broadcaster.
 */
public class Gui {
	ArrayList <ActionListener>listeners = new ArrayList<ActionListener>();
	
	public Gui() {
		addActionListener(Program.BROADCASTER);
	}
	
	public void addActionListener(ActionListener l) {
		listeners.add(l);
	}
	
	public void invokeEvent() {
		for(ActionListener l : listeners) {
			// We aren't too concerned with the actual event
			l.actionPerformed(null);
		}
	}
}
