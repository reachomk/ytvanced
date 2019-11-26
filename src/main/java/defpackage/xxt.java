package defpackage;

import android.text.TextUtils;

/* renamed from: xxt */
final /* synthetic */ class xxt implements Runnable {
    private final xxp a;
    private final ycp b;
    private final Object c;

    xxt(xxp xxp, ycp ycp, Object obj) {
        this.a = xxp;
        this.b = ycp;
        this.c = obj;
    }

    public final void run() {
        xxp xxp = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        if (xxp.h.contains(obj)) {
            xxp.h.a(obj, obj2);
            return;
        }
        for (int i = 0; i < xxp.h.size(); i++) {
            if (TextUtils.equals(xxp.c(xxp.h.get(i)), xxp.c(obj))) {
                xxp.h.a(i, obj2);
                return;
            }
        }
    }
}
