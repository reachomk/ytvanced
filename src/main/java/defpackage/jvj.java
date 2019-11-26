package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: jvj */
public final class jvj extends Handler {
    private final WeakReference a;

    jvj(jvf jvf) {
        this.a = new WeakReference(jvf);
    }

    public final void handleMessage(Message message) {
        jvf jvf = (jvf) this.a.get();
        if (jvf != null && message.what == 1 && jvf.d.c() == ejd.NONE) {
            ffx ffx = jvf.f;
            if (ffx != null && ffx.g()) {
                if (foh.I(jvf.a)) {
                    jvf.b.f();
                } else {
                    jvf.c.a(jvf.f, 2);
                }
            }
        }
    }
}
