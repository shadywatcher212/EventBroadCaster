package me.shadywatcher212.EventBroadcaster;

import java.awt.event.ActionEvent;

public class GuiHandlers implements GuiMethods {

	protected String name = "generic name";
	
	@Override
	public void onAction(ActionEvent arg0) {
		System.out.println(name);
	}

}
