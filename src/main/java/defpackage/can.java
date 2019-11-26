package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: can */
public final class can implements bzq {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    private final cas b;

    public can(cas cas) {
        this.b = cas;
    }

    public final /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    public final /* synthetic */ bzp a(Object obj, int i, int i2, bsq bsq) {
        Uri uri = (Uri) obj;
        return new bzp(new chi(uri), this.b.a(uri));
    }
}
