package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: puo */
public final class puo {
    public static void a(Status status, ryl ryl) {
        puo.a(status, null, ryl);
    }

    public static void a(Status status, Object obj, ryl ryl) {
        if (status.b()) {
            ryl.a(obj);
        } else {
            ryl.a(new psx(status));
        }
    }
}
