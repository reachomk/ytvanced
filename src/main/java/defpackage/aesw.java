package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: aesw */
final class aesw extends Handler {
    private final /* synthetic */ aesp a;

    public aesw(aesp aesp, Looper looper) {
        this.a = aesp;
        super(looper);
    }

    public final void handleMessage(Message message) {
        aesp aesp = this.a;
        if (aesp.g != 0) {
            int i = aesp.h;
            if (i == 3 || i == 4) {
                int i2 = message.what;
                if (i2 == 1) {
                    this.a.h = 3;
                    this.a.j();
                } else if (i2 == 2) {
                    this.a.g();
                } else if (i2 == 3) {
                    this.a.h = 3;
                    this.a.b(new nqq());
                }
            }
        }
    }
}
