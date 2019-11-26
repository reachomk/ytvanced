package defpackage;

import android.content.Intent;
import android.util.Log;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* renamed from: baiw */
public final /* synthetic */ class baiw implements Runnable {
    private final ControllerServiceBridge a;

    public baiw(ControllerServiceBridge controllerServiceBridge) {
        this.a = controllerServiceBridge;
    }

    public final void run() {
        ControllerServiceBridge controllerServiceBridge = this.a;
        ControllerServiceBridge.c();
        String str = "VrCtl.ServiceBridge";
        if (controllerServiceBridge.f) {
            Log.w(str, "Service is already bound.");
            return;
        }
        Intent intent = new Intent("com.google.vr.vrcore.controller.BIND");
        intent.setPackage("com.google.vr.vrcore");
        if (!controllerServiceBridge.a.bindService(intent, controllerServiceBridge, 1)) {
            Log.w(str, "Bind failed. Service is not available.");
            controllerServiceBridge.e.a.onServiceUnavailable();
        }
        controllerServiceBridge.f = true;
    }
}
