package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.Presentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.InvalidDisplayException;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.vr.cardboard.DisplaySynchronizer;
import com.google.vr.cardboard.EglReadyListener;
import defpackage.anfa;
import defpackage.baez;
import defpackage.bafa;
import defpackage.baff;
import defpackage.bafg;
import defpackage.bafh;
import defpackage.bafw;
import defpackage.bagb;
import defpackage.bagf;
import defpackage.bagi;
import defpackage.bahh;
import defpackage.bakh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

class GvrLayoutImpl extends FrameLayout {
    public static PresentationFactory sOptionalPresentationFactory;
    public bafa androidPCompat;
    public int asyncReprojectionFlags;
    public boolean attachedToWindow;
    public boolean autoFadeEnabled;
    public CardboardEmulator cardboardEmulator;
    public SdkDaydreamTouchListener daydreamTouchListener;
    public DaydreamUtilsWrapper daydreamUtils;
    public DisplaySynchronizer displaySynchronizer;
    public bafg eglFactory;
    public EglReadyListener eglReadyListener;
    public ExtensionManager extensionManager;
    public FadeOverlayView fadeOverlayView;
    public FrameFlushWorkaround frameFlushWorkaround;
    public GvrApi gvrApi;
    public boolean isResumed;
    public PresentationHelper presentationHelper;
    public FrameLayout presentationLayout;
    public View presentationView;
    public bagf scanlineRacingRenderer;
    public AsyncReprojectionSurfaceView scanlineRacingView;
    public ScreenOnManager screenOnManager;
    public final Runnable showRenderingViewsRunnable;
    public boolean stereoModeEnabled;
    public ServiceConnection syncServiceConnection;
    public Messenger syncServiceReceiver;
    public Messenger syncServiceSender;
    public GvrUiLayoutImpl uiLayout;
    public boolean useSyncService;
    public ExternalSurface videoSurface;
    public VrCoreSdkClient vrCoreSdkClient;

    class FrameFlushWorkaround implements FrameCallback {
        public final Choreographer choreographer = Choreographer.getInstance();
        public int framesRemaining;

        public void onResume() {
            if (this.framesRemaining > 0) {
                this.choreographer.removeFrameCallback(this);
            }
            this.framesRemaining = 5;
            this.choreographer.postFrameCallback(this);
        }

        public void doFrame(long j) {
            int i = this.framesRemaining - 1;
            this.framesRemaining = i;
            if (i > 0) {
                this.choreographer.postFrameCallback(this);
            }
        }
    }

    interface PresentationFactory {
        Presentation create(Context context, Display display);
    }

    class PresentationHelper implements DisplayListener {
        public final Context context;
        public final DisplayManager displayManager;
        public final DisplaySynchronizer displaySynchronizer;
        public String externalDisplayName;
        public final LayoutParams layout = new LayoutParams(-1, -1);
        public final List listeners;
        public final FrameLayout originalParent;
        public Presentation presentation;
        public final View view;

        PresentationHelper(Context context, FrameLayout frameLayout, View view, DisplaySynchronizer displaySynchronizer, String str) {
            this.context = context;
            this.originalParent = frameLayout;
            this.view = view;
            this.displaySynchronizer = displaySynchronizer;
            this.externalDisplayName = str;
            this.displayManager = (DisplayManager) context.getSystemService("display");
            this.listeners = new ArrayList();
        }

        public void onDisplayChanged(int i) {
        }

        public boolean isPresenting() {
            Presentation presentation = this.presentation;
            return presentation != null && presentation.isShowing();
        }

        public void onPause() {
            this.displayManager.unregisterDisplayListener(this);
        }

        public void onResume() {
            this.externalDisplayName = bafh.b(this.context);
            Display display = null;
            if (this.externalDisplayName == null) {
                setDisplay(null);
                return;
            }
            this.displayManager.registerDisplayListener(this, null);
            for (Display display2 : this.displayManager.getDisplays()) {
                if (isValidExternalDisplay(display2)) {
                    display = display2;
                    break;
                }
            }
            setDisplay(display);
        }

        public void shutdown() {
            this.displayManager.unregisterDisplayListener(this);
            Presentation presentation = this.presentation;
            if (presentation != null) {
                presentation.cancel();
                this.presentation = null;
                for (PresentationListener onPresentationStopped : this.listeners) {
                    onPresentationStopped.onPresentationStopped();
                }
            }
        }

        public void onDetachedFromWindow() {
            this.displayManager.unregisterDisplayListener(this);
            setDisplay(null);
        }

        public void onDisplayAdded(int i) {
            Display display = this.displayManager.getDisplay(i);
            if (isValidExternalDisplay(display)) {
                setDisplay(display);
            }
        }

        public void onDisplayRemoved(int i) {
            Presentation presentation = this.presentation;
            if (presentation != null && presentation.getDisplay().getDisplayId() == i) {
                setDisplay(null);
            }
        }

        private void setDisplay(Display display) {
            Display display2;
            Presentation presentation = this.presentation;
            Display display3 = presentation != null ? presentation.getDisplay() : null;
            if (!hasCurrentPresentationExpired()) {
                if (display == display3) {
                    return;
                }
                if (display != null && display3 != null && display.getDisplayId() == display3.getDisplayId() && display.getFlags() == display3.getFlags() && display.isValid() == display3.isValid() && display.getName().equals(display3.getName())) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    display.getMetrics(displayMetrics);
                    display3.getMetrics(displayMetrics2);
                    if (displayMetrics.equals(displayMetrics2)) {
                        return;
                    }
                }
            }
            presentation = this.presentation;
            if (presentation != null) {
                presentation.dismiss();
                this.presentation = null;
            }
            detachViewFromParent(this.view);
            if (display != null) {
                Presentation create;
                if (GvrLayoutImpl.sOptionalPresentationFactory != null) {
                    create = GvrLayoutImpl.sOptionalPresentationFactory.create(this.context, display);
                } else {
                    create = new Presentation(this.context, display);
                }
                this.presentation = create;
                this.presentation.addContentView(this.view, this.layout);
                try {
                    this.presentation.show();
                } catch (InvalidDisplayException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 57);
                    stringBuilder.append("Attaching Cardboard View to the external display failed: ");
                    stringBuilder.append(valueOf);
                    Log.e("GvrLayoutImpl", stringBuilder.toString());
                    this.presentation.cancel();
                    this.presentation = null;
                    detachViewFromParent(this.view);
                    this.originalParent.addView(this.view, 0);
                }
            } else {
                this.originalParent.addView(this.view, 0);
            }
            DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
            Presentation presentation2 = this.presentation;
            if (presentation2 != null) {
                display2 = presentation2.getDisplay();
            } else {
                display2 = bafh.a(this.context);
            }
            displaySynchronizer.a(display2);
            if (presentation != null) {
                for (PresentationListener onPresentationStopped : this.listeners) {
                    onPresentationStopped.onPresentationStopped();
                }
            }
            if (this.presentation != null) {
                for (PresentationListener onPresentationStopped2 : this.listeners) {
                    onPresentationStopped2.onPresentationStarted(this.presentation.getDisplay());
                }
            }
        }

        private static void detachViewFromParent(View view) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }

        private boolean isValidExternalDisplay(Display display) {
            return display != null && display.isValid() && display.getName().equals(this.externalDisplayName);
        }

        private boolean hasCurrentPresentationExpired() {
            Presentation presentation = this.presentation;
            if (presentation == null) {
                return false;
            }
            if (presentation.isShowing() && this.presentation.getDisplay().isValid()) {
                return false;
            }
            return true;
        }
    }

    interface PresentationListener {
        void onPresentationStarted(Display display);

        void onPresentationStopped();
    }

    class SyncServiceHandler extends Handler {
        public final WeakReference gvrLayout;

        public SyncServiceHandler(WeakReference weakReference) {
            super(Looper.getMainLooper());
            this.gvrLayout = weakReference;
        }

        public void handleMessage(Message message) {
            if (message.what == 0) {
                TraceCompat.beginSection("GvrLayoutImpl.ReceiveLatch");
                try {
                    Bundle data = message.getData();
                    data.setClassLoader(getClass().getClassLoader());
                    LatchRecord latchRecord = (LatchRecord) data.getParcelable("latchRecord");
                    GvrLayoutImpl gvrLayoutImpl = (GvrLayoutImpl) this.gvrLayout.get();
                    if (gvrLayoutImpl != null) {
                        gvrLayoutImpl.onCompositorLatch(latchRecord.serializedLatchRecord);
                    }
                    TraceCompat.endSection();
                } catch (Throwable th) {
                    TraceCompat.endSection();
                }
            }
        }
    }

    class AsyncReprojectionSurfaceView extends GvrSurfaceView {
        public bagf scanlineRacingRenderer;

        AsyncReprojectionSurfaceView(Context context) {
            super(context);
        }

        public void setRenderer(bagf bagf) {
            this.scanlineRacingRenderer = bagf;
            super.setRenderer(bagf);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (isDetachedFromWindow() || this.scanlineRacingRenderer == null) {
                onSurfaceDestroyed(null);
            } else {
                onSurfaceDestroyed(new Runnable() {
                    public void run() {
                        AsyncReprojectionSurfaceView.this.scanlineRacingRenderer.a();
                    }
                });
            }
        }
    }

    class ScreenOnManager implements IdleListener {
        public static final long QUIET_PERIOD_AFTER_RESUME_MILLIS = TimeUnit.SECONDS.toMillis(5);
        public boolean isEnabled = true;
        public boolean isIdle;
        public boolean isResumed;
        public long lastResumeTimeMillis;
        public final View parentView;

        public ScreenOnManager(View view) {
            this.parentView = view;
        }

        public void onResume() {
            this.isResumed = true;
            this.isIdle = false;
            this.lastResumeTimeMillis = SystemClock.elapsedRealtime();
            updateSetScreenOn();
        }

        public void onPause() {
            this.isResumed = false;
            updateSetScreenOn();
        }

        public void setEnabled(final boolean z) {
            bagi.a(new Runnable() {
                public void run() {
                    boolean access$800 = ScreenOnManager.this.isEnabled;
                    boolean z = z;
                    if (access$800 != z) {
                        ScreenOnManager.this.isEnabled = z;
                        ScreenOnManager.this.updateSetScreenOn();
                    }
                }
            });
        }

        public void onIdleChanged(final boolean z) {
            bagi.a(new Runnable() {
                public void run() {
                    TraceCompat.beginSection("GvrLayoutImpl.onIdleChanged");
                    try {
                        if (SystemClock.elapsedRealtime() - ScreenOnManager.this.lastResumeTimeMillis >= ScreenOnManager.QUIET_PERIOD_AFTER_RESUME_MILLIS) {
                            ScreenOnManager.this.isIdle;
                            ScreenOnManager.this.isIdle = z;
                            ScreenOnManager.this.updateSetScreenOn();
                            return;
                        }
                        TraceCompat.endSection();
                    } finally {
                        TraceCompat.endSection();
                    }
                }
            });
        }

        private void updateSetScreenOn() {
            View view = this.parentView;
            boolean z = false;
            if (this.isEnabled && this.isResumed && !this.isIdle) {
                z = true;
            }
            view.setKeepScreenOn(z);
        }
    }

    public GvrLayoutImpl(Context context) {
        this(context, null);
    }

    public GvrLayoutImpl(Context context, ExtensionManager extensionManager) {
        super(context);
        this.asyncReprojectionFlags = -1;
        this.autoFadeEnabled = true;
        this.isResumed = false;
        this.stereoModeEnabled = true;
        this.showRenderingViewsRunnable = new Runnable() {
            public void run() {
                GvrLayoutImpl.this.updateRenderingViewsVisibility(0);
            }
        };
        this.useSyncService = true;
        if ((context instanceof bahh) || baff.a(context) != null) {
            init(null);
            return;
        }
        throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
    }

    private void init(ExtensionManager extensionManager) {
        DisplaySynchronizer createDefaultDisplaySynchronizer = GvrApi.createDefaultDisplaySynchronizer(getContext());
        initWithInjectedObjects(new GvrApi(getContext(), createDefaultDisplaySynchronizer), createDefaultDisplaySynchronizer, new EglReadyListener(), null, new DaydreamUtilsWrapper(), null, new GvrUiLayoutImpl(getContext(), new Runnable() {
            public void run() {
                if (GvrLayoutImpl.this.vrCoreSdkClient != null) {
                    GvrLayoutImpl.this.vrCoreSdkClient.onExitingFromVr();
                }
            }
        }), new bafa());
    }

    private void initWithInjectedObjects(GvrApi gvrApi, DisplaySynchronizer displaySynchronizer, EglReadyListener eglReadyListener, FadeOverlayView fadeOverlayView, DaydreamUtilsWrapper daydreamUtilsWrapper, ExtensionManager extensionManager, GvrUiLayoutImpl gvrUiLayoutImpl, bafa bafa) {
        this.gvrApi = gvrApi;
        if (isContextSharingEnabled()) {
            gvrApi.requestContextSharing(eglReadyListener);
        }
        this.daydreamUtils = daydreamUtilsWrapper;
        this.presentationLayout = new FrameLayout(getContext());
        this.uiLayout = gvrUiLayoutImpl;
        this.displaySynchronizer = displaySynchronizer;
        this.eglReadyListener = eglReadyListener;
        this.presentationHelper = tryCreatePresentationHelper();
        this.frameFlushWorkaround = new FrameFlushWorkaround();
        addView(this.presentationLayout, 0);
        addView(gvrUiLayoutImpl.getRoot(), 1);
        updateUiLayout();
        boolean isDaydreamPhone = daydreamUtilsWrapper.isDaydreamPhone(getContext());
        if (isDaydreamPhone) {
            this.daydreamTouchListener = createDaydreamTouchListener();
            gvrUiLayoutImpl.getRoot().setOnTouchListener(this.daydreamTouchListener);
        }
        DaydreamCompatibility componentDaydreamCompatibility = daydreamUtilsWrapper.getComponentDaydreamCompatibility(getContext());
        boolean supportsDaydream = componentDaydreamCompatibility.supportsDaydream();
        boolean requiresDaydream = componentDaydreamCompatibility.requiresDaydream();
        if (isDaydreamPhone || requiresDaydream) {
            if (supportsDaydream) {
                if (getContext() instanceof bahh) {
                    getContext();
                    this.autoFadeEnabled = true;
                }
                this.fadeOverlayView = new FadeOverlayView(getContext(), this.autoFadeEnabled);
                addView(this.fadeOverlayView, 2);
            }
            this.vrCoreSdkClient = createVrCoreSdkClient(getContext(), gvrApi, daydreamUtilsWrapper, this.fadeOverlayView);
        }
        this.screenOnManager = new ScreenOnManager(this);
        if (isDeviceDetectionEnabled()) {
            gvrApi.setIdleListener(this.screenOnManager);
        }
        this.extensionManager = null;
        this.androidPCompat = bafa;
    }

    public GvrUiLayoutImpl getUiLayoutImpl() {
        return this.uiLayout;
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        updateFadeVisibility();
        if (!isDimUiEnabled()) {
            return;
        }
        if (i != 0) {
            this.uiLayout.cancelDimmingUiLayer();
        } else {
            this.uiLayout.delayDimmingUiLayerAfterVisible();
        }
    }

    public void onPause() {
        VrCoreSdkClient vrCoreSdkClient;
        unregisterLatchListener();
        if (this.extensionManager != null) {
            vrCoreSdkClient = this.vrCoreSdkClient;
            if (!(vrCoreSdkClient == null || vrCoreSdkClient.getLoggingService() == null)) {
                this.extensionManager.reportTelemetry(this.vrCoreSdkClient.getLoggingService());
            }
        }
        this.gvrApi.pause();
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = this.scanlineRacingView;
        if (asyncReprojectionSurfaceView != null) {
            asyncReprojectionSurfaceView.onPause(new Runnable() {
                public void run() {
                    GvrLayoutImpl.this.scanlineRacingRenderer.a();
                }
            });
        }
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onPause();
        }
        this.displaySynchronizer.a();
        vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.onPause();
        }
        CardboardEmulator cardboardEmulator = this.cardboardEmulator;
        if (cardboardEmulator != null) {
            cardboardEmulator.onPause();
        }
        ExtensionManager extensionManager = this.extensionManager;
        if (extensionManager != null) {
            extensionManager.onPause();
        }
        this.screenOnManager.onPause();
        this.isResumed = false;
        updateFadeVisibility();
    }

    public void onResume() {
        this.gvrApi.resume();
        SdkDaydreamTouchListener sdkDaydreamTouchListener = this.daydreamTouchListener;
        if (sdkDaydreamTouchListener != null) {
            sdkDaydreamTouchListener.refreshViewerProfile();
        }
        DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
        displaySynchronizer.c();
        bafw bafw = displaySynchronizer.b;
        if (!(bafw == null || bafw.c)) {
            bafw.c = true;
            bafw.b.sendEmptyMessage(1);
        }
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onResume();
        }
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = this.scanlineRacingView;
        if (asyncReprojectionSurfaceView != null) {
            asyncReprojectionSurfaceView.onResume();
        }
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.onResume();
        }
        if (this.cardboardEmulator != null && this.gvrApi.getViewerType() == 1) {
            this.cardboardEmulator.onResume();
        }
        ExtensionManager extensionManager = this.extensionManager;
        if (extensionManager != null) {
            extensionManager.onResume();
        }
        this.screenOnManager.onResume();
        this.frameFlushWorkaround.onResume();
        this.isResumed = true;
        updateFadeVisibility();
        updateUiLayout();
        registerLatchListener();
    }

    public void onBackPressed() {
        this.uiLayout.invokeCloseButtonListener();
    }

    public void shutdown() {
        DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
        if (displaySynchronizer.a != 0) {
            displaySynchronizer.a();
            bafw bafw = displaySynchronizer.b;
            if (bafw != null) {
                bafw.b();
            }
            displaySynchronizer.nativeDestroy(displaySynchronizer.a);
            displaySynchronizer.a = 0;
        }
        SdkDaydreamTouchListener sdkDaydreamTouchListener = this.daydreamTouchListener;
        if (sdkDaydreamTouchListener != null) {
            sdkDaydreamTouchListener.shutdown();
        }
        removeView(this.presentationLayout);
        removeView(this.uiLayout.getRoot());
        this.scanlineRacingRenderer = null;
        ExternalSurface externalSurface = this.videoSurface;
        if (externalSurface != null) {
            externalSurface.shutdown();
            this.videoSurface = null;
        }
        this.scanlineRacingView = null;
        this.presentationView = null;
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.shutdown();
            this.presentationHelper = null;
        }
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.onPause();
            this.vrCoreSdkClient = null;
        }
        CardboardEmulator cardboardEmulator = this.cardboardEmulator;
        if (cardboardEmulator != null) {
            cardboardEmulator.onPause();
            this.cardboardEmulator = null;
        }
        ExtensionManager extensionManager = this.extensionManager;
        if (extensionManager != null) {
            extensionManager.shutdown();
            this.extensionManager = null;
        }
        GvrApi gvrApi = this.gvrApi;
        if (gvrApi != null) {
            gvrApi.shutdown();
            this.gvrApi = null;
        }
        unregisterLatchListener();
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        updateFadeVisibility();
        updateMarginsForDisplayCutout();
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        this.attachedToWindow = false;
        updateFadeVisibility();
        super.onDetachedFromWindow();
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onDetachedFromWindow();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.displaySynchronizer.c();
        updateMarginsForDisplayCutout();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.presentationView != null && isPresenting() && this.presentationView.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPresentationView(View view) {
        View view2 = this.presentationView;
        if (view2 != null) {
            this.presentationLayout.removeView(view2);
        }
        this.presentationLayout.addView(view, 0);
        this.presentationView = view;
    }

    public boolean enableAsyncReprojection(int i) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            int i2 = this.asyncReprojectionFlags;
            if (i2 == -1) {
                if (this.scanlineRacingView != null) {
                    return true;
                }
                if (!this.daydreamUtils.isDaydreamPhone(getContext())) {
                    return false;
                }
                if (this.gvrApi.setAsyncReprojectionEnabled(true)) {
                    this.asyncReprojectionFlags = i;
                    if (this.gvrApi.usingVrDisplayService()) {
                        DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
                        bafw bafw = displaySynchronizer.b;
                        if (bafw != null) {
                            bafw.b();
                            displaySynchronizer.b = null;
                        }
                    } else {
                        addScanlineRacingView();
                    }
                    return true;
                }
                Log.e("GvrLayoutImpl", "Failed to initialize async reprojection, unsupported device.");
                return false;
            } else if ((i2 & i) == i) {
                return true;
            } else {
                throw new UnsupportedOperationException("Async reprojection flags cannot be added once initialized.");
            }
        }
        throw new IllegalStateException("Async reprojection may only be enabled from the UI thread");
    }

    public boolean enableCardboardTriggerEmulation(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException("The Cardboard trigger listener must not be null.");
        } else if (this.cardboardEmulator != null) {
            return true;
        } else {
            if (!this.daydreamUtils.isDaydreamPhone(getContext())) {
                return false;
            }
            this.cardboardEmulator = new CardboardEmulator(getContext(), runnable);
            return true;
        }
    }

    public GvrApi getGvrApi() {
        return this.gvrApi;
    }

    /* Access modifiers changed, original: protected */
    public VrCoreSdkClient createVrCoreSdkClient(Context context, GvrApi gvrApi, DaydreamUtilsWrapper daydreamUtilsWrapper, FadeOverlayView fadeOverlayView) {
        return new VrCoreSdkClient(context, gvrApi, baff.b(context), daydreamUtilsWrapper, new Runnable() {
            public void run() {
                GvrLayoutImpl.this.uiLayout.invokeCloseButtonListener();
            }
        }, fadeOverlayView);
    }

    public void setStereoModeEnabled(boolean z) {
        bagi.a(new GvrLayoutImpl$$Lambda$0(this, z));
    }

    private void updateMarginsForDisplayCutout() {
        Activity a = baff.a(getContext());
        if (!(a == null || a.getWindow() == null)) {
            Window window = a.getWindow();
            if (bafa.a()) {
                try {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (WindowManager.LayoutParams.class.getField("layoutInDisplayCutoutMode").get(attributes) == WindowManager.LayoutParams.class.getField("LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES").get(null)) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
                        if (this.stereoModeEnabled) {
                            baez a2 = bafa.a(bafh.a(getContext()));
                            if (a2 != null) {
                                layoutParams.setMargins(a2.c(), a2.a(), a2.d(), a2.b());
                            }
                        } else {
                            layoutParams.setMargins(0, 0, 0, 0);
                        }
                        setLayoutParams(layoutParams);
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 56);
                    stringBuilder.append("Failed to determine if window extends into cutout area: ");
                    stringBuilder.append(valueOf);
                    Log.e("AndroidPCompat", stringBuilder.toString());
                }
            }
        }
    }

    private void setStereoModeEnabledImpl(boolean z) {
        if (this.stereoModeEnabled != z) {
            this.stereoModeEnabled = z;
            updateMarginsForDisplayCutout();
            this.uiLayout.setEnabled(z);
            VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
            if (vrCoreSdkClient != null) {
                vrCoreSdkClient.setEnabled(z);
            }
            FadeOverlayView fadeOverlayView = this.fadeOverlayView;
            if (fadeOverlayView != null) {
                fadeOverlayView.setEnabled(z);
            }
            SdkDaydreamTouchListener sdkDaydreamTouchListener = this.daydreamTouchListener;
            if (sdkDaydreamTouchListener != null) {
                sdkDaydreamTouchListener.setEnabled(z);
            }
            ExtensionManager extensionManager = this.extensionManager;
            if (extensionManager != null) {
                extensionManager.setEnabled(z);
            }
            this.screenOnManager.setEnabled(z);
            updateRenderingViewsVisibility(0);
        }
    }

    public void setReentryIntent(PendingIntent pendingIntent) {
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.setReentryIntent(pendingIntent);
        }
    }

    public boolean setOnDonNotNeededListener(Runnable runnable) {
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient == null) {
            return false;
        }
        vrCoreSdkClient.setOnDonNotNeededListener(runnable);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isPresenting() {
        if (this.presentationView != null) {
            PresentationHelper presentationHelper = this.presentationHelper;
            if (presentationHelper != null && presentationHelper.isPresenting()) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public VrCoreSdkClient getVrCoreSdkClient() {
        return this.vrCoreSdkClient;
    }

    /* Access modifiers changed, original: 0000 */
    public SdkDaydreamTouchListener createDaydreamTouchListener() {
        return new SdkDaydreamTouchListener(this);
    }

    private boolean isDeviceDetectionEnabled() {
        return (this.gvrApi.getSdkConfigurationParams().bitField0_ & 256) != 0 ? this.gvrApi.getSdkConfigurationParams().useDeviceIdleDetection_ : false;
    }

    private boolean isContextSharingEnabled() {
        if (this.gvrApi != null) {
            if (!(DaydreamApi.bootsToVr(getContext()) || (this.gvrApi.getSdkConfigurationParams().bitField0_ & 64) == 0)) {
                anfa anfa = this.gvrApi.getSdkConfigurationParams().asyncReprojectionConfig_;
                if (anfa == null) {
                    anfa = anfa.DEFAULT_INSTANCE;
                }
                if ((anfa.bitField0_ & 1) == 0 || (anfa.flags_ & 16) == 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("GvrApi must be ready before isContextSharingEnabled is called");
    }

    private boolean isDimUiEnabled() {
        GvrApi gvrApi = this.gvrApi;
        if (gvrApi != null) {
            Boolean valueOf = (gvrApi.getSdkConfigurationParams().bitField0_ & 262144) != 0 ? Boolean.valueOf(this.gvrApi.getSdkConfigurationParams().dimUiLayer_) : null;
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return false;
    }

    private void addScanlineRacingView() {
        if (this.scanlineRacingView == null) {
            this.eglFactory = new bafg();
            this.eglFactory.c = this.gvrApi.isOpenGLKHRDebugEnabled();
            bafg bafg = this.eglFactory;
            bafg.a = true;
            bafg.b = (this.asyncReprojectionFlags & 1) != 0;
            bafg.e = 3;
            this.scanlineRacingView = new AsyncReprojectionSurfaceView(getContext());
            this.scanlineRacingView.setEGLConfigChooser(new bagb());
            this.scanlineRacingView.setZOrderMediaOverlay(true);
            this.scanlineRacingView.setEGLContextFactory(this.eglFactory);
            this.scanlineRacingView.setEGLWindowSurfaceFactory(this.eglFactory);
            if (isContextSharingEnabled()) {
                this.scanlineRacingView.setEglReadyListener(this.eglReadyListener);
            }
            if (!this.stereoModeEnabled) {
                Log.w("GvrLayoutImpl", "Disabling stereo mode with async reprojection enabled may not work properly.");
                this.scanlineRacingView.setVisibility(8);
            }
            if (this.scanlineRacingRenderer == null) {
                this.scanlineRacingRenderer = new bagf(this.gvrApi);
            }
            bagf bagf = this.scanlineRacingRenderer;
            AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = this.scanlineRacingView;
            if (asyncReprojectionSurfaceView != null) {
                bagf.a = asyncReprojectionSurfaceView;
                asyncReprojectionSurfaceView.setRenderer(bagf);
                this.scanlineRacingView.setSwapMode(1);
                if (!this.isResumed) {
                    this.scanlineRacingView.onPause();
                }
                this.presentationLayout.addView(this.scanlineRacingView, 0);
                return;
            }
            throw new IllegalArgumentException("GvrSurfaceView must be supplied for proper scanline rendering");
        }
    }

    private PresentationHelper tryCreatePresentationHelper() {
        String b = bafh.b(getContext());
        if (b == null) {
            Log.e("GvrLayoutImpl", "HDMI display name could not be found, disabling external presentation support");
            return null;
        }
        return new PresentationHelper(getContext(), this, this.presentationLayout, this.displaySynchronizer, b);
    }

    private void updateRenderingViewsVisibility(int i) {
        View view = this.presentationView;
        if (view != null) {
            view.setVisibility(!this.stereoModeEnabled ? 0 : i);
        }
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = this.scanlineRacingView;
        if (asyncReprojectionSurfaceView != null) {
            if (!this.stereoModeEnabled) {
                i = 8;
            }
            asyncReprojectionSurfaceView.setVisibility(i);
        }
    }

    private void updateFadeVisibility() {
        FadeOverlayView fadeOverlayView = this.fadeOverlayView;
        if (fadeOverlayView != null) {
            if (this.autoFadeEnabled) {
                if (this.attachedToWindow && getWindowVisibility() == 0) {
                    if (this.isResumed) {
                        this.fadeOverlayView.onVisible();
                        removeCallbacks(this.showRenderingViewsRunnable);
                        postDelayed(this.showRenderingViewsRunnable, 50);
                    }
                } else if (!this.isResumed) {
                    this.fadeOverlayView.onInvisible();
                    updateRenderingViewsVisibility(4);
                    removeCallbacks(this.showRenderingViewsRunnable);
                }
            } else if (this.isResumed) {
                fadeOverlayView.onVisible();
            } else {
                fadeOverlayView.onInvisible();
            }
        }
    }

    private void updateUiLayout() {
        boolean z = true;
        if (this.gvrApi.getViewerType() != 1) {
            z = false;
        }
        this.uiLayout.setDaydreamModeEnabled(z);
    }

    private void registerLatchListener() {
        if (this.useSyncService && this.gvrApi.usingVrDisplayService() && this.syncServiceConnection == null) {
            if (this.syncServiceReceiver == null) {
                this.syncServiceReceiver = new Messenger(new SyncServiceHandler(new WeakReference(this)));
            }
            this.syncServiceConnection = new ServiceConnection() {
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    GvrLayoutImpl.this.syncServiceSender = new Messenger(iBinder);
                    Message message = new Message();
                    message.what = 0;
                    message.replyTo = GvrLayoutImpl.this.syncServiceReceiver;
                    try {
                        GvrLayoutImpl.this.syncServiceSender.send(message);
                    } catch (RemoteException unused) {
                        Log.e("GvrLayoutImpl", "Failed to register latch listener");
                    }
                }

                public void onServiceDisconnected(ComponentName componentName) {
                    GvrLayoutImpl.this.syncServiceSender = null;
                }
            };
            if (!getContext().bindService(new Intent().setComponent(bakh.a), this.syncServiceConnection, 1)) {
                Log.e("GvrLayoutImpl", "Failed to bind SyncService");
                getContext().unbindService(this.syncServiceConnection);
                this.syncServiceConnection = null;
            }
        }
    }

    private void unregisterLatchListener() {
        if (this.syncServiceConnection != null) {
            if (this.syncServiceSender != null) {
                Message message = new Message();
                message.what = 1;
                message.replyTo = this.syncServiceReceiver;
                try {
                    this.syncServiceSender.send(message);
                } catch (RemoteException unused) {
                    Log.e("GvrLayoutImpl", "Failed to unregister latch listener");
                }
            }
            getContext().unbindService(this.syncServiceConnection);
            this.syncServiceConnection = null;
            this.syncServiceSender = null;
        }
    }

    private void onCompositorLatch(byte[] bArr) {
        GvrApi gvrApi = this.gvrApi;
        if (gvrApi != null) {
            gvrApi.onCompositorLatch(bArr);
        }
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void lambda$setStereoModeEnabled$0$GvrLayoutImpl(boolean z) {
        setStereoModeEnabledImpl(z);
    }
}
