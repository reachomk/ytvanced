package defpackage;

import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import java.lang.ref.WeakReference;

/* renamed from: baja */
public final class baja extends bajm {
    private final WeakReference a;

    public baja(ControllerServiceBridge controllerServiceBridge) {
        this.a = new WeakReference(controllerServiceBridge);
    }

    public final int a() {
        return 25;
    }

    public final void a(int i) {
        ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge) this.a.get();
        if (controllerServiceBridge != null && i == 1) {
            controllerServiceBridge.b.post(new baiz(controllerServiceBridge));
        }
    }
}
