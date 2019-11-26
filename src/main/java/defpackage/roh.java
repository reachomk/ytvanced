package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@qlp
/* renamed from: roh */
public final class roh extends qou {
    public static final Creator CREATOR = new rok();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final rnp f;
    private final boolean g;

    public roh(pcf pcf) {
        boolean z = pcf.a;
        int i = pcf.b;
        boolean z2 = pcf.c;
        int i2 = pcf.d;
        pbn pbn = pcf.e;
        rnp rnp = pbn != null ? new rnp(pbn) : null;
        this(3, z, i, z2, i2, rnp, false);
    }

    public roh(int i, boolean z, int i2, boolean z2, int i3, rnp rnp, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = i3;
        this.f = rnp;
        this.g = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.b(parcel, 3, this.c);
        qov.a(parcel, 4, this.d);
        qov.b(parcel, 5, this.e);
        qov.a(parcel, 6, this.f, i);
        qov.a(parcel, 7, this.g);
        qov.a(parcel, a);
    }
}
