package com.google.gwt.websocket.client;

import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.ErrorEvent;
import com.google.gwt.event.dom.client.ErrorHandler;
import com.google.gwt.event.dom.client.HasErrorHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.websocket.client.event.CloseEvent;
import com.google.gwt.websocket.client.event.CloseHandler;
import com.google.gwt.websocket.client.event.HasCloseHandlers;
import com.google.gwt.websocket.client.event.HasMessageHandlers;
import com.google.gwt.websocket.client.event.HasOpenHandlers;
import com.google.gwt.websocket.client.event.MessageEvent;
import com.google.gwt.websocket.client.event.MessageHandler;
import com.google.gwt.websocket.client.event.OpenEvent;
import com.google.gwt.websocket.client.event.OpenHandler;

public class WebSocket implements HasOpenHandlers, HasCloseHandlers,
		HasErrorHandlers, HasMessageHandlers {

	public static final int CONNECTING = 0;
	public static final int OPEN = 1;
	public static final int CLOSING = 2;
	public static final int CLOSED = 3;

	private WebSocketImpl socket;

	protected WebSocket(String url) {
		this.socket = WebSocketImpl.create(this, url);
	}
	
	public String getProtocol() {
		return socket.getProtocol();
	}
	
	public int getReadyState() {
		return socket.getReadyState();
	}
	
	public long getBufferedAmount() {
		return socket.getBufferedAmount();
	}

	public void send(String message) {
		socket.send(message);
	}
	
	public void close() {
		socket.close();
	}

	private EventBus eventBus;

	void handleOpenEvent(NativeEvent e) {
		OpenEvent.fireNativeEvent(e, this);
	}

	void handleMessageEvent(NativeEvent e) {
		MessageEvent.fireNativeEvent(e, this);
	}

	void handleErrorEvent(NativeEvent e) {
		ErrorEvent.fireNativeEvent(e, this);
	}

	void handleCloseEvent(NativeEvent e) {
		CloseEvent.fireNativeEvent(e, this);
	}
	
	@Override
	public HandlerRegistration addMessageHandler(MessageHandler handler) {
		return ensureHandlers().addHandler(MessageEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addErrorHandler(ErrorHandler handler) {
		return ensureHandlers().addHandler(ErrorEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addCloseHandler(CloseHandler handler) {
		return ensureHandlers().addHandler(CloseEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addOpenHandler(OpenHandler handler) {
		return ensureHandlers().addHandler(OpenEvent.getType(), handler);
	}

	/**
	 * Adds this handler to the widget.
	 * 
	 * @param <H>
	 *            the type of handler to add
	 * @param type
	 *            the event type
	 * @param handler
	 *            the handler
	 * @return {@link HandlerRegistration} used to remove the handler
	 */
	public final <H extends EventHandler> HandlerRegistration addHandler(
			final H handler, GwtEvent.Type<H> type) {
		return ensureHandlers().addHandler(type, handler);
	}

	/**
	 * Ensures the existence of the handler manager.
	 * 
	 * @return the handler manager
	 * */
	EventBus ensureHandlers() {
		return eventBus == null ? eventBus = createEventBus()
				: eventBus;
	}

	/**
	 * Creates the {@link EventBus} used by this Widget. You can override
	 * this method to create a custom {@link EventBus}.
	 * 
	 * @return the {@link EventBus} you want to use
	 */
	protected EventBus createEventBus() {
		return new SimpleEventBus();
	}

	public void fireEvent(GwtEvent<?> event) {
		if (eventBus != null) {
			eventBus.fireEvent(event);
		}
	}
}