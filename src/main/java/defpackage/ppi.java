package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: ppi */
public final class ppi extends qou {
    public static final Creator CREATOR = new ppl();
    public double a;
    public boolean b;
    public int c;
    public pjb d;
    public int e;
    public pjp f;

    ppi(double d, boolean z, int i, pjb pjb, int i2, pjp pjp) {
        this.a = d;
        this.b = z;
        this.c = i;
        this.d = pjb;
        this.e = i2;
        this.f = pjp;
    }

    public ppi() {
        this(Double.NaN, false, -1, null, -1, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.b(parcel, 4, this.c);
        qov.a(parcel, 5, this.d, i);
        qov.b(parcel, 6, this.e);
        qov.a(parcel, 7, this.f, i);
        qov.a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ppi) {
            ppi ppi = (ppi) obj;
            if (this.a == ppi.a && this.b == ppi.b && this.c == ppi.c && ppj.a(this.d, ppi.d) && this.e == ppi.e) {
                pjp pjp = this.f;
                if (ppj.a(pjp, pjp)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f});
    }
}
