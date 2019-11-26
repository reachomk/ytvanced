package defpackage;

import android.location.Location;
import java.util.Date;
import java.util.Set;

@qlp
/* renamed from: qjw */
public final class qjw implements pdf {
    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final boolean g;

    public qjw(Date date, int i, Set set, Location location, boolean z, int i2, boolean z2) {
        this.a = date;
        this.b = i;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = z2;
    }

    @Deprecated
    public final Date a() {
        return this.a;
    }

    @Deprecated
    public final int b() {
        return this.b;
    }

    public final Set c() {
        return this.c;
    }

    public final Location d() {
        return this.e;
    }

    public final boolean f() {
        return this.d;
    }

    public final int e() {
        return this.f;
    }

    @Deprecated
    public final boolean g() {
        return this.g;
    }
}
