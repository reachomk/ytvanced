package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: cdz */
final class cdz implements Callback {
    private final /* synthetic */ cdy a;

    cdz(cdy cdy) {
        this.a = cdy;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.a.a((cdx) message.obj);
            return true;
        }
        if (message.what == 2) {
            this.a.c.a((cdx) message.obj);
        }
        return false;
    }
}
