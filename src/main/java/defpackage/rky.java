package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

@qlp
/* renamed from: rky */
public final class rky extends qou {
    public static final Creator CREATOR = new rkx();
    @Deprecated
    public final long a;
    @Deprecated
    public final int b;
    public final List c;
    public final boolean d;
    public final int e;
    public final Location f;
    public final Bundle g;
    @Deprecated
    public final boolean h;
    private final int i;
    private final Bundle j;
    private final boolean k;
    private final String l;
    private final rno m;
    private final String n;
    private final Bundle o;
    private final List p;
    private final String q;
    private final String r;

    public rky(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, rno rno, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3) {
        this.i = i;
        this.a = j;
        this.j = bundle == null ? new Bundle() : bundle;
        this.b = i2;
        this.c = list;
        this.d = z;
        this.e = i3;
        this.k = z2;
        this.l = str;
        this.m = rno;
        this.f = location;
        this.n = str2;
        this.g = bundle2 == null ? new Bundle() : bundle2;
        this.o = bundle3;
        this.p = list2;
        this.q = str3;
        this.r = str4;
        this.h = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.i);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.j);
        qov.b(parcel, 4, this.b);
        qov.a(parcel, 5, this.c);
        qov.a(parcel, 6, this.d);
        qov.b(parcel, 7, this.e);
        qov.a(parcel, 8, this.k);
        qov.a(parcel, 9, this.l);
        qov.a(parcel, 10, this.m, i);
        qov.a(parcel, 11, this.f, i);
        qov.a(parcel, 12, this.n);
        qov.a(parcel, 13, this.g);
        qov.a(parcel, 14, this.o);
        qov.a(parcel, 15, this.p);
        qov.a(parcel, 16, this.q);
        qov.a(parcel, 17, this.r);
        qov.a(parcel, 18, this.h);
        qov.a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rky) {
            rky rky = (rky) obj;
            if (this.i == rky.i && this.a == rky.a && pzj.a(this.j, rky.j) && this.b == rky.b && pzj.a(this.c, rky.c) && this.d == rky.d && this.e == rky.e && this.k == rky.k && pzj.a(this.l, rky.l) && pzj.a(this.m, rky.m) && pzj.a(this.f, rky.f) && pzj.a(this.n, rky.n) && pzj.a(this.g, rky.g) && pzj.a(this.o, rky.o) && pzj.a(this.p, rky.p) && pzj.a(this.q, rky.q) && pzj.a(this.r, rky.r) && this.h == rky.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i), Long.valueOf(this.a), this.j, Integer.valueOf(this.b), this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.k), this.l, this.m, this.f, this.n, this.g, this.o, this.p, this.q, this.r, Boolean.valueOf(this.h)});
    }
}
