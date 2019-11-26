package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* renamed from: baiz */
final /* synthetic */ class baiz implements Runnable {
    private final ControllerServiceBridge a;

    baiz(ControllerServiceBridge controllerServiceBridge) {
        this.a = controllerServiceBridge;
    }

    public final void run() {
        ControllerServiceBridge controllerServiceBridge = this.a;
        ControllerServiceBridge.c();
        baji baji = controllerServiceBridge.d;
        if (baji != null) {
            try {
                if (baji.b() > 0) {
                    if (controllerServiceBridge.f) {
                        controllerServiceBridge.b();
                        return;
                    }
                }
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 54);
                stringBuilder.append("Remote exception while getting number of controllers: ");
                stringBuilder.append(valueOf);
                Log.w("VrCtl.ServiceBridge", stringBuilder.toString());
            }
        }
        int size = controllerServiceBridge.c.size();
        for (int i = 0; i < size; i++) {
            bajd bajd = (bajd) controllerServiceBridge.c.valueAt(i);
            if (bajd != null) {
                bajd.a.onControllerStateChanged(i, 0);
            }
        }
        ControllerServiceBridge.c();
        controllerServiceBridge.c.clear();
        controllerServiceBridge.e.a.onServiceDisconnected();
    }
}
