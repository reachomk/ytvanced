package defpackage;

import android.os.RemoteException;

@qlp
/* renamed from: pbl */
public final class pbl {
    private final Object a = new Object();
    private rmt b;
    private pbo c;

    public final void a(rmt rmt) {
        synchronized (this.a) {
            this.b = rmt;
            Object obj = this.c;
            if (obj != null) {
                pzr.a(obj, (Object) "VideoLifecycleCallbacks may not be null.");
                synchronized (this.a) {
                    this.c = obj;
                    rmt = this.b;
                    if (rmt == null) {
                    } else {
                        try {
                            rmt.a(new rnq());
                        } catch (RemoteException e) {
                            qml.a("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                        }
                    }
                }
            }
        }
    }

    public final rmt a() {
        rmt rmt;
        synchronized (this.a) {
            rmt = this.b;
        }
        return rmt;
    }
}
