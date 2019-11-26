package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cay */
public final class cay implements bzq {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    private final bzq b;

    public cay(bzq bzq) {
        this.b = bzq;
    }

    public final /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    public final /* synthetic */ bzp a(Object obj, int i, int i2, bsq bsq) {
        return this.b.a(new bzc(((Uri) obj).toString()), i, i2, bsq);
    }
}
