package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: puj */
final class puj extends Handler {
    private final /* synthetic */ pue a;

    public puj(pue pue, Looper looper) {
        this.a = pue;
        super(looper);
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        pzr.b(z);
        pug pug = (pug) message.obj;
        Object obj = this.a.a;
        if (obj == null) {
            pug.a();
            return;
        }
        try {
            pug.a(obj);
        } catch (RuntimeException e) {
            pug.a();
            throw e;
        }
    }
}
