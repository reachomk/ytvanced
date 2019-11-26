package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Locale;

/* renamed from: phj */
public final class phj extends qou {
    public static final Creator CREATOR = new phy();
    private final phe a;
    private final long b;
    private final int c;
    private final String d;
    private final phb e;
    private final boolean f;
    private final int g;
    private final int h;
    private final String i;

    phj(phe phe, long j, int i, String str, phb phb, boolean z, int i2, int i3, String str2) {
        this.a = phe;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = phb;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.a, i);
        qov.a(parcel, 2, this.b);
        qov.b(parcel, 3, this.c);
        qov.a(parcel, 4, this.d);
        qov.a(parcel, 5, this.e, i);
        qov.a(parcel, 6, this.f);
        qov.b(parcel, 7, this.g);
        qov.b(parcel, 8, this.h);
        qov.a(parcel, 9, this.i);
        qov.a(parcel, a);
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.h)});
    }
}
