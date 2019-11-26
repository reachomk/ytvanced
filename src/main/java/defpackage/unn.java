package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: unn */
final class unn extends Handler {
    private final /* synthetic */ unk a;

    unn(unk unk) {
        this.a = unk;
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            String valueOf = String.valueOf(message.toString());
            String str = "Unhandled message: ";
            ujo.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            return;
        }
        this.a.a.f();
        this.a.b.f();
        this.a.a.g();
        this.a.b.g();
        this.a.c.quit();
    }
}
