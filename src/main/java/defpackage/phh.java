package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: phh */
public final class phh extends qou {
    public static final Creator CREATOR = new pht();
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final String f;
    private final phg[] g;
    private final String h;
    private final phw i;

    phh(String str, String str2, boolean z, int i, boolean z2, String str3, phg[] phgArr, String str4, phw phw) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = str3;
        this.g = phgArr;
        this.h = str4;
        this.i = phw;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.b(parcel, 4, this.d);
        qov.a(parcel, 5, this.e);
        qov.a(parcel, 6, this.f);
        qov.a(parcel, 7, this.g, i);
        qov.a(parcel, 11, this.h);
        qov.a(parcel, 12, this.i, i);
        qov.a(parcel, a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof phh) {
            phh phh = (phh) obj;
            return this.c == phh.c && this.d == phh.d && this.e == phh.e && pzj.a(this.a, phh.a) && pzj.a(this.b, phh.b) && pzj.a(this.f, phh.f) && pzj.a(this.h, phh.h) && pzj.a(this.i, phh.i) && Arrays.equals(this.g, phh.g);
        }
    }
}
