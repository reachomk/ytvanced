package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: admt */
final class admt extends Handler {
    private final /* synthetic */ adms a;

    admt(adms adms, Looper looper) {
        this.a = adms;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (message.what == 1 && this.a.f.d() != 2) {
            this.a.a(0);
            this.a.e.sendMessageDelayed(Message.obtain(this, 1), 1000);
        }
    }
}
