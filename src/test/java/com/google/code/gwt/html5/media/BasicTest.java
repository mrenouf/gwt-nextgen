package com.google.code.gwt.html5.media;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.media.client.Audio;
import com.google.gwt.media.client.Video;
import com.google.gwt.user.client.ui.RootPanel;

public class BasicTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.google.gwt.browser.MediaTests";
    }

    /**
     * This test just ensures that the project can be compiled successfully and
     * basic functionality works. Any further tests will need to be done against
     * real browsers.
     */
    public void testCreate() {
        Video video = new Video();
        video.setSrc("http://foo.example.com");
//        video.addLoadedDataHandler(new LoadedDataHandler() {
//            @Override
//            public void onLoadedData(LoadedDataEvent event) {
//                GWT.log("dataLoaded", null);
//            }
//        });
        RootPanel.get().add(video);

        Audio audio = new Audio();
        audio.setSrc("http://bar.example.com");
//        audio.addLoadedDataHandler(new LoadedDataHandler() {
//            @Override
//            public void onLoadedData(LoadedDataEvent event) {
//                GWT.log("dataLoaded", null);
//            }
//        });
        RootPanel.get().add(audio);
    }
}
