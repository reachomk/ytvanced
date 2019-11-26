package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: pjp */
public final class pjp extends qou {
    public static final Creator CREATOR = new pps();
    private final pjm a;
    private final pjm b;

    public pjp(pjm pjm, pjm pjm2) {
        this.a = pjm;
        this.b = pjm2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a, i);
        qov.a(parcel, 3, this.b, i);
        qov.a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pjp) {
            pjp pjp = (pjp) obj;
            return ppj.a(this.a, pjp.a) && ppj.a(this.b, pjp.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
