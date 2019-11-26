package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: cwx */
public final class cwx extends coj {
    private final WeakReference d;

    cwx(cwo cwo) {
        this.d = new WeakReference(cwo);
    }

    public final /* synthetic */ void a(Object obj) {
        cwo cwo = (cwo) this.d.get();
        if (cwo != null) {
            if (cwo.d != null) {
                throw null;
            } else if (cro.a()) {
                cwo.a(0);
            } else {
                cwo.b.obtainMessage(3, new cwn(cwo)).sendToTarget();
            }
        }
    }
}
