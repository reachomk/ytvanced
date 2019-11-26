package defpackage;

import android.content.Context;

/* renamed from: xik */
public final class xik {
    public static bciz a(Context context) {
        for (bcjg bcjg : bcjg.a(context)) {
            if (bcjg.b().equals("Fallback-Cronet-Provider")) {
                bcjg.d();
                return bcjg.a().a();
            }
        }
        throw new IllegalStateException("Fallback CronetEngine provider not found");
    }
}
