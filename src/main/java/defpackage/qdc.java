package defpackage;

import android.content.Context;

/* renamed from: qdc */
public final class qdc implements qcz {
    public final qdl a(Context context, String str, qdi qdi) {
        qdl qdl = new qdl();
        int a = qdi.a(context, str);
        qdl.a = a;
        if (a != 0) {
            qdl.c = -1;
        } else {
            int a2 = qdi.a(context, str, true);
            qdl.b = a2;
            if (a2 != 0) {
                qdl.c = 1;
            }
        }
        return qdl;
    }
}
