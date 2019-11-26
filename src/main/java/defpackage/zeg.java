package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: zeg */
public abstract class zeg {
    public abstract zdz a();

    public abstract boolean b();

    public abstract Collection c();

    public static zeg a(zdz zdz, boolean z, Uri... uriArr) {
        return new zds(zdz, z, Arrays.asList(uriArr));
    }
}
