package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: img */
final class img extends Handler {
    private final /* synthetic */ ima a;

    img(ima ima, Looper looper) {
        this.a = ima;
        super(looper);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2) {
        removeMessages(i);
        sendEmptyMessageDelayed(i, (long) i2);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1 || i == 2) {
            this.a.a();
        }
    }
}
