package com.google.gwt.media.client;

import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.media.client.Audio;
import com.google.gwt.media.client.Video;
import com.google.gwt.media.client.event.LoadedDataEvent;
import com.google.gwt.media.client.event.LoadedDataHandler;
import com.google.gwt.user.client.ui.RootPanel;

public class MediaTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.google.gwt.media.MediaTests";
    }

    /**
     * This test just ensures that the project can be compiled successfully and
     * basic functionality works. Any further tests will need to be done against
     * real browsers.
     */
    public void testCreate() {
    	// The following guard is intended to force the code through compilation
    	// while still avoiding execution since it cannot be tested by HtmlUnit
    	if (new Date().getTime() > 0)
    		return;

    	Video video = new Video();
        video.setSrc("http://video.example.com");
        video.addLoadedDataHandler(new LoadedDataHandler() {
            @Override
            public void onLoadedData(LoadedDataEvent event) {
                GWT.log("dataLoaded", null);
            }
        });
        RootPanel.get().add(video);

        Audio audio = new Audio();
        audio.setSrc("http://audio.example.com");
        audio.addLoadedDataHandler(new LoadedDataHandler() {
            @Override
            public void onLoadedData(LoadedDataEvent event) {
                GWT.log("dataLoaded", null);
            }
        });
        RootPanel.get().add(audio);
    }
}
