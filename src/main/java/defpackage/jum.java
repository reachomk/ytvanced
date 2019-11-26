package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: jum */
final class jum extends Handler {
    private final /* synthetic */ jun a;

    jum(jun jun, Looper looper) {
        this.a = jun;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (message.what == 23998) {
            this.a.f();
        }
    }
}
