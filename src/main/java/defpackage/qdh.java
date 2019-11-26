package defpackage;

import android.content.Context;

/* renamed from: qdh */
public final class qdh implements qcz {
    public final qdl a(Context context, String str, qdi qdi) {
        qdl qdl = new qdl();
        qdl.a = qdi.a(context, str);
        int a = qdi.a(context, str, true);
        qdl.b = a;
        int i = qdl.a;
        if (i == 0 && a == 0) {
            qdl.c = 0;
        } else if (a >= i) {
            qdl.c = 1;
        } else {
            qdl.c = -1;
        }
        return qdl;
    }
}
