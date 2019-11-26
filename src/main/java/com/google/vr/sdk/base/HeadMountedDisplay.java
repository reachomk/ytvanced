package com.google.vr.sdk.base;

public class HeadMountedDisplay {
    public GvrViewerParams cardboardDevice;
    public ScreenParams screen;

    public HeadMountedDisplay(ScreenParams screenParams, GvrViewerParams gvrViewerParams) {
        this.screen = screenParams;
        this.cardboardDevice = gvrViewerParams;
    }

    public void setScreenParams(ScreenParams screenParams) {
        this.screen = new ScreenParams(screenParams);
    }

    public ScreenParams getScreenParams() {
        return this.screen;
    }

    public void setGvrViewerParams(GvrViewerParams gvrViewerParams) {
        this.cardboardDevice = new GvrViewerParams(gvrViewerParams);
    }

    public GvrViewerParams getGvrViewerParams() {
        return this.cardboardDevice;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeadMountedDisplay) {
            HeadMountedDisplay headMountedDisplay = (HeadMountedDisplay) obj;
            return this.screen.equals(headMountedDisplay.screen) && this.cardboardDevice.equals(headMountedDisplay.cardboardDevice);
        }
    }
}
