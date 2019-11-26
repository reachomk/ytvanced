package com.google.vr.sdk.base;

import android.view.MotionEvent;
import android.view.View;
import com.google.vr.ndk.base.GvrSurfaceView;
import com.google.vr.sdk.base.GvrView.StereoRenderer;

public interface CardboardViewApi {
    GvrSurfaceView getGvrSurfaceView();

    GvrViewerParams getGvrViewerParams();

    View getRootView();

    void onPause();

    void onResume();

    boolean onTouchEvent(MotionEvent motionEvent);

    void setOnCardboardTriggerListener(Runnable runnable);

    void setOnCloseButtonListener(Runnable runnable);

    void setRenderer(StereoRenderer stereoRenderer);

    void setStereoModeEnabled(boolean z);

    void shutdown();
}
