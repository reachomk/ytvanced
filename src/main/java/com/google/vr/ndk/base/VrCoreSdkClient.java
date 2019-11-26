package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import defpackage.baff;
import defpackage.bagi;
import defpackage.bahb;
import defpackage.bahh;
import defpackage.bahp;
import defpackage.bahr;
import defpackage.bahs;
import defpackage.bahv;
import defpackage.bahy;
import defpackage.bahz;
import defpackage.bakj;
import java.lang.ref.WeakReference;

class VrCoreSdkClient {
    public final Runnable closeVrRunnable;
    public final ComponentName componentName;
    public final Context context;
    public final DaydreamListenerImpl daydreamListener;
    public bahv daydreamManager;
    public final DaydreamUtilsWrapper daydreamUtils;
    public final FadeOverlayView fadeOverlayView;
    public final GvrApi gvrApi;
    public AlertDialog helpCenterDialog;
    public boolean isBound;
    public boolean isEnabled = true;
    public boolean isResumed;
    public bakj loggingService;
    public Runnable onDonNotNeededListener;
    public PendingIntent optionalReentryIntent;
    public final ServiceConnection serviceConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            bahz bahz;
            String valueOf;
            StringBuilder stringBuilder;
            String str = "VrCoreSdkClient";
            if (iBinder == null) {
                bahz = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
                if (queryLocalInterface instanceof bahz) {
                    bahz = (bahz) queryLocalInterface;
                } else {
                    bahz = new bahy(iBinder);
                }
            }
            try {
                if (bahz.b()) {
                    VrCoreSdkClient.this.vrCoreSdkService = bahz;
                    try {
                        VrCoreSdkClient vrCoreSdkClient = VrCoreSdkClient.this;
                        vrCoreSdkClient.daydreamManager = vrCoreSdkClient.vrCoreSdkService.c();
                        if (VrCoreSdkClient.this.daydreamManager == null) {
                            Log.w(str, "Failed to obtain DaydreamManager from VrCore SDK Service.");
                            VrCoreSdkClient.this.handleNoDaydreamManager();
                            return;
                        }
                        VrCoreSdkClient.this.daydreamManager.a(VrCoreSdkClient.this.componentName, VrCoreSdkClient.this.daydreamListener);
                        try {
                            bahr headTrackingState = VrCoreSdkClient.this.getHeadTrackingState();
                            int access$600 = VrCoreSdkClient.this.prepareVr(headTrackingState);
                            if (access$600 == 0) {
                                if (VrCoreSdkClient.this.onDonNotNeededListener != null) {
                                    VrCoreSdkClient.this.onDonNotNeededListener.run();
                                }
                            }
                            if (access$600 == 2) {
                                Log.e(str, "Daydream VR preparation failed, closing VR session.");
                                VrCoreSdkClient.this.handlePrepareVrFailed();
                                if (VrCoreSdkClient.this.isResumed) {
                                    VrCoreSdkClient.this.resumeTracking(null);
                                }
                                return;
                            }
                            if (access$600 != 0) {
                                headTrackingState = null;
                            }
                            if (VrCoreSdkClient.this.isResumed) {
                                VrCoreSdkClient.this.resumeTracking(headTrackingState);
                            }
                            try {
                                vrCoreSdkClient = VrCoreSdkClient.this;
                                vrCoreSdkClient.loggingService = vrCoreSdkClient.vrCoreSdkService.d();
                                return;
                            } catch (RemoteException e) {
                                valueOf = String.valueOf(e);
                                stringBuilder = new StringBuilder(valueOf.length() + 42);
                                stringBuilder.append("Error getting logging service from VrCore:");
                                stringBuilder.append(valueOf);
                                Log.w(str, stringBuilder.toString());
                                return;
                            }
                        } catch (RemoteException e2) {
                            valueOf = String.valueOf(e2);
                            StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 61);
                            stringBuilder2.append("Error while registering listener with the VrCore SDK Service:");
                            stringBuilder2.append(valueOf);
                            Log.w(str, stringBuilder2.toString());
                            if (VrCoreSdkClient.this.isResumed) {
                                VrCoreSdkClient.this.resumeTracking(null);
                            }
                        } catch (Throwable th) {
                            if (VrCoreSdkClient.this.isResumed) {
                                VrCoreSdkClient.this.resumeTracking(null);
                            }
                            throw th;
                        }
                    } catch (RemoteException e22) {
                        valueOf = String.valueOf(e22);
                        stringBuilder = new StringBuilder(valueOf.length() + 57);
                        stringBuilder.append("Failed to obtain DaydreamManager from VrCore SDK Service:");
                        stringBuilder.append(valueOf);
                        Log.w(str, stringBuilder.toString());
                        VrCoreSdkClient.this.handleNoDaydreamManager();
                        return;
                    }
                }
                Log.e(str, "Failed to initialize VrCore SDK Service.");
                VrCoreSdkClient.this.handleBindFailed();
            } catch (RemoteException e222) {
                valueOf = String.valueOf(e222);
                stringBuilder = new StringBuilder(valueOf.length() + 41);
                stringBuilder.append("Failed to initialize VrCore SDK Service: ");
                stringBuilder.append(valueOf);
                Log.w(str, stringBuilder.toString());
                VrCoreSdkClient.this.handleBindFailed();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            VrCoreSdkClient.this.vrCoreSdkService = null;
            VrCoreSdkClient.this.daydreamManager = null;
            VrCoreSdkClient.this.loggingService = null;
        }
    };
    public final boolean shouldBind;
    public int vrCoreClientApiVersion;
    public bahz vrCoreSdkService;

    final class DaydreamListenerImpl extends bahs {
        public final WeakReference closeVrRunnableWeak;
        public final WeakReference fadeOverlayViewWeak;
        public final WeakReference gvrApiWeak;
        public final Handler safeguardHandler = new Handler() {
            public void handleMessage(Message message) {
                int i = message.what;
                String str = "VrCoreSdkClient";
                if (i == 1) {
                    Log.w(str, "Forcing tracking resume: VrCore unresponsive");
                    DaydreamListenerImpl.this.resumeHeadTrackingImpl(null);
                } else if (i != 2) {
                    super.handleMessage(message);
                } else {
                    Log.w(str, "Forcing fade in: VrCore unresponsive");
                    DaydreamListenerImpl.this.applyColorfulFadeImpl(1, 350, -16777216);
                }
            }
        };

        DaydreamListenerImpl(GvrApi gvrApi, FadeOverlayView fadeOverlayView, Runnable runnable) {
            this.gvrApiWeak = new WeakReference(gvrApi);
            this.fadeOverlayViewWeak = new WeakReference(fadeOverlayView);
            this.closeVrRunnableWeak = new WeakReference(runnable);
        }

        public final int getTargetApiVersion() {
            return 25;
        }

        /* Access modifiers changed, original: final */
        public final void resetSafeguards() {
            this.safeguardHandler.removeCallbacksAndMessages(null);
        }

        public final bahr requestStopTracking() {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            bahr bahr = null;
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid requestStopTracking() call: GvrApi no longer valid");
                return null;
            }
            byte[] pauseTrackingGetState = gvrApi.pauseTrackingGetState();
            rescheduleSafeguard(1, 5000);
            if (pauseTrackingGetState != null) {
                bahr = new bahr(pauseTrackingGetState);
            }
            return bahr;
        }

        public final void applyFade(int i, long j) {
            applyColorfulFadeImpl(i, j, -16777216);
        }

        public final void applyColorfulFade(int i, long j, int i2) {
            applyColorfulFadeImpl(i, j, i2);
        }

        public final void recenterHeadTracking() {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid recenterHeadTracking() call: GvrApi no longer valid");
            } else {
                gvrApi.recenterTracking();
            }
        }

        public final void dumpDebugData() {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid dumpDebugData() call: GvrApi no longer valid");
            } else {
                gvrApi.dumpDebugData();
            }
        }

        public final void resumeHeadTracking(bahr bahr) {
            resumeHeadTrackingImpl(bahr);
        }

        public final void invokeCloseAction() {
            Runnable runnable = (Runnable) this.closeVrRunnableWeak.get();
            if (runnable == null) {
                Log.w("VrCoreSdkClient", "Invalid invokeCloseAction() call: Runnable no longer valid");
            } else {
                bagi.a(runnable);
            }
        }

        public final void deprecated_setLensOffsets(float f, float f2, float f3, float f4) {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid setLensOffsets() call: GvrApi no longer valid");
            } else {
                gvrApi.setLensOffset(f, f2, 0.0f);
            }
        }

        public final void setLensOffset(float f, float f2, float f3) {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid setLensOffset() call: GvrApi no longer valid");
            } else {
                gvrApi.setLensOffset(f, f2, f3);
            }
        }

        private final void resumeHeadTrackingImpl(bahr bahr) {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid resumeHeadTracking() call: GvrApi no longer valid");
                return;
            }
            cancelSafeguard(1);
            VrCoreSdkClient.resumeTracking(gvrApi, bahr);
        }

        private final void applyColorfulFadeImpl(int i, long j, int i2) {
            FadeOverlayView fadeOverlayView = (FadeOverlayView) this.fadeOverlayViewWeak.get();
            if (fadeOverlayView != null) {
                cancelSafeguard(2);
                final FadeOverlayView fadeOverlayView2 = fadeOverlayView;
                final int i3 = i;
                final long j2 = j;
                final int i4 = i2;
                fadeOverlayView.post(new Runnable(this) {
                    public void run() {
                        fadeOverlayView2.startFade(i3, j2, i4);
                    }
                });
                if (i == 2) {
                    rescheduleSafeguard(2, j + 5500);
                }
            }
        }

        private final void cancelSafeguard(int i) {
            this.safeguardHandler.removeMessages(i);
        }

        private final void rescheduleSafeguard(int i, long j) {
            cancelSafeguard(i);
            this.safeguardHandler.sendEmptyMessageDelayed(i, j);
        }
    }

    public VrCoreSdkClient(Context context, GvrApi gvrApi, ComponentName componentName, DaydreamUtilsWrapper daydreamUtilsWrapper, Runnable runnable, FadeOverlayView fadeOverlayView) {
        this.context = context;
        this.gvrApi = gvrApi;
        this.componentName = componentName;
        this.daydreamUtils = daydreamUtilsWrapper;
        this.closeVrRunnable = runnable;
        this.fadeOverlayView = fadeOverlayView;
        this.daydreamListener = new DaydreamListenerImpl(gvrApi, fadeOverlayView, runnable);
        this.shouldBind = hasCompatibleSdkService(context);
        gvrApi.setIgnoreManualTrackerPauseResume(true);
    }

    /* Access modifiers changed, original: 0000 */
    public bakj getLoggingService() {
        return this.loggingService;
    }

    /* Access modifiers changed, original: 0000 */
    public bahr getHeadTrackingState() {
        return new bahr();
    }

    public boolean onResume() {
        this.isResumed = true;
        return this.isEnabled ? doBind() : false;
    }

    public void onPause() {
        this.isResumed = false;
        this.daydreamListener.resetSafeguards();
        if (this.isEnabled) {
            doUnbind();
        }
    }

    public void setEnabled(boolean z) {
        if (this.isEnabled != z) {
            this.isEnabled = z;
            this.gvrApi.setIgnoreManualTrackerPauseResume(z);
            if (!this.isResumed) {
                return;
            }
            if (this.isEnabled) {
                doBind();
            } else {
                doUnbind();
            }
        }
    }

    public void setReentryIntent(PendingIntent pendingIntent) {
        this.optionalReentryIntent = pendingIntent;
    }

    public void setOnDonNotNeededListener(Runnable runnable) {
        this.onDonNotNeededListener = runnable;
    }

    public void onExitingFromVr() {
        bahv bahv = this.daydreamManager;
        if (bahv != null && this.vrCoreClientApiVersion >= 16) {
            try {
                bahv.d();
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 41);
                stringBuilder.append("Failed to signal exit from VR to VrCore: ");
                stringBuilder.append(valueOf);
                Log.e("VrCoreSdkClient", stringBuilder.toString());
            }
        }
    }

    /* JADX WARNING: Missing block: B:5:0x001f, code skipped:
            if (r0 == false) goto L_0x0021;
     */
    private boolean doBind() {
        /*
        r4 = this;
        r0 = r4.isBound;
        r1 = 1;
        if (r0 != 0) goto L_0x0027;
    L_0x0005:
        r0 = r4.shouldBind;
        if (r0 == 0) goto L_0x0021;
    L_0x0009:
        r0 = new android.content.Intent;
        r2 = "com.google.vr.vrcore.BIND_SDK_SERVICE";
        r0.<init>(r2);
        r2 = "com.google.vr.vrcore";
        r0.setPackage(r2);
        r2 = r4.context;
        r3 = r4.serviceConnection;
        r0 = r2.bindService(r0, r3, r1);
        r4.isBound = r0;
        if (r0 != 0) goto L_0x0024;
    L_0x0021:
        r4.handleBindFailed();
    L_0x0024:
        r0 = r4.isBound;
        return r0;
    L_0x0027:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.VrCoreSdkClient.doBind():boolean");
    }

    private void doUnbind() {
        if (this.isResumed) {
            resumeTracking(null);
        } else {
            this.gvrApi.pauseTrackingGetState();
        }
        if (this.isBound) {
            bahv bahv = this.daydreamManager;
            if (bahv != null) {
                try {
                    bahv.a(this.componentName);
                } catch (RemoteException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 40);
                    stringBuilder.append("Failed to unregister Daydream listener: ");
                    stringBuilder.append(valueOf);
                    Log.w("VrCoreSdkClient", stringBuilder.toString());
                }
                this.daydreamManager = null;
            }
            this.vrCoreSdkService = null;
            this.loggingService = null;
            this.context.unbindService(this.serviceConnection);
            this.isBound = false;
        }
    }

    private void handleBindFailed() {
        doUnbind();
        warnIfIncompatibleClient();
    }

    private void handleNoDaydreamManager() {
        doUnbind();
        warnIfIncompatibleClient();
    }

    private void handlePrepareVrFailed() {
        doUnbind();
        this.closeVrRunnable.run();
    }

    private void warnIfIncompatibleClient() {
        if (!this.daydreamUtils.isDaydreamPhone(this.context) && this.daydreamUtils.isDaydreamRequiredComponent(this.context) && !ActivityManager.isRunningInTestHarness()) {
            AlertDialog alertDialog = this.helpCenterDialog;
            if (alertDialog != null) {
                alertDialog.show();
            } else {
                this.helpCenterDialog = bahb.a(this.context, this.closeVrRunnable);
            }
        }
    }

    private void resumeTracking(bahr bahr) {
        resumeTracking(this.gvrApi, bahr);
        FadeOverlayView fadeOverlayView = this.fadeOverlayView;
        if (fadeOverlayView != null) {
            fadeOverlayView.flushAutoFade();
        }
    }

    private static void resumeTracking(GvrApi gvrApi, bahr bahr) {
        byte[] bArr = null;
        if (bahr != null) {
            byte[] bArr2 = bahr.a;
            if (!(bArr2 == null || bArr2.length == 0)) {
                bArr = bArr2;
            }
        }
        gvrApi.resumeTrackingSetState(bArr);
    }

    private boolean hasCompatibleSdkService(Context context) {
        try {
            int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            this.vrCoreClientApiVersion = vrCoreClientApiVersion;
            if (vrCoreClientApiVersion >= 5) {
                return true;
            }
            Log.w("VrCoreSdkClient", String.format("VrCore service obsolete, GVR SDK requires API %d but found API %d.", new Object[]{Integer.valueOf(5), Integer.valueOf(this.vrCoreClientApiVersion)}));
            return false;
        } catch (bahp unused) {
        }
    }

    private int prepareVr(bahr bahr) {
        if (this.vrCoreClientApiVersion < 13) {
            return this.daydreamManager.a(this.componentName, bahr);
        }
        DaydreamCompatibility componentDaydreamCompatibility = DaydreamUtils.getComponentDaydreamCompatibility(this.context, this.componentName);
        Parcelable parcelable = this.optionalReentryIntent;
        if (parcelable == null) {
            Intent createVrIntent = DaydreamApi.createVrIntent(this.componentName);
            createVrIntent.addFlags(536870912);
            Context context = this.context;
            if (!(context instanceof bahh)) {
                Activity a = baff.a(context);
                if (!(a == null || a.getIntent() == null)) {
                    createVrIntent.putExtras(a.getIntent());
                    createVrIntent.fillIn(a.getIntent(), 2);
                }
            }
            parcelable = PendingIntent.getActivity(this.context, 0, createVrIntent, 1073741824);
        }
        if (this.vrCoreClientApiVersion < 22) {
            return this.daydreamManager.a(this.componentName, componentDaydreamCompatibility.toDeprecated(), parcelable, bahr);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("COMPONENT_NAME_KEY", this.componentName);
        bundle.putInt("DAYDREAM_COMPATIBILITY_KEY", componentDaydreamCompatibility.toDeprecated());
        bundle.putInt("DAYDREAM_COMPATIBILITY_BITMASK_KEY", componentDaydreamCompatibility.getSupportedHeadsets());
        bundle.putParcelable("OPTIONAL_REENTRY_INTENT_KEY", parcelable);
        bundle.putBoolean("IS_USING_VR_DISPLAY_SERVICE_KEY", this.gvrApi.usingVrDisplayService());
        return this.daydreamManager.a(bundle, bahr);
    }
}
