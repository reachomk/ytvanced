package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@qlp
/* renamed from: rnb */
public final class rnb {
    public final Date a;
    public final String b = null;
    public final int c;
    public final Set d;
    public final Location e;
    public final boolean f;
    public final Bundle g;
    public final Map h;
    public final String i;
    public final String j;
    public final int k;
    public final Set l;
    public final Bundle m;
    public final Set n;
    public final boolean o;

    public rnb(rne rne) {
        this.a = rne.g;
        this.c = rne.h;
        this.d = Collections.unmodifiableSet(rne.a);
        this.e = rne.i;
        this.f = false;
        this.g = rne.b;
        this.h = Collections.unmodifiableMap(rne.c);
        this.i = null;
        this.j = null;
        this.k = rne.j;
        this.l = Collections.unmodifiableSet(rne.d);
        this.m = rne.e;
        this.n = Collections.unmodifiableSet(rne.f);
        this.o = rne.k;
    }
}
