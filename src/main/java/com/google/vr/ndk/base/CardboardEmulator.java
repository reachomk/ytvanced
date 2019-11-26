package com.google.vr.ndk.base;

import android.content.Context;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks;
import defpackage.bagi;
import defpackage.baif;
import defpackage.baig;
import defpackage.baii;
import defpackage.baio;

class CardboardEmulator {
    public static final String TAG = CardboardEmulator.class.getSimpleName();
    public final ControllerServiceBridge controllerServiceBridge;
    public boolean resumed;

    class ControllerCallbacks implements Callbacks {
        public final Runnable cardboardTriggerCallback;

        ControllerCallbacks(Runnable runnable) {
            this.cardboardTriggerCallback = runnable;
        }

        public void onControllerRecentered(baio baio) {
        }

        public void onControllerStateChanged(int i, int i2) {
        }

        public void onServiceConnected(int i) {
        }

        public void onServiceDisconnected() {
        }

        public void onServiceFailed() {
        }

        public void onServiceInitFailed(int i) {
        }

        public void onServiceUnavailable() {
        }

        public void onControllerEventPacket(baig baig) {
            for (int i = 0; i < baig.e; i++) {
                baif b = baig.b(i);
                if (b.b) {
                    int i2 = b.a;
                    if (i2 == 1 || i2 == 3 || i2 == 7) {
                        bagi.a(this.cardboardTriggerCallback);
                    }
                }
            }
        }

        public void onControllerEventPacket2(baii baii) {
            onControllerEventPacket(baii);
        }
    }

    public CardboardEmulator(Context context, Runnable runnable) {
        this.controllerServiceBridge = createServiceBridge(context, new ControllerCallbacks(runnable));
    }

    public void onResume() {
        if (!this.resumed) {
            this.resumed = true;
            this.controllerServiceBridge.requestBind();
        }
    }

    public void onPause() {
        if (this.resumed) {
            this.resumed = false;
            this.controllerServiceBridge.requestUnbind();
        }
    }

    /* Access modifiers changed, original: protected */
    public ControllerServiceBridge createServiceBridge(Context context, Callbacks callbacks) {
        return new ControllerServiceBridge(context, callbacks, 0);
    }
}
