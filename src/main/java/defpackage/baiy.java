package defpackage;

import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* renamed from: baiy */
public final /* synthetic */ class baiy implements Runnable {
    private final ControllerServiceBridge a;
    private final int b;
    private final bais c;

    public baiy(ControllerServiceBridge controllerServiceBridge, int i, bais bais) {
        this.a = controllerServiceBridge;
        this.b = i;
        this.c = bais;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
