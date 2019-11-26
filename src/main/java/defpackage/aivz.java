package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: aivz */
final class aivz extends Handler {
    private final /* synthetic */ aivw a;

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.c(message.arg1);
        }
    }

    /* synthetic */ aivz(aivw aivw, Looper looper) {
        this.a = aivw;
        super(looper);
    }
}
