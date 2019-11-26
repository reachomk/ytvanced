package com.google.vr.sdk.base;

import android.content.Context;
import android.opengl.GLSurfaceView.EGLWindowSurfaceFactory;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.vr.ndk.base.GvrSurfaceView;
import defpackage.baff;
import javax.microedition.khronos.egl.EGLConfig;

public class GvrView extends FrameLayout {
    public CardboardViewApi cardboardViewApi;

    public interface StereoRenderer {
        void onDrawEye(Eye eye);

        void onFinishFrame(Viewport viewport);

        void onNewFrame(HeadTransform headTransform);

        void onRendererShutdown();

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated(EGLConfig eGLConfig);
    }

    public interface Renderer {
        void onDrawFrame(HeadTransform headTransform, Eye eye, Eye eye2);

        void onFinishFrame(Viewport viewport);

        void onRendererShutdown();

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated(EGLConfig eGLConfig);
    }

    public GvrView(Context context) {
        super(context);
        init(context);
    }

    public void setRenderer(StereoRenderer stereoRenderer) {
        if (stereoRenderer != null) {
            this.cardboardViewApi.setRenderer(stereoRenderer);
            return;
        }
        throw new IllegalArgumentException("StereoRenderer must not be null");
    }

    public void setStereoModeEnabled(boolean z) {
        this.cardboardViewApi.setStereoModeEnabled(z);
    }

    public void setOnCloseButtonListener(Runnable runnable) {
        this.cardboardViewApi.setOnCloseButtonListener(runnable);
    }

    public GvrViewerParams getGvrViewerParams() {
        return this.cardboardViewApi.getGvrViewerParams();
    }

    public void onResume() {
        this.cardboardViewApi.onResume();
    }

    public void onPause() {
        this.cardboardViewApi.onPause();
    }

    public void shutdown() {
        this.cardboardViewApi.shutdown();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.cardboardViewApi.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCardboardTriggerListener(Runnable runnable) {
        this.cardboardViewApi.setOnCardboardTriggerListener(runnable);
    }

    public void queueEvent(Runnable runnable) {
        this.cardboardViewApi.getGvrSurfaceView().queueEvent(runnable);
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        this.cardboardViewApi.getGvrSurfaceView().setEGLConfigChooser(i, i2, i3, i4, 16, 0);
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.cardboardViewApi.getGvrSurfaceView().setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    public CharSequence getAccessibilityClassName() {
        return GvrView.class.getName();
    }

    private void init(Context context) {
        if (!isInEditMode()) {
            if (baff.a(context) != null) {
                this.cardboardViewApi = ImplementationSelector.createCardboardViewApi(context);
                addView(this.cardboardViewApi.getRootView(), 0);
                GvrSurfaceView gvrSurfaceView = this.cardboardViewApi.getGvrSurfaceView();
                gvrSurfaceView.setEGLContextClientVersion(2);
                gvrSurfaceView.setPreserveEGLContextOnPause(true);
                return;
            }
            throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
        }
    }
}
