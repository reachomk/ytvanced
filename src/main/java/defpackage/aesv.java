package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: aesv */
final class aesv extends Handler {
    private final /* synthetic */ aesp a;

    public aesv(aesp aesp, Looper looper) {
        this.a = aesp;
        super(looper);
    }

    public final void handleMessage(Message message) {
        Object e;
        try {
            int i = message.what;
            if (i == 0) {
                e = this.a.d.a((nqi) message.obj);
            } else if (i == 1) {
                e = this.a.d.a((nqd) message.obj);
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e2) {
            e = e2;
        }
        this.a.e.obtainMessage(message.what, e).sendToTarget();
    }
}
