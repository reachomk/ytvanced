package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: juq */
final class juq extends Handler {
    private final /* synthetic */ jur a;

    juq(jur jur, Looper looper) {
        this.a = jur;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (message.what == 0) {
            ffu ffu = this.a.a;
            if (!jur.a(ffu.a())) {
                jur.a(ffu.b(), 0);
            }
        }
    }
}
