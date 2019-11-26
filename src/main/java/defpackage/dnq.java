package defpackage;

import android.os.Build.VERSION;
import java.util.Set;

/* renamed from: dnq */
public final class dnq implements baqa {
    public static Set a() {
        Object obj;
        if (VERSION.SDK_INT >= 21) {
            obj = amwp.a;
        } else {
            obj = amuw.a(new xrv("com.google.android.youtube.permission.C2D_MESSAGE"));
        }
        return (Set) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dnq.a();
    }

    static {
        dnq dnq = new dnq();
    }
}
