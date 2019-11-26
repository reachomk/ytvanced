package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: zif */
final class zif extends Handler {
    private final WeakReference a;

    zif(WeakReference weakReference) {
        this.a = weakReference;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            zhu zhu = (zhu) this.a.get();
            if (zhu != null && zhu.F_()) {
                zhu.an.setText(zhu.a(System.currentTimeMillis() - zhu.aj));
            }
        }
    }
}
