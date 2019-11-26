package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* renamed from: ahot */
final class ahot extends Handler {
    private final WeakReference a;

    ahot(ahoq ahoq) {
        this.a = new WeakReference((ahoq) amqw.a((Object) ahoq));
    }

    public final void handleMessage(Message message) {
        ahoq ahoq = (ahoq) this.a.get();
        if (ahoq != null) {
            afkj afkj;
            if (message.what != 0) {
                boolean z = true;
                if (message.what == 1) {
                    ahoq.a = null;
                    ahoq.b = (aewz) message.obj;
                    ahoq.c = (ofb) message.obj;
                    afkj = ahoq.f;
                    if (afkj != null) {
                        afkj.d();
                    }
                    ahoq.s();
                    return;
                } else if (message.what == 2) {
                    if (message.arg1 <= 0) {
                        z = false;
                    }
                    ahoq.h = z;
                    ahoq.a(ahoq.getLeft(), ahoq.getTop(), ahoq.getRight(), ahoq.getBottom());
                    return;
                } else {
                    if (message.what == 3) {
                        afkj afkj2 = ahoq.f;
                        if (afkj2 != null) {
                            afkj2.e();
                        }
                    }
                    super.handleMessage(message);
                    return;
                }
            }
            ahoq.b = null;
            ahoq.c = null;
            ahoq.a = (Surface) message.obj;
            afkj = ahoq.f;
            if (afkj != null) {
                afkj.a();
            }
        }
    }
}
