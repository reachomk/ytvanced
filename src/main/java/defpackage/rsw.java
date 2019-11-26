package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: rsw */
public final class rsw extends qou {
    public static final Creator CREATOR = new rti();
    private final int a;
    private final String b;
    private final rta c;
    private final rsu d;
    private final int e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final String i;
    private final double j;

    public rsw(int i, String str, String str2, rta rta, rsu rsu, int i2, String str3, boolean z, boolean z2, double d) {
        this.a = i;
        this.b = str;
        this.i = str2;
        this.c = rta;
        this.d = rsu;
        this.e = i2;
        this.f = str3;
        this.g = z;
        this.h = z2;
        this.j = d;
    }

    private final String a() {
        if (TextUtils.isEmpty(this.i)) {
            return this.b;
        }
        return this.i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c, i);
        qov.a(parcel, 5, this.d, i);
        qov.b(parcel, 6, this.e);
        qov.a(parcel, 7, this.f);
        qov.a(parcel, 8, this.g);
        qov.a(parcel, 9, this.h);
        qov.a(parcel, 10, a());
        qov.a(parcel, 11, this.j);
        qov.a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rsw)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        rsw rsw = (rsw) obj;
        return pzj.a(this.b, rsw.b) && pzj.a(a(), rsw.a()) && pzj.a(Integer.valueOf(this.a), Integer.valueOf(rsw.a)) && pzj.a(this.c, rsw.c) && pzj.a(this.d, rsw.d) && pzj.a(Integer.valueOf(this.e), Integer.valueOf(rsw.e)) && pzj.a(this.f, rsw.f) && pzj.a(Boolean.valueOf(this.g), Boolean.valueOf(rsw.g)) && pzj.a(Boolean.valueOf(this.h), Boolean.valueOf(rsw.h)) && pzj.a(Double.valueOf(this.j), Double.valueOf(rsw.j));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.i, Integer.valueOf(this.a), this.c, this.d, Integer.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Double.valueOf(this.j)});
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("value", this.b);
        a.a("canonicalValue", this.i);
        a.a("getContactMethodType", Integer.valueOf(this.a));
        a.a("matchInfo", this.c);
        a.a("metadata", this.d);
        a.a("classificationType", Integer.valueOf(this.e));
        a.a("label", this.f);
        a.a("isPrimary", Boolean.valueOf(this.g));
        a.a("isSuperPrimary", Boolean.valueOf(this.h));
        a.a("score", Double.valueOf(this.j));
        return a.toString();
    }
}
