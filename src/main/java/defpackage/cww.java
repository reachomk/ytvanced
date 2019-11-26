package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: cww */
final class cww extends Handler {
    private cww() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((Runnable) message.obj).run();
        } else if (i == 2 || i == 3) {
            ((Runnable) message.obj).run();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* synthetic */ cww(byte b) {
        super(Looper.getMainLooper());
    }
}
