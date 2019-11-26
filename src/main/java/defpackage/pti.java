package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.Status;

/* renamed from: pti */
public final class pti {
    public static ptg a(Status status) {
        pzr.a((Object) status, (Object) "Result must not be null");
        pum pum = new pum(Looper.getMainLooper());
        pum.a((ptn) status);
        return pum;
    }
}
