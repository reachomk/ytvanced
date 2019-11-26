package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: adqn */
final class adqn extends Handler {
    private final /* synthetic */ adqo a;

    public adqn(adqo adqo) {
        this.a = adqo;
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                this.a.b(message.arg1);
            }
            return;
        }
        this.a.a();
    }
}
