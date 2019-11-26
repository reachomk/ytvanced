package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: cgp */
final class cgp implements Callback {
    cgp() {
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        cgu cgu = (cgq) message.obj;
        cgu.a.a(cgu);
        return true;
    }
}
