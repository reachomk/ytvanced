package defpackage;

import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* renamed from: baiv */
public final /* synthetic */ class baiv implements Runnable {
    private final ControllerServiceBridge a;

    public baiv(ControllerServiceBridge controllerServiceBridge) {
        this.a = controllerServiceBridge;
    }

    public final void run() {
        this.a.a();
    }
}
