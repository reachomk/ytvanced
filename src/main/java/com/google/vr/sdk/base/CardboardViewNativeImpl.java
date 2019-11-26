package com.google.vr.sdk.base;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLSurfaceView.Renderer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.vr.ndk.base.GvrApi;
import com.google.vr.ndk.base.GvrLayout;
import com.google.vr.ndk.base.GvrSurfaceView;
import com.google.vr.ndk.base.GvrUiLayout;
import com.google.vr.sdk.base.GvrView.StereoRenderer;
import defpackage.bafb;
import defpackage.bafc;
import defpackage.bagi;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

public class CardboardViewNativeImpl implements bafb, CardboardViewApi {
    public static final String TAG = CardboardViewNativeImpl.class.getSimpleName();
    public volatile Runnable cardboardBackListener;
    public int cardboardTriggerCount = 0;
    public volatile Runnable cardboardTriggerListener;
    public final Context context;
    public volatile boolean distortionCorrectionEnabled = true;
    public final bafc glSurfaceView;
    public final GvrApi gvrApi;
    public final GvrLayout gvrLayout;
    public final HeadMountedDisplayManager hmdManager;
    public long nativeCardboardView;
    public final RendererHelper rendererHelper;
    public CountDownLatch shutdownLatch;
    public boolean stereoMode = true;
    public final GvrUiLayout uiLayout;

    class RendererHelper implements Renderer {
        public EGLDisplay eglDisplay;
        public boolean invalidSurfaceSizeWarningShown;
        public GvrView.Renderer renderer;
        public ScreenParams screenParams;
        public boolean stereoMode;
        public StereoRenderer stereoRenderer;
        public boolean surfaceCreated;

        public RendererHelper() {
            this.screenParams = new ScreenParams(CardboardViewNativeImpl.this.getScreenParams());
            this.stereoMode = CardboardViewNativeImpl.this.stereoMode;
        }

        public void setRenderer(StereoRenderer stereoRenderer) {
            this.stereoRenderer = stereoRenderer;
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetStereoRenderer(cardboardViewNativeImpl.nativeCardboardView, stereoRenderer);
        }

        public void setScreenParams(ScreenParams screenParams) {
            this.screenParams = screenParams;
        }

        public void shutdown() {
            CardboardViewNativeImpl.this.queueEvent(new Runnable() {
                public void run() {
                    if (!(RendererHelper.this.renderer == null && RendererHelper.this.stereoRenderer == null) && RendererHelper.this.surfaceCreated) {
                        RendererHelper.this.surfaceCreated = false;
                        RendererHelper.this.callOnRendererShutdown();
                    }
                    CardboardViewNativeImpl.this.shutdownLatch.countDown();
                }
            });
        }

        public void setStereoModeEnabled(final boolean z) {
            CardboardViewNativeImpl.this.checkNativeCardboardView();
            CardboardViewNativeImpl.this.gvrLayout.setStereoModeEnabled(z);
            CardboardViewNativeImpl.this.queueEvent(new Runnable() {
                public void run() {
                    boolean access$2000 = RendererHelper.this.stereoMode;
                    boolean z = z;
                    if (access$2000 != z) {
                        RendererHelper.this.stereoMode = z;
                        CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                        cardboardViewNativeImpl.nativeSetStereoModeEnabled(cardboardViewNativeImpl.nativeCardboardView, z);
                        if (!EGL10.EGL_NO_SURFACE.equals(((EGL10) EGLContext.getEGL()).eglGetCurrentSurface(12377))) {
                            RendererHelper rendererHelper = RendererHelper.this;
                            rendererHelper.onSurfaceChanged(null, rendererHelper.screenParams.getWidth(), RendererHelper.this.screenParams.getHeight());
                        }
                    }
                }
            });
        }

        public void onDrawFrame(GL10 gl10) {
            if (!(this.renderer == null && this.stereoRenderer == null) && this.surfaceCreated) {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeOnDrawFrame(cardboardViewNativeImpl.nativeCardboardView);
                EGL14.eglSwapInterval(this.eglDisplay, 1);
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            if ((this.renderer != null || this.stereoRenderer != null) && this.surfaceCreated) {
                if (!this.stereoMode || (i == this.screenParams.getWidth() && i2 == this.screenParams.getHeight())) {
                    this.invalidSurfaceSizeWarningShown = false;
                } else {
                    if (!this.invalidSurfaceSizeWarningShown) {
                        String access$2400 = CardboardViewNativeImpl.TAG;
                        int width = this.screenParams.getWidth();
                        int height = this.screenParams.getHeight();
                        StringBuilder stringBuilder = new StringBuilder(134);
                        stringBuilder.append("Surface size ");
                        stringBuilder.append(i);
                        String str = "x";
                        stringBuilder.append(str);
                        stringBuilder.append(i2);
                        stringBuilder.append(" does not match the expected screen size ");
                        stringBuilder.append(width);
                        stringBuilder.append(str);
                        stringBuilder.append(height);
                        stringBuilder.append(". Stereo rendering might feel off.");
                        Log.e(access$2400, stringBuilder.toString());
                    }
                    this.invalidSurfaceSizeWarningShown = true;
                }
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeOnSurfaceChanged(cardboardViewNativeImpl.nativeCardboardView, i, i2);
                callOnSurfaceChanged(i, i2);
            }
        }

        private void callOnSurfaceCreated(EGLConfig eGLConfig) {
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeOnSurfaceCreated(cardboardViewNativeImpl.nativeCardboardView);
            GvrView.Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.onSurfaceCreated(eGLConfig);
                return;
            }
            StereoRenderer stereoRenderer = this.stereoRenderer;
            if (stereoRenderer != null) {
                stereoRenderer.onSurfaceCreated(eGLConfig);
            }
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            if (this.renderer != null || this.stereoRenderer != null) {
                this.surfaceCreated = true;
                this.eglDisplay = EGL14.eglGetCurrentDisplay();
                callOnSurfaceCreated(eGLConfig);
            }
        }

        private void callOnSurfaceChanged(int i, int i2) {
            GvrView.Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.onSurfaceChanged(i, i2);
            } else {
                StereoRenderer stereoRenderer = this.stereoRenderer;
                if (stereoRenderer != null) {
                    if (this.stereoMode) {
                        stereoRenderer.onSurfaceChanged(i / 2, i2);
                        return;
                    }
                    stereoRenderer.onSurfaceChanged(i, i2);
                }
            }
        }

        private void callOnRendererShutdown() {
            GvrView.Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.onRendererShutdown();
                return;
            }
            StereoRenderer stereoRenderer = this.stereoRenderer;
            if (stereoRenderer != null) {
                stereoRenderer.onRendererShutdown();
            }
        }
    }

    public CardboardViewNativeImpl(Context context) {
        Object obj;
        this.context = context;
        this.hmdManager = new HeadMountedDisplayManager(context);
        try {
            obj = (String) Class.forName(String.valueOf(getClass().getPackage().getName()).concat(".NativeProxy")).getDeclaredField("PROXY_LIBRARY").get(null);
        } catch (Exception unused) {
            obj = "gvr";
        }
        String valueOf = String.valueOf(obj);
        String str = "Loading native library ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        System.loadLibrary(obj);
        nativeSetApplicationState(getClass().getClassLoader(), context.getApplicationContext());
        this.glSurfaceView = new bafc(context, this);
        this.gvrLayout = new GvrLayout(context);
        this.gvrLayout.setPresentationView(this.glSurfaceView);
        this.rendererHelper = new RendererHelper();
        this.uiLayout = this.gvrLayout.getUiLayout();
        this.gvrApi = this.gvrLayout.getGvrApi();
        this.nativeCardboardView = nativeInit(this.gvrApi.getNativeGvrContext());
    }

    private native void nativeDestroy(long j);

    private native void nativeGetCurrentEyeParams(long j, HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5);

    private native float nativeGetNeckModelFactor(long j);

    private native long nativeInit(long j);

    private native void nativeLogEvent(long j, int i);

    private native void nativeOnDrawFrame(long j);

    private native void nativeOnSurfaceChanged(long j, int i, int i2);

    private native void nativeOnSurfaceCreated(long j);

    private static native long nativeSetApplicationState(ClassLoader classLoader, Context context);

    private native void nativeSetDepthStencilFormat(long j, int i);

    private native void nativeSetDistortionCorrectionEnabled(long j, boolean z);

    private native void nativeSetDistortionCorrectionScale(long j, float f);

    private native void nativeSetGvrViewerParams(long j, byte[] bArr);

    private native void nativeSetMultisampling(long j, int i);

    private native void nativeSetNeckModelEnabled(long j, boolean z);

    private native void nativeSetNeckModelFactor(long j, float f);

    private native void nativeSetRenderer(long j, GvrView.Renderer renderer);

    private native void nativeSetScreenParams(long j, int i, int i2, float f, float f2, float f3);

    private native void nativeSetStereoModeEnabled(long j, boolean z);

    private native void nativeSetStereoRenderer(long j, StereoRenderer stereoRenderer);

    private native void nativeUndistortTexture(long j, int i);

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            if (this.nativeCardboardView != 0) {
                Log.w(TAG, "GvrView.shutdown() should be called to ensure resource cleanup");
                nativeDestroy(this.nativeCardboardView);
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public void onSurfaceViewDetachedFromWindow() {
        if (this.shutdownLatch == null) {
            this.shutdownLatch = new CountDownLatch(1);
            this.rendererHelper.shutdown();
            try {
                this.shutdownLatch.await();
            } catch (InterruptedException e) {
                String str = TAG;
                String valueOf = String.valueOf(e.toString());
                String str2 = "Interrupted during shutdown: ";
                Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
            }
            this.shutdownLatch = null;
        }
    }

    public void setRenderer(StereoRenderer stereoRenderer) {
        this.rendererHelper.setRenderer(stereoRenderer);
        this.glSurfaceView.setRenderer(this.rendererHelper);
    }

    public void setStereoModeEnabled(boolean z) {
        this.stereoMode = z;
        this.rendererHelper.setStereoModeEnabled(z);
    }

    public void setOnCloseButtonListener(Runnable runnable) {
        this.uiLayout.setCloseButtonListener(runnable);
    }

    public GvrViewerParams getGvrViewerParams() {
        return this.hmdManager.getHeadMountedDisplay().getGvrViewerParams();
    }

    public ScreenParams getScreenParams() {
        return this.hmdManager.getHeadMountedDisplay().getScreenParams();
    }

    public void onResume() {
        checkNativeCardboardView();
        this.gvrLayout.onResume();
        this.glSurfaceView.onResume();
        this.hmdManager.onResume();
        setScreenParams(getScreenParams());
        setGvrViewerParams(getGvrViewerParams());
        this.gvrApi.resumeTracking();
    }

    public void onPause() {
        checkNativeCardboardView();
        this.gvrApi.pauseTracking();
        this.hmdManager.onPause();
        this.glSurfaceView.onPause();
        this.gvrLayout.onPause();
    }

    public void shutdown() {
        if (this.nativeCardboardView != 0) {
            this.hmdManager.close();
            this.gvrLayout.shutdown();
            nativeDestroy(this.nativeCardboardView);
            this.nativeCardboardView = 0;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 || this.cardboardTriggerListener == null) {
            return false;
        }
        onCardboardTrigger();
        return true;
    }

    public void setOnCardboardTriggerListener(Runnable runnable) {
        this.cardboardTriggerListener = runnable;
    }

    public View getRootView() {
        return this.gvrLayout;
    }

    public GvrSurfaceView getGvrSurfaceView() {
        return this.glSurfaceView;
    }

    private void runOnCardboardBackListener() {
        Runnable runnable = this.cardboardBackListener;
        if (runnable != null) {
            bagi.a(runnable);
        }
    }

    private void onCardboardTrigger() {
        Runnable runnable = this.cardboardTriggerListener;
        if (runnable != null) {
            bagi.a(runnable);
        }
    }

    private void onCardboardBack() {
        runOnCardboardBackListener();
    }

    private void queueEvent(Runnable runnable) {
        this.glSurfaceView.queueEvent(runnable);
    }

    private void setGvrViewerParams(final GvrViewerParams gvrViewerParams) {
        this.uiLayout.setViewerName(new GvrViewerParams(gvrViewerParams).getModel());
        queueEvent(new Runnable() {
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetGvrViewerParams(cardboardViewNativeImpl.nativeCardboardView, gvrViewerParams.toByteArray());
            }
        });
    }

    private void setScreenParams(ScreenParams screenParams) {
        final ScreenParams screenParams2 = new ScreenParams(screenParams);
        queueEvent(new Runnable() {
            public void run() {
                CardboardViewNativeImpl.this.rendererHelper.setScreenParams(screenParams2);
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetScreenParams(cardboardViewNativeImpl.nativeCardboardView, screenParams2.getWidth(), screenParams2.getHeight(), screenParams2.getWidthMeters() / ((float) screenParams2.getWidth()), screenParams2.getHeightMeters() / ((float) screenParams2.getHeight()), screenParams2.getBorderSizeMeters());
            }
        });
    }

    private void checkNativeCardboardView() {
        if (this.nativeCardboardView == 0) {
            throw new IllegalStateException("GvrView has already been shut down.");
        }
    }
}
