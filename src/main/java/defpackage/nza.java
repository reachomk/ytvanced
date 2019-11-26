package defpackage;

import android.content.Context;

/* renamed from: nza */
public final class nza {
    private static oux a;

    public static synchronized oux a(Context context) {
        oux oux;
        synchronized (nza.class) {
            if (a == null) {
                ovq ovq = new ovq(context);
                a = new ovo(ovq.a, ovq.b, ovq.c, ovq.d, (byte) 0);
            }
            oux = a;
        }
        return oux;
    }
}
