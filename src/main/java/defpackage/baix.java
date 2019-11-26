package defpackage;

import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* renamed from: baix */
public final /* synthetic */ class baix implements Runnable {
    private final ControllerServiceBridge a;
    private final int b;
    private final bais c;

    public baix(ControllerServiceBridge controllerServiceBridge, int i, bais bais) {
        this.a = controllerServiceBridge;
        this.b = i;
        this.c = bais;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
