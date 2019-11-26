package defpackage;

import android.content.Context;

/* renamed from: qdd */
public final class qdd implements qcz {
    public final qdl a(Context context, String str, qdi qdi) {
        qdl qdl = new qdl();
        int a = qdi.a(context, str, true);
        qdl.b = a;
        if (a != 0) {
            qdl.c = 1;
        } else {
            int a2 = qdi.a(context, str);
            qdl.a = a2;
            if (a2 != 0) {
                qdl.c = -1;
            }
        }
        return qdl;
    }
}
