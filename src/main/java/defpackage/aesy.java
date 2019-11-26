package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: aesy */
final class aesy extends Handler {
    private final /* synthetic */ aesp a;

    public aesy(aesp aesp, Looper looper) {
        this.a = aesp;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.a.a(message.obj);
        } else if (i == 1) {
            aesp aesp = this.a;
            Object obj = message.obj;
            int i2 = aesp.h;
            if (i2 != 3 && i2 != 4) {
                return;
            }
            if (obj instanceof Exception) {
                aesp.a((Exception) obj);
                return;
            }
            aesp.b.m();
            aesp.b.n();
            try {
                aesp.a.a(aesp.i, (byte[]) obj);
                aesp.h = 4;
            } catch (Exception e) {
                aesp.a(e);
            }
            aesp.a(aesp.a, aesp.i);
            aesp.b.o();
        }
    }
}
