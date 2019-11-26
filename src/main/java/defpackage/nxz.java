package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: nxz */
final class nxz extends Handler {
    private final /* synthetic */ nxw a;

    public nxz(nxw nxw, Looper looper) {
        this.a = nxw;
        super(looper);
    }

    /* Access modifiers changed, original: final */
    public final Message a(int i, Object obj, boolean z) {
        return obtainMessage(i, z, 0, obj);
    }

    public final void handleMessage(Message message) {
        Object a;
        try {
            int i = message.what;
            if (i == 0) {
                a = this.a.h.a((oed) message.obj);
            } else if (i == 1) {
                a = this.a.h.a((odz) message.obj);
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            if (message.arg1 == 1) {
                int i2 = message.arg2 + 1;
                if (i2 <= this.a.f) {
                    message = Message.obtain(message);
                    message.arg2 = i2;
                    sendMessageDelayed(message, (long) Math.min((i2 - 1) * 1000, 5000));
                    return;
                }
            }
            a = e;
        }
        this.a.i.obtainMessage(message.what, a).sendToTarget();
    }
}
