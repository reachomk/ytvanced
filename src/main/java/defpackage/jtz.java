package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: jtz */
final /* synthetic */ class jtz implements Callback {
    private final jtw a;

    jtz(jtw jtw) {
        this.a = jtw;
    }

    public final boolean handleMessage(Message message) {
        jtw jtw = this.a;
        boolean z = false;
        if (message.what == 1) {
            if (jtw.d.isEmpty()) {
                z = true;
            } else {
                jtw.a();
                jtw.a(0);
                return true;
            }
        }
        return z;
    }
}
