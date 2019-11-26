package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bpc */
public final class bpc implements bke {
    private static final Set a = new HashSet();

    public final void a(String str) {
        a(str, null);
    }

    public final void a(String str, Throwable th) {
        if (!a.contains(str)) {
            Log.w("LOTTIE", str, th);
            a.add(str);
        }
    }
}
