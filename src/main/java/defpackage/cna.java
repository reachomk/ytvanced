package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.litho.ComponentTree;

/* renamed from: cna */
public final class cna extends Handler {
    private cna() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            ((ComponentTree) message.obj).b();
            return;
        }
        throw new IllegalArgumentException();
    }

    public /* synthetic */ cna(byte b) {
        super(Looper.getMainLooper());
    }
}
