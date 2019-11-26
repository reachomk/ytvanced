package defpackage;

import android.content.Context;

/* renamed from: qdf */
public final class qdf implements qcz {
    public final qdl a(Context context, String str, qdi qdi) {
        qdl qdl = new qdl();
        qdl.a = qdi.a(context, str);
        int a = qdi.a(context, str, true);
        qdl.b = a;
        int i = qdl.a;
        if (i == 0 && a == 0) {
            qdl.c = 0;
        } else if (i >= a) {
            qdl.c = -1;
        } else {
            qdl.c = 1;
        }
        return qdl;
    }
}
