package de.hdmstuttgart.yaxim.service;

public interface XMPPServiceCallback {
	void newMessage(String from, String messageBody);
	void rosterChanged();
	boolean isBoundTo(String jabberID);
}
