package defpackage;

import android.content.Context;

/* renamed from: qde */
public final class qde implements qcz {
    public final qdl a(Context context, String str, qdi qdi) {
        int a;
        qdl qdl = new qdl();
        int a2 = qdi.a(context, str);
        qdl.a = a2;
        if (a2 != 0) {
            a = qdi.a(context, str, false);
            qdl.b = a;
        } else {
            a = qdi.a(context, str, true);
            qdl.b = a;
        }
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
