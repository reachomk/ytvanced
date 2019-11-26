package com.google.vr.ndk.base;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.baff;
import defpackage.bagh;
import defpackage.bagi;
import defpackage.bagn;
import defpackage.bagr;
import defpackage.bagu;
import defpackage.bagx;
import defpackage.bagz;
import defpackage.baha;
import defpackage.bajy;
import defpackage.baka;

class GvrUiLayoutImpl extends bajy {
    public final Runnable beginDimmingUiLayerRunnable;
    public final CloseButtonListenerWrapper closeButtonListener;
    public boolean daydreamModeEnabled;
    public final Runnable delayDimmingUiLayerAfterVisibleRunnable;
    public final bagn uiLayer;
    public ObjectAnimator uiLayerDimmingAnimation;

    class CloseButtonListenerWrapper implements Runnable {
        public Runnable activeCloseButtonListener;
        public final Context context;
        public final Runnable defaultCloseButtonListener;
        public boolean invokingCloseButton = false;
        public final Runnable passiveCloseButtonListener;

        CloseButtonListenerWrapper(Context context, Runnable runnable, DaydreamUtilsWrapper daydreamUtilsWrapper) {
            this.context = context;
            this.passiveCloseButtonListener = runnable;
            this.defaultCloseButtonListener = GvrUiLayoutImpl.createDefaultCloseButtonListener(context, daydreamUtilsWrapper);
            this.activeCloseButtonListener = this.defaultCloseButtonListener;
        }

        public void run() {
            if (this.invokingCloseButton) {
                Log.w("GvrUiLayoutImpl", "GVR close behavior invoked recursively.");
                Activity a = baff.a(this.context);
                if (a != null) {
                    a.finish();
                }
                return;
            }
            this.invokingCloseButton = true;
            try {
                Runnable runnable = this.passiveCloseButtonListener;
                if (runnable != null) {
                    runnable.run();
                }
                runnable = this.activeCloseButtonListener;
                if (runnable != null) {
                    runnable.run();
                }
                this.invokingCloseButton = false;
            } catch (Throwable th) {
                this.invokingCloseButton = false;
            }
        }

        public void setClientCloseButtonListener(Runnable runnable) {
            if (runnable == null) {
                runnable = this.defaultCloseButtonListener;
            }
            this.activeCloseButtonListener = runnable;
        }
    }

    GvrUiLayoutImpl(Context context, Runnable runnable) {
        this(context, runnable, new DaydreamUtilsWrapper());
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void bridge$lambda$0$GvrUiLayoutImpl() {
        beginDimmingUiLayer();
    }

    GvrUiLayoutImpl(Context context, Runnable runnable, DaydreamUtilsWrapper daydreamUtilsWrapper) {
        this.delayDimmingUiLayerAfterVisibleRunnable = new GvrUiLayoutImpl$$Lambda$0(this);
        this.beginDimmingUiLayerRunnable = new GvrUiLayoutImpl$$Lambda$1(this);
        this.daydreamModeEnabled = false;
        this.closeButtonListener = new CloseButtonListenerWrapper(context, runnable, daydreamUtilsWrapper);
        this.uiLayer = new bagn(context);
        bagn bagn = this.uiLayer;
        CloseButtonListenerWrapper closeButtonListenerWrapper = this.closeButtonListener;
        bagn.l = closeButtonListenerWrapper;
        bagi.a(new bagz(bagn, closeButtonListenerWrapper));
    }

    public void setEnabled(boolean z) {
        bagn bagn = this.uiLayer;
        bagn.i = z;
        bagi.a(new bagx(bagn, z));
    }

    public baka getRootView() {
        return ObjectWrapper.a(this.uiLayer.b);
    }

    public boolean isEnabled() {
        return this.uiLayer.i;
    }

    public void setCloseButtonListener(baka baka) {
        this.closeButtonListener.setClientCloseButtonListener(baka != null ? (Runnable) ObjectWrapper.a(baka, Runnable.class) : null);
    }

    public void setTransitionViewEnabled(boolean z) {
        bagn bagn = this.uiLayer;
        boolean z2 = false;
        if (z && !this.daydreamModeEnabled) {
            z2 = true;
        }
        bagn.b(z2);
    }

    public void setTransitionViewListener(baka baka) {
        bagn bagn = this.uiLayer;
        Runnable runnable = baka != null ? (Runnable) ObjectWrapper.a(baka, Runnable.class) : null;
        bagn.n = runnable;
        bagi.a(new bagr(bagn, runnable));
    }

    public void setSettingsButtonEnabled(boolean z) {
        bagn bagn = this.uiLayer;
        bagn.j = z;
        bagi.a(new baha(bagn, z));
    }

    public void setSettingsButtonListener(baka baka) {
        this.uiLayer.m = baka != null ? (Runnable) ObjectWrapper.a(baka, Runnable.class) : null;
    }

    public void setViewerName(String str) {
        bagn bagn = this.uiLayer;
        bagn.o = str;
        bagi.a(new bagu(bagn, str));
    }

    /* Access modifiers changed, original: 0000 */
    public ViewGroup getRoot() {
        return this.uiLayer.b;
    }

    /* Access modifiers changed, original: 0000 */
    public void invokeCloseButtonListener() {
        this.closeButtonListener.run();
    }

    /* Access modifiers changed, original: 0000 */
    public void setDaydreamModeEnabled(boolean z) {
        if (this.daydreamModeEnabled != z) {
            this.daydreamModeEnabled = z;
            if (z) {
                this.uiLayer.a(0.35f);
                this.uiLayer.b(false);
                return;
            }
            this.uiLayer.a(1.0f);
        }
    }

    private void delayDimmingUiLayer(long j) {
        cancelDimmingUiLayer();
        getRoot().postDelayed(this.beginDimmingUiLayerRunnable, j);
    }

    /* Access modifiers changed, original: 0000 */
    public void delayDimmingUiLayerAfterVisible() {
        delayDimmingUiLayer(2500);
    }

    private void beginDimmingUiLayer() {
        cancelDimmingUiLayer();
        bagh bagh = this.uiLayer.h;
        if (bagh == null || bagh.getVisibility() != 0) {
            this.uiLayerDimmingAnimation = ObjectAnimator.ofFloat(this.uiLayer.b, View.ALPHA, new float[]{1.0f, 0.2f});
            this.uiLayerDimmingAnimation.setDuration(500);
            this.uiLayerDimmingAnimation.start();
            setDimmedUiTouchOverride();
            return;
        }
        getRoot().postDelayed(this.delayDimmingUiLayerAfterVisibleRunnable, 100);
    }

    private void setDimmedUiTouchOverride() {
        this.uiLayer.k = new GvrUiLayoutImpl$$Lambda$2(this);
    }

    /* Access modifiers changed, original: 0000 */
    public void cancelDimmingUiLayer() {
        getRoot().removeCallbacks(this.beginDimmingUiLayerRunnable);
        ObjectAnimator objectAnimator = this.uiLayerDimmingAnimation;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.uiLayerDimmingAnimation = null;
        }
        this.uiLayer.b.setAlpha(1.0f);
        this.uiLayer.k = null;
    }

    private static Runnable createDefaultCloseButtonListener(final Context context, DaydreamUtilsWrapper daydreamUtilsWrapper) {
        final Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        final Activity a = baff.a(context);
        if (a == null) {
            return new Runnable() {
                public void run() {
                    context.startActivity(intent);
                }
            };
        }
        if (daydreamUtilsWrapper.isDaydreamActivity(a)) {
            return new Runnable() {
                public void run() {
                    a.startActivity(intent);
                    a.finish();
                }
            };
        }
        return new Runnable() {
            public void run() {
                a.onBackPressed();
            }
        };
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void lambda$setDimmedUiTouchOverride$0$GvrUiLayoutImpl() {
        delayDimmingUiLayer(5000);
    }
}
