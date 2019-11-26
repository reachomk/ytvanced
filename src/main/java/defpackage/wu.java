package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: wu */
final class wu extends Handler {
    private final /* synthetic */ wv a;

    wu(wv wvVar, Looper looper) {
        this.a = wvVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            ww wwVar = (ww) this.a.b.get();
            if (wwVar != null) {
                wwVar.a((vk) message.obj);
                this.a.a();
                wwVar.a(null);
            }
        }
    }
}
